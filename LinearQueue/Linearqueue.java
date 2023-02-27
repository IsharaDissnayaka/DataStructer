public class Linearqueue {
    private  int MaxSize;
    private  int Front=0;
    private  int Rear=-1;
    private int array[];
    private int nitem = 0;


   public Linearqueue(int S){
      MaxSize = S;
      array = new int[MaxSize];
      
   }

   public void Insert(int a){
      if(isEmpty()){
         System.out.println("Linearqueue is Full ");
      }
      else{

           if(Rear == MaxSize-1){
              Rear = -1;

           }

        array[++Rear]=a;
        nitem++;   

      }
   }


   public int remove(){

    if(isFull()){
        System.out.println("Linearqueue is full");
        return -99;
    }
   
    else{
        nitem--;
        int items = array[Front++];
        if(Front==MaxSize-1){
            Front=0;
        }
        return  items;
    }
   }


   public int peek(){
    return  array[Front];
   }
   

   public boolean isEmpty(){
    return (nitem==MaxSize);
   }

   public boolean isFull(){
    return (nitem==0);
   }
}
