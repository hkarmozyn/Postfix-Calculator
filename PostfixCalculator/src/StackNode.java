public class StackNode<T> {

    private T data; //Data stored in the node
    private StackNode parent; //Reference to the parent node

    //Default constructor
    public StackNode() {

    }

    //Constructor that sets data of the node
    public StackNode(T data) {
        this.data = data;
    }

    //Constructor that sets data, parent, and child
    public StackNode(T data, StackNode parent) {
        this.data = data;
        this.parent = parent;
    }

    //Returns the data stored in the node
    public T getData() {
        return data;
    }

    //Sets the data for this node
    public void setData(T data) {
        this.data = data;
    }


    public StackNode getParent() {
        return parent;
    }

    public void setParent(StackNode n) {
        parent = n;
    }

    //Provides a string representation of the node by converting its data to a string
    public String toString() {
        return "StackNode: " + this.data.toString();
    }

    //Compares the data of the node with the data of another node 'n'
    public boolean equals(StackNode n) {
        return this.data.equals(n.getData());
    }
}
