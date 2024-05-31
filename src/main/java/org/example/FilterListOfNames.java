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
        String result = "";
        List<Integer> counter= IntStream.range(1, names.size())
                .filter(i-> i % 2 != 0)
                .boxed()
                .toList();
        for (int index=0; index<counter.size(); index++)
        {
            if (index==0){
                result+=names.get(counter.get(index));
            }
            else {
                result=result+", "+names.get(counter.get(index));
            }
        }
        return result;
    }
}