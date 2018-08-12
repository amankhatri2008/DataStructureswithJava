package dataStructures;

import java.util.ArrayList;
import java.util.List;


class MyStack {
    private List<Integer> data;               // store elements
    public MyStack() {
        data = new ArrayList<Integer>();
    }
   
    public void push(int x) {
        data.add(x);
    }
    
    public boolean isEmpty() {
        return data.isEmpty();
    }
   
    public int top() {
        return data.get(data.size() - 1);
    }
  
    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }
};

public class SimpleStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(6);
        s.push(7);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
}