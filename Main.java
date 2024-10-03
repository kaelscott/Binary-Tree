public class Main {
    public static void main(String[] args) {
        BinaryTree morseTree = new BinaryTree();

        morseTree.insert(".-", "A");
        morseTree.insert("-...", "B");
        morseTree.insert("-.-.", "C");
        morseTree.insert("-..", "D");
        morseTree.insert(".", "E");
        morseTree.insert("..-.", "F");
        morseTree.insert("--.", "G");
        morseTree.insert("....", "H");
        morseTree.insert("..", "I");
        morseTree.insert(".---", "J");
        morseTree.insert("-.-", "K");
        morseTree.insert(".-..", "L");
        morseTree.insert("--", "M");
        morseTree.insert("-.", "N");
        morseTree.insert("---", "O");
        morseTree.insert(".--.", "P");
        morseTree.insert("--.-", "Q");
        morseTree.insert(".-.", "R");
        morseTree.insert("...", "S");
        morseTree.insert("-", "T");
        morseTree.insert("..-", "U");
        morseTree.insert("...-", "V");
        morseTree.insert(".--", "W");
        morseTree.insert("-..-", "X");
        morseTree.insert("-.--", "Y");
        morseTree.insert("--..", "Z");

        morseTree.printTree();

        String result = morseTree.decodeMorse(".- -... -.-.");
        System.out.println("Decodificado: " + result);
    }
}
