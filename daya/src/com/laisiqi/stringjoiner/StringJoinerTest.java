package com.laisiqi.stringjoiner;


import java.util.StringJoiner;

//基础练习
public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("," , "[" , "]");
        sj.add("a").add("b").add("c").add("d");
        System.out.println(sj.toString());
    }
}
