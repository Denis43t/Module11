package org.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FilterListOfNames<E> {
    public List<E> filtringList(List<E> names){
        AtomicInteger counter = new AtomicInteger(-1);
        return names.stream()
                .filter(name -> {
                    counter.getAndIncrement();
                    return counter.get()%2!=0 ? true : false;
                })
                .collect(Collectors.toList());
    }
}
