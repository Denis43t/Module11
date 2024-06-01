package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterListOfNames<E> {
    public String filtringList(List<E> names) {
        StringBuilder result=new StringBuilder();
        List<Integer> counter= IntStream.range(1, names.size())
                .filter(i-> i % 2 != 0)
                .boxed()
                .toList();
        IntStream.iterate(0,n->n+1)
                .limit(counter.size())
                .forEach(element->{
                    if (element==0){
                        result.append(counter.get(element)).append(". ").append(names.get(counter.get(element)));
                    }
                    else {
                        result.append(", ").append(counter.get(element)).append(". ").append(names.get(counter.get(element)));
                    }
                });
        return String.valueOf(result);
    }
}