public class Queues {
    private int MaxSize;
    private int Rear=-1;
    private int Front=0;
    private int nItems=0;
    private int[] array;
    
    Queues(int S){
      MaxSize =S;
      array = new int[MaxSize];
    }

    public void insert(int Number){
        if(IsFull())
            System.out.println("Array Is Full");
        else
           array[++Rear]= Number;   
           nItems ++;       
    }

    public int remove(){
        if(IsEmpty()){
            System.out.println("Array IS empty");
            return -99;
        }

        else
           nItems--;
           return array[Front++];   
          
    }


    public int Peek(){
        return array[Front++];   
    }


    public boolean IsEmpty(){
        return (nItems==0);
    }


    public boolean IsFull(){
        return (Rear==MaxSize-1);
    }
    
}
