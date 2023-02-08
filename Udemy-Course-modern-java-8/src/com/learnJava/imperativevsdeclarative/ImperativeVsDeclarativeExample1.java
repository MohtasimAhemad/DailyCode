package com.learnJava.imperativevsdeclarative;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {


        int sum=0;
        for(int i=0;i<=100;i++){
                sum+=i;
        }
        System.out.println("Sum is : "+sum);



        int sum1= IntStream.rangeClosed(0,100)
                .parallel()
                .map(Integer::new)
                .sum();

        System.out.println("sum1 : " + sum1);

    }

}
