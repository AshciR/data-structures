package binarytree;

public class Main{
    public static void main(String[] args){
        Node tree = new Node(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(8);

        int valueA = 15;
        System.out.println("Does Tree contain " + valueA + "? " + tree.contains(valueA));
        int valueB = 20;
        System.out.println("Does Tree contain " + valueB + "? " + tree.contains(valueB));
        int valueC = 8;
        System.out.println("Does Tree contain " + valueC + "? " + tree.contains(valueC));
    }
}
