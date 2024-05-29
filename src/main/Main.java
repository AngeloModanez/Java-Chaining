package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Element item;
        Element top = null;
        Element last = null;
        int data = 0;

        Scanner in = new Scanner(System.in);

        while (data >= 0) {
            System.out.print("Dado: ");
            data = in.nextInt();
            if (data < 0) {
                continue;
            }
            item = new Element();
            item.setData(data);
            item.setNext(null);
            if (top == null) {
                top = item;
                last = item;
            } else {
                last.setNext(item);
                last = item;
            }
        }
        in.close();

        item = top;
        while (item != null) {
            System.out.println("Dado: " + item.getData());
            item = item.getNext();
        }
    }

    public static class Element {

        private int data;
        private Element next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }
}
