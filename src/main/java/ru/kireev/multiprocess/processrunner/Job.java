package ru.kireev.multiprocess.processrunner;

import java.util.stream.IntStream;

/*
from location: src/main/java
javac ru/kireev/processrunner/Job.java
java ru.kireev.processrunner.Job
 */
public class Job {

    public static void main(String[] args) {
        String propVal = System.getenv("propName");
        System.out.println("do job, propVal:" + propVal);
        IntStream.range(1, 100).forEach(System.out::println);
    }

}
