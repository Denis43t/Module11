package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySorter {

    Comparator comparator = (o1, o2) -> 0;
    public void sortingArray(String[] array){
        String last= String.valueOf(Arrays.stream(array)
                .map(str->List.of(str.split(",\s+")))
                .flatMap(Collection::stream)
                .sorted(Collections.reverseOrder()).findFirst().orElse(null));
        Arrays.stream(array)
                .map(str->List.of(str.split(",\s+")))
                .flatMap(Collection::stream)
                        .sorted()
                        .forEach(str -> {
                            if (last.equals(str)){
                                System.out.print(str);
                            }
                            else {
                                System.out.print(str + ", ");
                            }
                        });
    }
}