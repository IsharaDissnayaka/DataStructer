class Stack{
    private int MaxSize;
    private int Top=-1;
    private int array[];
    
    
    public Stack(int s){
          MaxSize = s ;
          array = new int[MaxSize];
    }


    public void Push(int Number){
        if(Top==MaxSize-1)
          System.out.println("Array Is Empty");
        else  
         array[++Top]=Number;
    }

    public int Pop(){
        if(Top==-1)
           return -99;
        else
            return array[Top--];    
    }

    public int Peek(){
        return array[Top];
    }


    public Boolean IsFull (){
        return (MaxSize==Top-1);
    }

    public Boolean IsEmpty(){
        return (Top == -1);
    }
}