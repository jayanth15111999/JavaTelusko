class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedListRecursive {
    Node head;

    // Add a node at the end
    void add(int data) {
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

    // Recursive reversal
    Node reverseRecursive(Node node) {
        if (node == null || node.next == null) {
            return node;  // Base case: Last node becomes new head
        }

        Node newHead = reverseRecursive(node.next);  // Recur for next node

        node.next.next = node; // Reverse the link
        node.next = null;      // Break old link

        return newHead;  // Return new head of reversed list
    }

    void reverseRecursive() {
        head = reverseRecursive(head); // Update head after recursion
    }

    // Print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedListRecursive list = new linkedListRecursive();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.printList();

        list.reverseRecursive();

        System.out.println("Reversed List (Recursive):");
        list.printList();
    }
}
