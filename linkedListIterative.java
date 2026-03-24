class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedListIterative {
    Node head; // Head of the linked list

    // Add a node at the end
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    // Iterative method to reverse the linked list
    public void reverseIterative() {
        Node curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next; // Store next node
            curr.next = prev; // Reverse the link
            prev = curr;      // Move prev forward
            curr = next;      // Move curr forward
        }
        head = prev; // Update head to new first node
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Use our custom linked list, not Java's built-in LinkedList
        linkedListIterative ll = new linkedListIterative();

        // Adding nodes
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        System.out.println("Original Linked List:");
        ll.printList();

        // Reverse using iterative method
        ll.reverseIterative();

        System.out.println("Reversed Linked List:");
        ll.printList();
    }
}