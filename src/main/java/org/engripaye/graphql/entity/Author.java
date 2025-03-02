package org.engripaye.graphql.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Anointed Men Of God"),
            new Author(2, "Ben Carson"),
            new Author(3, "Engr. Ipaye Babatunde"),
            new Author(4, "Dr. D.K OLUKOYA"),
            new Author(5, "Pst. W.F KUMUYI")
    );

    public static Optional<Author> getAuthorById(Integer id) {

        return authors.stream()
                .filter(author -> author.id.equals(id))
                .findFirst();

    }
}
