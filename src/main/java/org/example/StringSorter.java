package org.example;


import java.util.List;
import java.util.stream.Collectors;

public class StringSorter<E> {
    public List<E> alphabeticallSorting(List<E> stringList){
        return stringList.stream()
                .peek(string -> string.toString().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}
