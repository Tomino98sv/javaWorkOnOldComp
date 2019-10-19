package itSovy.carConsumption.data;

import itSovy.carConsumption.projectmath.Circle;

public class Queue {


    private int capacity;
    private int size;
    private Circle[] arr;

    public Queue(int cap){
        this.capacity=cap;
        this.size=0;
        this.arr=new Circle[capacity];
    }

    public boolean isFull(){
        return size==capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(Circle kruh){
        if (kruh==null){
            return;
        }
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        else {
            arr[size]=kruh;
            size++;
        }
    }

    public void dequeue(){
        if (isEmpty()) {
            throw new NoSuchFieldError();
        }else{
            for (int a=0;a<size-1;a++){
               arr[a]=arr[a+1];
            }
            size--;
            arr[size]=null;
        }
    }

    public Circle front(){
        if (isEmpty()){
            return null;
        }else{
            return arr[0];
        }
    }

    public Circle frontAndDequeue(){
        Circle temp=front();
        dequeue();
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
        arr = new Circle[capacity];
    }

}
