package com.mariol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testStackPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
    }

    @Test
    void testStackIsEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testStackPopEmptyThrows() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    void testLinkedListAdd() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        assertEquals(2, list.size());
        assertEquals("Hello", list.get(0));
    }

    @Test
    void testLinkedListRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        assertTrue(list.remove("Hello"));
        assertEquals(1, list.size());
    }

    @Test
    void testBinarySearchFound() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, BinarySearch.search(arr, 7));
    }

    @Test
    void testBinarySearchNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.search(arr, 4));
    }

    @Test
    void testBinarySearchRecursive() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.searchRecursive(arr, 5));
    }

    @Test
    void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(arr);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testBubbleSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}
