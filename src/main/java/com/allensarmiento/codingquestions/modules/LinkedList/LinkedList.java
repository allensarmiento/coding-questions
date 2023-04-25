package com.allensarmiento.codingquestions.modules.LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList<E> {
    transient Node<E> head;
    transient Node<E> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addAll(List<E> elements) {
        for (E element : elements) {
            pushBack(element);
        }
    }

    public void pushBack(E element) {
        if (head == null) {
            head = new Node<>(null, element, null);
            return;
        }

        Node<E> pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        Node<E> nodeToAdd = new Node<>(pointer, element, null);
        pointer.next = nodeToAdd;
    }

    public ArrayList<E> toArrayList() {
        if (head == null) {
            return new ArrayList<>();
        }

        ArrayList<E> items = new ArrayList<>();
        Node<E> pointer = head;
        while (pointer.next != null) {
            items.add(pointer.item);
            pointer = pointer.next;
        }

        return items;
    }

    public void removeDuplicates() {
        if (head == null) return;

        Set<E> seen = new HashSet<>();
        Node<E> pointer = head;
        Node<E> follow = null;
        while (pointer.next != null) {
            if (seen.contains(pointer.item) && follow != null) {
                follow.next = pointer.next;
                pointer = follow.next;
            } else {
                seen.add(pointer.item);
                follow = pointer;
                pointer = pointer.next;
            }
        }
    }
}
