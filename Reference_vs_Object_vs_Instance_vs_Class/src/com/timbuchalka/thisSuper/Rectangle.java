package com.timbuchalka.thisSuper;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int x,int y){
        this(x,y,0,0);          //v pripade ak by sa width a height nezadali su 0
    }

    public Rectangle(int x,int y,int width, int height){
        super(x,y);                     //prijme 4 parametre x,y posle do parent classi aby ich inicializoval
        this.height=height;             //height a weight inicializuje tu .
        System.out.println("Height inicialized "+height);
        this.width=width;
        System.out.println("Width inicialized "+width);
    }


}
