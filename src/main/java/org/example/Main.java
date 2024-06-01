package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Ivan");
        names.add("Peter");
        names.add("Genna");
        names.add("Anton");
        names.add("Oleg");
//        FilterListOfNames filterListOfNames =new FilterListOfNames();
//        System.out.println("filterListOfNames.filtringList() = " + filterListOfNames.filtringList(names));
//        StringSorter stringSorter= new StringSorter();
//        System.out.println("stringSorter.alphabeticallSorting(names) = " + stringSorter.alphabeticallSorting(names));
        String[] arr=new String[]{"1, 2, 0", "4, 5"};
        ArraySorter arraySorter=new ArraySorter();
        arraySorter.sortingArray(arr);
//        RandomNumberGenerator randomNumberGenerator=new RandomNumberGenerator();
//        System.out.println("randomNumberGenerator.generator(25214903917L,11L,Math.pow(2,48)) = "
//                + randomNumberGenerator.generator(25214903917L, 11L, Math.pow(2, 48)));
//        Stream<Integer> stream1=Stream.of(1,2,3,4);
//        Stream<Integer> stream2=Stream.of(5,6,7,8);
//        StreamMixer streamMixer=new StreamMixer();
//        Stream<Integer> zip = streamMixer.zip(stream1, stream2);
//        System.out.println("zip.collect(Collectors.toList()) = " + zip.collect(Collectors.toList()));
    }
}