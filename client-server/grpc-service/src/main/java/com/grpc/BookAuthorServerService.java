package com.grpc;

import com.grpc_tutorial.Author;
import com.grpc_tutorial.BookAuthorServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {
    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        TempDB.getAuthors().stream()
                .filter(author -> author.getAuthorId() == request.getAuthorId())
                .findFirst().ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}
