package itSovy.carConsumption.data;

import itSovy.carConsumption.projectmath.Dot;

public class Stack {

    private int capacity;
    private int size;
    private Dot[] arr;

    public Stack(int cap){
        this.capacity=cap;
        this.size=0;
        this.arr=new Dot[capacity];
    }

    public boolean isFull(){
        return size==capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(Dot bod){
        if (bod==null){
            return;
        }
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        else {
            arr[size]=bod;
            size++;
        }
    }

    public void pop(){
        if (isEmpty()) {
            throw new NoSuchFieldError();
        }else{
            size--;
            arr[size]=null;
        }
    }

    public Dot top(){
        if (isEmpty()){
            return null;
        }else{
            return arr[size-1];
        }
    }

    public Dot topAndPop(){
        Dot temp=top();
        pop();
        return temp;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public void empty(){
        size=0;
        arr = new Dot[capacity];
    }

}

