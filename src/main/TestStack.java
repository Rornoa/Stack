package main;

import linked.Stack;

import java.util.Random;

public class TestStack {

    public static void main(String[] args) {

        Random obj = new Random();
        interfaces.Stack[] stk = new interfaces.Stack[3];

        stk[0] = new fixed.Stack(5);
        stk[1] = new dynamic.Stack(5);
        stk[2] = new Stack();

        int i, j;

        for (i = 0; i < stk.length; i++) {
            for (j = 1; j < 10; j++) {
                if (stk[i].full()) {
                    break;
                }
                stk[i].push(obj.nextInt() % 100);
            }
        }

        for (i = 0; i < stk.length; i++) {
            while (!stk[i].empty()) {
                System.out.printf("% 4d", stk[i].pop());
            }
            System.out.println();
        }
    }
}
