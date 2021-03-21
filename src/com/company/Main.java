package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 20, 33, 44, 55));
    public static ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(5, 15, 25, 30, 35, 45, 65));
    public static ArrayList<Integer> result = new ArrayList<Integer>();
    private static Service service;

    public static void main(String[] args) {

        service.merge(firstList, secondList);
        System.out.print("fistList: [" );
        service.printList(firstList);
        System.out.print("secondList: [");
        service.printList(secondList);
    }
}
