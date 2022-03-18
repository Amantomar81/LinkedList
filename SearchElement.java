/*
Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
Search for the number 7 & display its index.
 */
public class SearchElement {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //add elements
    public void addelement(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    // search element

    public void search(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp != null){
            if (temp.data == data){
                System.out.println(i);
                System.out.println(temp.data);
                return;
            }
            i++;
            temp = temp.next;

        }
        return;
    }
    //print
    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        SearchElement obj1 = new SearchElement();
        obj1.addelement(1);
        obj1.addelement(5);
        obj1.addelement(7);
        obj1.addelement(3);
        obj1.addelement(8);
        obj1.addelement(2);
        obj1.addelement(3);
        obj1.display();
        obj1.search( 7);
    }
}
