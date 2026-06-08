package com.mariol;

public class App {
    public static void main(String[] args) {
        System.out.println("Java Algorithms and Data Structures");
        System.out.println("==================================");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack pop: " + stack.pop());

        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("LinkedList: " + list.toString());

        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int index = BinarySearch.search(arr, 7);
        System.out.println("BinarySearch for 7: index " + index);

        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(unsorted);
        System.out.print("BubbleSort: ");
        for (int n : unsorted) System.out.print(n + " ");
        System.out.println();
    }
}
