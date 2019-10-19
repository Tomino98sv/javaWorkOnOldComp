package genericType;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{

    private List<T> stack = new ArrayList<>();

    public void insert(T value){
        stack.add(value);
    }

    public T getFirst(){
        return stack.get(0);
    }

    public T getLast(){
        return stack.get(stack.size()-1);
    }

}
