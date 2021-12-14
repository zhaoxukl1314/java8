package com.zhaoxu.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class chapter5_2a {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("John lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        Optional<String> collect = names.collect(Collectors.maxBy(Comparator.comparing(name -> name.length())));
        System.out.println(collect.get());
    }

}
