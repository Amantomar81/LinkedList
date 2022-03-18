public class ReverseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }
    //insert the element
    public void insertelement(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        else {
            Node temp = head;
            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
        }
    }
    public void display(){
        Node temp = head;
        if (head == null){
            System.out.println("doubly linked list is empty");
            return;
        }
        while (temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("Null");
        System.out.println("Doubly linked list is reverse: ");
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
        obj.insertelement(5);
        obj.insertelement(4);
        obj.insertelement(10);
        obj.insertelement(14);
        obj.display();
    }
}
