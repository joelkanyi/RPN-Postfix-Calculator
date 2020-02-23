public class Stack2 {
    private int arr[];
    private int top;

    public Stack2(){
        arr=new int[100];
        top=-1;
    }
    public Stack2(int capacity){
        arr=new int[capacity];
        top=-1;
    }

    public boolean isEmpty()
    {
        if (top==-1)
            return true;
        else return false;
    }

    public int pop()
    {
        if(isEmpty()){
            System.out.println("Empty stack");
        }

        int temp=arr[top];
        arr[top]=0;
        top--;
        return temp;

    }
    public void push(int e) {
        top++;
        arr[top] = e;
    }

}


