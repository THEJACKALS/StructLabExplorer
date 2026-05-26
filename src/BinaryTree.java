public class BinaryTree {
    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node currentNode, int value) {
        // Nilai yang lebih kecil masuk ke kiri, sisanya ke kanan.
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.leftChild = insert(currentNode.leftChild, value);
        } else {
            currentNode.rightChild = insert(currentNode.rightChild, value);
        }

        return currentNode;
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (value == currentNode.value) {
            return true;
        }

        if (value < currentNode.value) {
            return contains(currentNode.leftChild, value);
        }

        return contains(currentNode.rightChild, value);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    public int size() {
        return size(root);
    }

    private int size(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        return 1 + size(currentNode.leftChild) + size(currentNode.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }

        return 1 + Math.max(height(currentNode.leftChild), height(currentNode.rightChild));
    }

    public String getSummary() {
        if (isEmpty()) {
            return "Pohon masih kosong.";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Ringkasan Pohon");
        builder.append("\nAkar: ").append(root.value);
        builder.append("\nJumlah node: ").append(size());
        builder.append("\nTinggi pohon: ").append(height());
        return builder.toString();
    }

    public String preOrderTraversal() {
        StringBuilder builder = new StringBuilder();
        buildPreOrder(root, builder);
        return builder.length() == 0 ? "-" : builder.toString();
    }

    public String inOrderTraversal() {
        StringBuilder builder = new StringBuilder();
        buildInOrder(root, builder);
        return builder.length() == 0 ? "-" : builder.toString();
    }

    public String postOrderTraversal() {
        StringBuilder builder = new StringBuilder();
        buildPostOrder(root, builder);
        return builder.length() == 0 ? "-" : builder.toString();
    }

    private void buildPreOrder(Node currentNode, StringBuilder builder) {
        if (currentNode == null) {
            return;
        }

        appendValue(builder, currentNode.value);
        buildPreOrder(currentNode.leftChild, builder);
        buildPreOrder(currentNode.rightChild, builder);
    }

    private void buildInOrder(Node currentNode, StringBuilder builder) {
        if (currentNode == null) {
            return;
        }

        buildInOrder(currentNode.leftChild, builder);
        appendValue(builder, currentNode.value);
        buildInOrder(currentNode.rightChild, builder);
    }

    private void buildPostOrder(Node currentNode, StringBuilder builder) {
        if (currentNode == null) {
            return;
        }

        buildPostOrder(currentNode.leftChild, builder);
        buildPostOrder(currentNode.rightChild, builder);
        appendValue(builder, currentNode.value);
    }

    private void appendValue(StringBuilder builder, int value) {
        if (builder.length() > 0) {
            builder.append(" -> ");
        }

        builder.append(value);
    }
}