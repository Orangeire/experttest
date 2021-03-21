package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Service {

    public static ArrayList<Integer> result = new ArrayList<Integer>();

    public static void merge(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        firstList.addAll(secondList);
        Collections.sort(firstList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < (list.size() - 1); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println(list.get(list.size() - 1) + "]");
    }
}
