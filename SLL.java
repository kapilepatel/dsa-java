public class SLL {
    private int size = 0;
    private Node head;

    SLL()
    {

    }

    SLL(int val)
    {
        Node node = new Node();
        node.value = val;
        node.next = null;
        head = node;
        size++;
    }
    public void addFirst(int val)
    {
        Node node = new Node();
        node.value = val;
        node.next = head;

        head = node;
        size++;
    }


    void display(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.value +"->");

            temp = temp.next;
        }
    }
}

class Node{
    int value;
    Node next;
}


