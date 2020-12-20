package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20, null, null);
        add(14, root);
        add(23, root);
        add(11, root);
        add(16, root);
        add(22, root);
        add(27, root);
        add(5, root);
        add(15, root);
        add(18, root);
        add(24, root);
        add(150, root);
        add(8, root);
        dfs(root);
    }

    public static void add(int value, Node root) {
        Node checkingNode = root;
        Node current = null;

        while (true) {
            if (checkingNode != null) {
                current = checkingNode;
                if (value < current.getValue()) {
                    checkingNode = current.getLeft();
                } else {
                    checkingNode = current.getRight();
                }
                continue;
            } else {
                if (value < current.getValue()) {
                    current.setLeft(new Node(value, null, null));
                } else {
                    current.setRight(new Node(value, null, null));
                }
                break;
            }
        }
    }

    public static void dfs(Node root) {
        if (root != null) {
            dfs(root.getLeft());
            System.out.print(root.getValue() + " ");
            dfs(root.getRight());
        }
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}


