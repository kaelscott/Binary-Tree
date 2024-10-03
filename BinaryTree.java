public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = new Node("");
    }

    public void insert(String morseCode, String character) {
        Node current = root;
        for (char symbol : morseCode.toCharArray()) {
            if (symbol == '.') {
                if (current.left == null) {
                    current.left = new Node("");
                }
                current = current.left;
            } else if (symbol == '-') {
                if (current.right == null) {
                    current.right = new Node("");
                }
                current = current.right;
            }
        }
        current.data = character;
    }


    public Node getRoot() {
        return root;
    }

    public String morseToChar(Node morseTree, String sequence, int i) {
        if (i == sequence.length()) {
            return morseTree.data;
        } else if (sequence.charAt(i) == '.') {
            return morseToChar(morseTree.left, sequence, i + 1);
        } else {
            return morseToChar(morseTree.right, sequence, i + 1);
        }
    }


    public String decodeMorse(String str) {
        String decoded = "";
        String[] sequences = str.split(" ");
        for (String sequence : sequences) {
            if (sequence.equals("/")) {
                decoded += " ";
            } else {
                decoded += morseToChar(root, sequence, 0);
            }
        }
        return decoded;
    }
    public void printTree() {
        printTreeHelper(root, 0);
    }

    private void printTreeHelper(Node node, int depth) {
        if (node == null) {
            return;
        }
        printTreeHelper(node.right, depth + 1);

        System.out.println(" ".repeat(depth * 4) + "|-- " + node.data);

        printTreeHelper(node.left, depth + 1);
    }


}