package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumberGenerator{
    public List<Long> generator(long a, long c, double m){
        Stream<Long> stream=Stream.iterate(1L, x-> (a * x +c) %(long)m);
        return stream.
                limit(10)
                .toList();
    }
}