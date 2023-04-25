package com.allensarmiento.codingquestions.modules.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListTest {
  @Test
  void removeDuplicates() {
    LinkedList<Integer> list = new LinkedList<>();
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    list.addAll(Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4));
    list.removeDuplicates();
    assertArrayEquals(expected.toArray(), list.toArrayList().toArray());

    list = new LinkedList<>();
    list.removeDuplicates();
    expected = new ArrayList<>();
    assertArrayEquals(expected.toArray(), list.toArrayList().toArray());

    list = new LinkedList<>();
    list.addAll(Arrays.asList(1, 2, 3, 3, 3, 2, 1));
    list.removeDuplicates();
    expected = new ArrayList<>(Arrays.asList(1, 2, 3));
    assertArrayEquals(expected.toArray(), list.toArrayList().toArray());
  }
}
