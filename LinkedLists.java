public class LinkedLists {
    class Node {
        Strings data;
        Node next;
        Node(Strings data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head; 
    void addAtFirst(Strings data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addAtLast(Strings data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(Strings[] args) {
        LinkedLists list = new LinkedLists();
        list.addAtFirst("a");
        list.addAtFirst("is");
        list.addAtLast("linked");
        list.addAtLast("list");
        list.printList(); 
    }
}
