package com.grpc;

import com.grpc_tutorial.Author;
import com.grpc_tutorial.Book;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Author> getAuthors() {
        return new ArrayList<Author>() {
            {
                add(Author.newBuilder().setAuthorId(1).setFirstName("Huy").setLastName("Tinh").build());
                add(Author.newBuilder().setAuthorId(2).setFirstName("Hong").setLastName("Anh").build());
                add(Author.newBuilder().setAuthorId(3).setFirstName("Ngoc").setLastName("Ngan").build());
                add(Author.newBuilder().setAuthorId(4).setFirstName("Quy").setLastName("Beu").build());
                add(Author.newBuilder().setAuthorId(5).setFirstName("Quynh").setLastName("Ngan").build());
            }
        };
    }

    public static List<Book> getBooks() {
        return new ArrayList<Book>() {
            {
                add(Book.newBuilder().setBookId(1).setTitle("A").setAuthId(5).setPrice(100000).build());
                add(Book.newBuilder().setBookId(2).setTitle("B").setAuthId(4).setPrice(120000).build());
                add(Book.newBuilder().setBookId(3).setTitle("C").setAuthId(3).setPrice(130000).build());
                add(Book.newBuilder().setBookId(4).setTitle("D").setAuthId(2).setPrice(140000).build());
                add(Book.newBuilder().setBookId(5).setTitle("E").setAuthId(1).setPrice(150000).build());
            }
        };
    }
}
