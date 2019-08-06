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
