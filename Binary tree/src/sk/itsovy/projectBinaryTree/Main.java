package sk.itsovy.projectBinaryTree;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node root = new Node(72);
        Tree tree = new Tree(root);
        Node node1= new Node(34);
        tree.addNode(node1);

        Node node2= new Node(85);
        tree.addNode(node2);

        tree.addNode(new Node(12));
        tree.addNode(new Node(34));
        tree.addNode(new Node(41));
        tree.addNode(new Node(41));
        tree.addNode(new Node(180));
        tree.addNode(new Node(50));
        tree.addNode(new Node(14));
        tree.addNode(new Node(22));

        tree.printInOrder(tree.getRoot());

        int[] pole = new int[14];
        pole[0]=22;
        pole[1]=47;
        pole[2]=15;
        pole[3]=27;
        pole[4]=60;
        pole[5]=4;
        pole[6]=18;
        pole[7]=24;
        pole[8]=28;
        pole[9]=50;
        pole[10]=63;
        pole[11]=16;
        pole[12]=24;
        pole[13]=51;

        Node root2 = new Node(30);
        Tree tree2 = new Tree (root2);

        for(int a=0;a<pole.length;a++){
            tree2.addNode(new Node(pole[a]));
        }
        System.out.println("\n\n");
        tree2.printInOrder(tree2.getRoot());

        System.out.println("\n\n");
        tree2.printPreOrder(tree2.getRoot());

        System.out.println("\n\n");
        tree2.printPostOrder(tree2.getRoot());

        System.out.println(tree2.containItem(13));
        System.out.println("max value is "+tree2.maxNode().getValue());
        System.out.println("min value is "+tree2.minNode().getValue());

        Main n= new Main();
        int res= n.fakt(5);
        System.out.println("\nVysledok je "+res);

        Tree tree3 = new Tree(null);
        File filename = new File(".\\src\\test\\resources\\TextJava.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(filename);
            while (scan.hasNextLine()){
                if (tree3.getRoot() == null){
                    tree3=new Tree(new Node(Integer.parseInt(scan.nextLine())));
                }else{
                    tree3.addNode(new Node(Integer.parseInt(scan.nextLine())));
                }
            }

        } catch (FileNotFoundException ahoj) {
            ahoj.printStackTrace();
        }

        tree3.printInOrder(tree3.getRoot());

        SPZ finder = new SPZ(new File(".\\src\\test\\resources\\cars.txt"));
        finder.printSPZ();


    }

    public int fakt(int n){
        if (n==1){
            return 1;
        }else {
            return n * fakt(n - 1);
        }
    }

}
