package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorter {

    Comparator comparator = (o1, o2) -> 0;
    public void sortingArray(String[] array){
        List<String> result=Arrays.stream(array)
                .map(str->List.of(str.split(",\s+")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
