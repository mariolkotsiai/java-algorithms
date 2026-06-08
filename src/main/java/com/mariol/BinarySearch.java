package com.mariol;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int searchRecursive(int[] arr, int target) {
        return searchHelper(arr, target, 0, arr.length - 1);
    }

    private static int searchHelper(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return searchHelper(arr, target, mid + 1, right);
        return searchHelper(arr, target, left, mid - 1);
    }
}