public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
    //insert at first+
    public void addfirst(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        else {
            head.prev = newnode;
            newnode.next=head;
            head = newnode;
        }
    }
    // insert at last
    public void inseratlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
        }
    }

    //print
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.inseratlast(2);
        obj.inseratlast(10);
        obj.inseratlast(20);
        obj.inseratlast(50);
        obj.printlist();
        obj.addfirst(36);
        obj.printlist();
    }
}
