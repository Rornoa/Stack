package linked;

public class Stack implements interfaces.Stack {
    private static class Node {
        private Node(int v, Node n) {
            value = v;  //значение обьекта списка
            next = n;   //указатель на следующий элемент списка
        }

        private int value;
        private Node next;
    }

    private Node head; //поле верхний элемент

    public Stack() {
        head = null;
    }//при создании стека он создается пустым (верхний элемент указывает на null)

    public void push(int x) {
        head = new Node(x, head);
    }

    public int pop() {
        int value = head.value;
        head = head.next;
        return value;
    }

    public int top() {
        return head.value;
    }

    public boolean full() {
        return false;
    } //никогда не заполнен поскольку не предпологается что в реализации связным списком есть фиксированное колличество для заполнения

    public boolean empty() {
        return head == null;
    }
}
