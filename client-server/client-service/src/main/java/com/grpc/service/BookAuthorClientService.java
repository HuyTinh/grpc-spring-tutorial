package com.grpc.service;

import com.google.protobuf.Descriptors;
import com.grpc_tutorial.Author;
import com.grpc_tutorial.BookAuthorServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class BookAuthorClientService {

    @GrpcClient("grpc-service")
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub synchronousClient;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int authorId) {
        Author authorRequest = Author.newBuilder().setAuthorId(authorId).build();

        Author authorResponse = synchronousClient.getAuthor(authorRequest);

        log.info("Get author response: {}", authorResponse);

        return authorResponse.getAllFields();
    }
}
