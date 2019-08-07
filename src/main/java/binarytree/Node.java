package binarytree;

class Node{
    private Node left;
    private Node right;
    private int data;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            left = insertIntoChild(left, value);
        } else{
            right = insertIntoChild(right, value);
        }
    }

    public boolean contains(int value){
        // Check if this node is the value
        if(value == data){
            return true;
        }
        // If the value is less than this node, let's check the left child
        else if(value < data){
            return doesChildContainValue(left, value);
        } else{ // value is more than data, so let's check the right child
            return doesChildContainValue(right, value);
        }
    }

    private boolean doesChildContainValue(Node child, int value){
        if(child == null){
            return false;
        } else{
            return child.contains(value);
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

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public int getData(){
        return data;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("left=").append(left);
        sb.append(", right=").append(right);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
