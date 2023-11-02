public class Stack <T> {

    private int size; // size
    private StackNode top; // top element



    Stack(){ // default constructer

    }



    public void push(T data){ // push method
        size++; // adds to size
        StackNode n = new StackNode(data, top);
        top=n; // sets top to add element



    }


    public  T pop(){ // pop method
        size--; // subtracts from the 1 from the size
        StackNode oldTop = top;
        top=top.getParent(); // sets the new top
        return (T)oldTop.getData(); // returns the deleted element




    }
    public T peek(){
        return (T)top.getData();
    } // peek method returns the element
    public int getSize(){ // returns the size
        return size;

    }

    public boolean isEmpty(){ // is empty
        if(size==0){
            return true;
        }else{
            return false;
        }
    }




}
