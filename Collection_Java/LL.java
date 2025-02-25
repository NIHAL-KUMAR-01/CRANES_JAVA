class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtBegin(int data) {
        Node n1 = new Node(data);
        n1.next = head; 
        head = n1; 
    }

    
    public void addLast(int data) {
        Node n1 = new Node(data);
        if (head == null) { 
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null) { 
            temp = temp.next;
        }
        temp.next = n1; 
    }

    public void printNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) { 
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addAtBegin(10);
        list.addLast(15);
        list.addAtBegin(5);
        list.addLast(20);
        list.printNode(); 
    }
}
