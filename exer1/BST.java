class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class GfG {

    // A utility function to insert a new node
    // with the given key
    static Node insert(Node root, int key)
    {

        // If the tree is empty, return a new node
        if (root == null)
            return new Node(key);

        // If the key is already present in the tree,
        // return the node
        if (root.key == key)
            return root;

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    static int getLeastValue(Node root) {
        // Modify this function as you wish bsta main object is to
        // get the least value of the BST

        if (root==null){
            System.out.println("Tree is empty skibidi");
            return 0;
        }

        Node current = root;

        while(current.left!=null){
            current = current.left;
        }

        return current.key;

    }

    // Driver method
    public static void main(String[] args)
    {
        Node root = null;
        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);



        System.out.println(getLeastValue(root));

    }
}