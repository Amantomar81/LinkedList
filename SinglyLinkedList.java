public class SinglyLinkedList {
    Node head;
    class Node{
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    //add first
    public void addfirst(int data){
        Node n1 = new Node(data);
        if(head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }
   // add at last
    public void addlast(int data){
        Node n1 = new Node(data);
        if(head == null) {
            head = n1;
            return;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }
    //insert at position
    public void insertAtPosition(int data,int p){
        Node newNode =  new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            for (int i = 1; i < p-1 ; i++) {
                temp = temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    //delete first
    public void deletfirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    // delete from last
    public void deletelast(){
        if(head == null){
            System.out.println("this is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while(lastnode.next!= null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    //delete from position
    public void deleteAtPosition(int p){
        if(head==null){
            return;
        }
        else{
            Node deleteNode = head;
            Node temp = head;
            for (int i = 0; i < p-2; i++) {
                temp = temp.next;
            }
            deleteNode = temp.next;
            Node temp1 = temp.next.next;
            temp.next.next=null;
            temp.next=temp1;
            return;
        }
    }
    //reverse list
    public void reverselist(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }
    //print
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" Null");
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("ADD AT FIRST");
        list.addfirst(2);
        list.addfirst(1);
        list.printlist();
        System.out.println("ADD THE LAST");
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.printlist();
        System.out.println("INSERT AT POSITION");
        list.insertAtPosition(30,2);
        list.insertAtPosition(40,3);
        list.printlist();
        System.out.println("DELETE AT FIRST");
        list.deletfirst();
        list.printlist();
        System.out.println("DELETE AT LAST");
        list.deletelast();
        list.printlist();
        System.out.println("DELETE AR POSITION ");
        list.deleteAtPosition(2);
        list.printlist();
        System.out.println("REVERSE THE LIST");
        list.reverselist();
        list.printlist();
    }

}
