package sk.itsovy.projectBinaryTree;

public class Tree {
    private Node root;

    public Tree(Node root){
        this.root=root;
    }

    public Node getRoot(){
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(Node node){
        Node parent = root;

        while (true){
            if (node.getValue()<parent.getValue()){
                if (parent.getLeft() == null){
                    parent.setLeft(node);
                    break;
                }else{
                    parent=parent.getLeft();
                }
            }else{
                if (parent.getRight()==null){
                    parent.setRight(node);
                    break;
                }else{
                    parent=parent.getRight();
                }
            }
        }
    }

    /******************
     * @Author: Brother from another mother create
     * @Date: 6.2.2019
     * @Preview: 1.0
     * @param:
     * @return level
     * @description: zisti pocet levelov
     */

    public int getLevel(){
        // TO DO
        return 0;
    }

    public void printInOrder(Node node){
        if (node.getLeft() != null){                   //lavy
            printInOrder(node.getLeft());
        }
        System.out.print(node.getValue()+"  ");     //vrchol
        if (node.getRight() != null){                   //pravy
            printInOrder(node.getRight());
        }
    }

    public void printPostOrder(Node node){

        if (node.getLeft() != null){                //lavy
            printPostOrder(node.getLeft());
        }
        if (node.getRight() != null){             //pravy
            printPostOrder(node.getRight());
        }
        System.out.print(node.getValue()+"  "); //vrchol
    }

    public void printPreOrder(Node node){
        System.out.print(node.getValue()+"  "); //vrchol
        if (node.getLeft() != null){              //lavy
            printPreOrder(node.getLeft());
        }
        if (node.getRight() != null){              //pravy
            printPreOrder(node.getRight());
        }
    }

    public boolean containItem(int value){

        Node parent = root;

        while (true) {

            if (parent.getValue() == value) {
                return true;
            }

            if (parent.getValue()>value){
                if (parent.getLeft()!=null){
                    parent=parent.getLeft();
                }else{
                    return false;
                }
            }else{
                if (parent.getRight()!=null){
                    parent=parent.getRight();
                }else{
                    return false;
                }
            }
        }
    }

    public boolean isLeaf(Node node){
        if (node.getRight()==null && node.getLeft()==null){
            return true;
        }else{
            return false;
        }
    }

    public Node minNode(){
        Node parent=root;
        while (true){
            if (parent.getLeft()!=null){
                parent=parent.getLeft();
            }else{
                return parent;
            }
        }
    }

    public Node maxNode(){
        Node parent=root;
        while (true){
            if (parent.getRight()!=null){
                parent=parent.getRight();
            }else{
                return parent;
            }
        }
    }


}
