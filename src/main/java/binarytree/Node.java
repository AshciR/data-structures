package binarytree;

class Node{
    private Node leftChild;
    private Node rightChild;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            leftChild = insertIntoChild(leftChild, value);
        } else{
            rightChild = insertIntoChild(rightChild, value);
        }
    }

    private Node insertIntoChild(Node child, int value){
        if(child == null){
            child = new Node(value);
        } else{
            child.insert(value);
        }
        return child;
    }

    public boolean contains(int value){
        // Check if this node is the value
        if(value == data){
            return true;
        }
        // If the value is less than this node, let's check the left child
        else if(value < data){
            return doesChildContainValue(leftChild, value);
        } else{ // value is more than data, so let's check the right child
            return doesChildContainValue(rightChild, value);
        }
    }

    private boolean doesChildContainValue(Node child, int value){
        if(child == null){
            return false;
        } else{
            return child.contains(value);
        }
    }

    public Node getLeftChild(){
        return leftChild;
    }

    public Node getRightChild(){
        return rightChild;
    }

    public int getData(){
        return data;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("leftChild=").append(leftChild);
        sb.append(", rightChild=").append(rightChild);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
