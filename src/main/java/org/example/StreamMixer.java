package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> result=new ArrayList<>();
        Iterator<T> iterator=second.iterator();
        first.filter(item-> iterator.hasNext())
                .forEach(firstElement ->{
                    result.add(firstElement);
                    result.add(iterator.next());
                });
        return result.stream();
    }
}
