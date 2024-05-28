package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMixer<T> {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> result=new ArrayList<>();
        Iterator<T> iterator1=first.iterator();
        Iterator<T> iterator2=second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()){
            result.add(iterator1.next());
            result.add(iterator2.next());
        }
        return result.stream();
    }
}
