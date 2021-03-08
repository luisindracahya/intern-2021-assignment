package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.WordUtils;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    private static String capitalize (String input) {

        return WordUtils.capitalizeFully(input);
    }

    public static Map<String, List<String>> convertToMap (List<Book> books) {

        return books.stream()
                .collect(Collectors.groupingBy(book -> capitalize(book.getAuthor()),
                        Collectors.mapping(book -> capitalize(book.getTitle()), Collectors.toList())));
    }
}
