package org.example;


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter<E> {
    public List<String> alphabeticallSorting(List<E> stringList){
        return stringList.stream()
                .map(str -> str.toString().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
