package org.engripaye.graphql.entity;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 703),
            new Book(2, "Gifted Hands", 433),
            new Book(3, "Key To Prosperity", 803),
            new Book(4, "Daily Devotion", 713),
            new Book(5, "Sunday Hours", 813)
    );
}
