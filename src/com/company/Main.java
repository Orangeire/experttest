package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 20, 33, 44, 55));;
    private static ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(5, 15, 25, 30, 35, 45, 65));;

    public static void main(String[] args) {

        ArrayListService.merge(firstList, secondList);
        System.out.print("fistList: [" );
        ArrayListService.printList(firstList);
        System.out.print("secondList: [");
        ArrayListService.printList(secondList);
    }
}
