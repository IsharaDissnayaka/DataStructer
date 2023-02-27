class Main{
    public static void main(String[] args) {
        Queues newq = new Queues(4);
        newq.insert(110);
        System.out.println(newq.Peek());
        System.out.println(newq.remove());
        System.out.println(newq.remove());
    }
}