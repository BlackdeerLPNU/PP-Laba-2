package task1;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Stack<T> implements Iterable<T> {
    private Node<T>   head;

    public void push(T value){
        Node<T>  node = new Node<>(value);
        node.next = head;
        head = node;
    }
    public T pop(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        T item = head.value;
        head = head.next;
        return item;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public int size(){
        int size = 0;
        Node<T> pointer = this.head;
        while (pointer != null) {
            size++;
            pointer = pointer.next;
        }
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    private static class Node<T> {
        private T value;
        private Node<T>  next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}

