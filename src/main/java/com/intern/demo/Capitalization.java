package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.WordUtils;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    private static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"

        return WordUtils.capitalizeFully(input);
    }

    public static Map<String, List<String>> convertToMap (List<Book> books) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>

        //        Map<String, List<String>> result = new HashMap<>();
//
//        for(Book book:books){
//            book.setAuthor(capitalize(book.getAuthor()));
//            book.setTitle(capitalize(book.getTitle()));
//            if(result.get(book.getAuthor()) != null){
//                result.get(book.getAuthor()).addAll(Collections.singletonList(book.getTitle()));
//            }
//            else {
//                List<String> titles = new ArrayList<>();
//                titles.add(book.getTitle());
//                result.put(book.getAuthor(), titles);
//            }
//        }
//
//        return result;

        return books.stream()
                .collect(Collectors.groupingBy(book -> capitalize(book.getAuthor()),
                        Collectors.mapping(book -> capitalize(book.getTitle()), Collectors.toList())));
    }
}
