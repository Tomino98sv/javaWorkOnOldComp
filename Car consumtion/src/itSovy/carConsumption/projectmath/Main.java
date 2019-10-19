package itSovy.carConsumption.projectmath;

import itSovy.carConsumption.Geometry.Square;
import itSovy.carConsumption.Geometry.Triangle;
import itSovy.carConsumption.data.Queue;
import itSovy.carConsumption.data.Stack;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date date = new Date();
        String str = String.format("Current Date/Time : %tc", date);

        Dot first = new Dot(-5, 8, 'S');
        first.print();
        System.out.println("Distance " + first.getName() + " from S[0,0] is " + first.distance());
        Dot.about(str);   //static sa vola rovno po class kedze je pre rovnaka pre vsetkyck
        //bezohladu na to kto ju vola vrati to iste
        Dot bod2 = new Dot(2, 5, 'E');
        Triangle abc = new Triangle(-2, -2, 6, -2, 6, 4);
        Square abcd = new Square(0, 0, 2, 0, 0, 2, 2, 2);
        Circle K = new Circle(0, 0, 5);
        Circle L = new Circle(0, 0, 0, 5);

        Dot N = new Dot(0, 6, 'N');

        System.out.println("|WE|= " + bod2.distance(first));
        abc.getPerimeter();
        System.out.println("Perimeter: " + abc.getPerimeter());
        System.out.println("Area: " + abc.getArea());
        System.out.println("Alpha: " + abc.getAlpha());
        System.out.println("Perimeter: " + abcd.getPerimeter());
        System.out.println("Area: " + abcd.getArea());
        System.out.println("Diagonal: " + abcd.getDiagonal());

        System.out.println("Circle perimeter: " + K.getPerimeter());
        System.out.println("Cricle area: " + K.getArea());

        System.out.println("Circle perimeter: " + L.getPerimeter());
        System.out.println("Cricle area: " + L.getArea());
        System.out.println("Bod N v circle: " + L.isDotInCircle(N));

        Dot3D dot10 = new Dot3D(5, 6, 7, 'G');
        dot10.print();
        System.out.println("dot10 distance: " + dot10.distance());

        Random rnd = new Random();

        /*
        Dot[] array;
        array=new Dot[10];


        for (int i=0;i<10;i++){
            array[i]=new Dot(random.nextInt(41)-20,random.nextInt(41)-20,(char)('A'+i));
            //od 0 po 40
            array[i].print();
        }
        */
        //10*9/2

        Dot[] array;
        array=new Dot[4];

        array[0]=new Dot(1,1,'A');
        array[1]=new Dot(0,1,'B');
        array[2]=new Dot(0,3,'C');
        array[3]=new Dot(4,0,'D');


        double distance=0;
        Dot[] arrayGeater;
        arrayGeater=new Dot[2];

        for(int i=0;i<4;i++){
            for(int a=i+1;a<4;a++){
                System.out.println("Distance of "+array[i].getName()+" and "+array[a].getName()+" is "+array[i].distance(array[a]));
                if(distance<array[i].distance(array[a])){
                    arrayGeater[0]=array[i];
                    arrayGeater[1]=array[a];
                    distance=array[i].distance(array[a]);
                }
            }
        }

         System.out.println("napis to hajzel "+distance);
         arrayGeater[0].print();
         arrayGeater[1].print();

        Circle[] circlesarray;
        circlesarray = new Circle[5];


        for (int i=0; i<circlesarray.length;i++){
            circlesarray[i]=new Circle(rnd.nextInt(10)+1,rnd.nextInt(10)+1,rnd.nextInt(10)+1);
            circlesarray[i].print();
        }

        for(int i=0;i<circlesarray.length;i++){
            for(int a=i+1;a<circlesarray.length;a++){

                double dis = circlesarray[i].getS().distance(circlesarray[a].getS());
                if(dis<circlesarray[i].getr()+circlesarray[a].getr()){
                    System.out.println("\nThis circles have contact");
                    System.out.println("circle on array position: "+i);
                    circlesarray[i].print();
                    System.out.println("circle on array position: "+a);
                    circlesarray[a].print();
                }

            }
        }

        Dot nearestPoint=new Dot(0);
        double defaultDis=0;
        int index=0;

        for(int i=0;i<array.length;i++){

            if (index==0){
                defaultDis=array[i].distance(new Dot(0));
                index++;
            }

            if(array[i].distance(new Dot(0))<=defaultDis){
            nearestPoint=array[i];
            }
        }

        System.out.println("\nNearest point is: \n");
        nearestPoint.print();

        Angle B = new Angle(new Dot(5,3),new Dot(0,0),new Dot(4,0));
        System.out.println("Angle is: "+B.getAlpha());

        Circle.printCount();



        Main.Hello();
        Main objekt = new Main();
        objekt.Ahoj();
/*
        System.out.println("Bod zo vstupmi");

        int x;
        int y;
        char c;

        System.out.println("Zadaj suradnicu x:");
        x = input.nextInt();
        System.out.println("Zadaj suradnicu y:");
        y = input.nextInt();
        System.out.println("Zadaj nazov bodu c:");
        c = input.next().charAt(0);


        Dot point = new Dot(x,y,c);
        point.print();
*/
        System.out.println("\nStack\n");

        Stack stack = new Stack(4);
        Dot d1=new Dot(4,5,'A');
        Dot d2=new Dot(4,5,'B');
        Dot d3=new Dot(4,5,'C');
        Dot3D d4=new Dot3D(4,5,4,'D');
        stack.push(d1);
        stack.push(d2);
        stack.push(d3);
        stack.push(d4);
        //stack.pop();
        //stack.top().print();
        stack.topAndPop().print();
        stack.top().print();

        Queue fifo = new Queue(5);
        Circle c1=new Circle(0,0,3);
        Circle c2=new Circle(0,1,4);
        Circle c3=new Circle(1,1,5);
        Circle c4=new Circle(1,0,6);
        Circle c5=new Circle(2,0,7);
        fifo.enqueue(c1);
        fifo.enqueue(c2);
        fifo.enqueue(c3);
        fifo.enqueue(c4);
        fifo.enqueue(c5);
        fifo.dequeue();
        fifo.front().print();


    }

    public static void Hello(){
        System.out.println("Hello");
    }

    public void Ahoj(){
        System.out.println("Ahoj debile");
    }


}

