public class Linklist {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int size ;
    public static node head;
    public static node tail;

    //add at first
    public void first(int data) {
        // create new node
        node newNode = new node(data);
        size++;

        if(head == null){
            head = tail=newNode;
            return;
        }

        // step2=newNode next = head
        newNode.next = head;
        head = newNode;
    }

    //add in last
    public void last(int data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //printing linklist
    public void print() {
        if(head==null){
            System.out.println("linklist is empty");
            return;
        }
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        
        System.out.println("Null");
    }

    //add at certain index
    public void add(int idx, int data){
        if(idx==0){
            first(data);
            return;
        }
        node newNode = new node(data);
        node temp= head;
        int i=0;
        while(i<(idx-1)){
            temp=temp.next;
            i++;
        }
        size++;

        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    //remove first element
    public void removefirst(){
        if(size==0){
            System.out.println("linklist is empty");
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            System.out.println(val+" is removed");
            size--;
        }
        int val =  head.data;
        head=head.next;
        size--;
        System.out.println(val+" is removed");
    }

    //rmeove last element
    public void removelast(){
        if(size==0){
            System.out.println("linklist is empty");
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            System.out.println(val+" is removed");
            size--;
        }
        node temp=head;
        node prev=head;
        for(int i=0;i<=size-2;i++){
            temp=temp.next;
        }
        prev=temp;
        
        int val =  tail.data;
        tail.next=prev;
        size--;
        System.out.println(val+" is removed");
    }
    
    
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.print();
        ll.first(1);
        ll.print();
        ll.first(2);
        ll.print();
        ll.last(4);
        ll.print();
        ll.add(1, 6);
        ll.print();
    
        System.out.println(size);
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        System.out.println(size);
    }
}