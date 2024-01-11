package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Player> players= new ArrayList<>();

        players.add(new Player("Smith", 40.6, LocalDate.of(1988, 6, 2)));
        players.add(new Player("Warner", 50.2, LocalDate.of(1986, 10, 27)));
        players.add(new Player("Finch", 46.7, LocalDate.of(1986, 11, 17)));
        players.add(new Player("Lyon", 20.7, LocalDate.of(1987, 11, 20)));
        players.add(new Player("Maxwell", 50.2, LocalDate.of(1985, 11, 14)));


        List<Player> collect = players.stream().
                sorted(Comparator.comparing(Player::battingAverage).reversed().
                        thenComparing((o1, o2) -> o2.dateOfBirth().compareTo(o1.dateOfBirth()))
                        .thenComparing(Player::name)).collect(Collectors.toList());

        collect.forEach(e-> System.out.println(e));


         String arr[]= {"11", "4","54","32","2"};

        int i = Arrays.asList(arr).indexOf("54");

      int max = Arrays.stream(arr).skip(i + 1 ).mapToInt(Integer::parseInt).max().orElse(0);
       // System.out.println(max);

        String s= "566774544";
        long count = s.chars().filter(e -> Character.getNumericValue(e) == 7).count();
      //  System.out.println(count);

        String s1 =s.chars().distinct().toString();

        StringBuffer sf= new StringBuffer(s1);

        System.out.println(sf.reverse());
    }
    }




