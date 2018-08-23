package com.concordia.com.concordia.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

        public static void main(String[] args) {
            List<String> test = new ArrayList<>();
            String s="hi";
            test.add("string");
            test.add(s);
            test.add(s+s);
            test.add(3,"bhanu");
            for (String s1 : test) {
                System.out.println(s1);
            }

        }
    }

