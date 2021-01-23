package interfaces;

public interface Stack {
    public void push(int x); //поместить на вершину

    public int pop(); //берет из вершины первый и возвращает результат int

    public int top(); //создает копию вершины

    public boolean full(); //проверка заполненности

    public boolean empty(); //проверка пустотности
}
