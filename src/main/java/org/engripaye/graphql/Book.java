package org.engripaye.graphql;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 703),
            new Book(2, "Gifted Hands", 433),
            new Book(1, "Key To Prosperity", 803),
            new Book(1, "Daily Devotion", 713)
    );
}
