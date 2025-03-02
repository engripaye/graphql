package org.engripaye.graphql.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 703, 1),
            new Book(2, "Gifted Hands", 433, 2),
            new Book(3, "Key To Prosperity", 803, 3),
            new Book(4, "Daily Devotion", 713, 4),
            new Book(5, "Sunday Hours", 813, 5)
    );

    public static Optional<Book> getBookById(Integer id) {

        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();

    }
}
