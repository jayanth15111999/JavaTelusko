 class Node {
    int key;
    Node leftChild, rightChild;

    Node(int key) {
        this.key = key;
        this.leftChild = this.rightChild = null;
    }
}

public class BstSearch {
    Node root;

    // **Method to search for a node in BST (Iterative)**
    public Node findNode(int key) {
        Node focusNode = root; // Start from the root

        while (focusNode != null) {
            if (focusNode.key == key) {
                return focusNode; // Found the node
            } else if (key < focusNode.key) {
                focusNode = focusNode.leftChild; // Move left
            } else {
                focusNode = focusNode.rightChild; // Move right
            }
        }

        return null; // Key not found in BST
    }

    // **Insert method to add nodes into BST**
    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;

            if (key < current.key) { // Insert in the left subtree
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else { // Insert in the right subtree
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.leftChild);
            System.out.print(root.key + " ");
            inorder(root.rightChild);
            
        }
        
    }

    public static void main(String[] args) {
        BstSearch bst = new BstSearch();

        // Inserting nodes
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        bst.inorder(bst.root);

        int searchKey = 7;
        Node result = bst.findNode(searchKey);

        System.out.println();
        if (result != null) {
            System.out.println("Node with key " + searchKey + " found.");
        } else {
            System.out.println("Node with key " + searchKey + " not found.");
        }
    }
}
