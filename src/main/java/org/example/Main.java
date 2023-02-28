package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        int[] arr = new int[3]; // 배열 선언
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0] + arr[1] + arr[2]); // 60 출력
        System.out.println(arr.length); // 고정길이: 3

        // ArrayList<Integer> al = new ArrayList<Integer>(); // v1
        // List<Integer> al = new ArrayList<Integer>(); // v2
        List<Integer> al = new ArrayList<>(); // v3
        al.add(10); // 0
        al.add(20); // 1
        al.add(30); // 2
        System.out.println(al.get(0) + al.get(1) + al.get(2)); // 60 출력
        System.out.println(al.size()); // 가변, 길이: 3
        al.add(40); // 3
        System.out.println(al.size()); // 가변, 길이: 4
    }
}