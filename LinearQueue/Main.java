class Main{
    public static void main(String[] args) {
        Linearqueue l1 =  new Linearqueue(3);
        l1.Insert(5);
        l1.Insert(5);
        l1.Insert(6);
        System.out.println(l1.remove());
        
        l1.Insert(5);
       System.out.println(l1.peek());

    }
}