package UE02_AddAndSearch;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);

        // Baum ist noch leer
        if (root == null)
            root = newNode;
            // Sonst richtige Stelle suchen und dort einfügen
        else {
            // Variante 1: Rekursiv
            addRecursive(root, newNode);
            // Variante 2: Schleife
            //addLoop(root, newNode);
        }
    }

    // Add - Variante Rekursion
    private void addRecursive(Node currentNode, Node newNode) {
        if (currentNode.getNumber() > newNode.getNumber()) {
            // Ist die linke Position von CurrentNode frei?
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            }
            // Linke Position ist schon belegt
            else {
                addRecursive(currentNode.getLeft(), newNode);
            }
        } else if (currentNode.getNumber() < newNode.getNumber()) {
            // Ist die rechte Position von currentNode frei?
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            }
            // Rechte Position ist schon belegt
            else {
                addRecursive(currentNode.getRight(), newNode);
            }
        }
    }

    // Add - Variante Loop
    private void addLoop(Node startNode, Node newNode) {
        Node currentNode = startNode;
        while (currentNode != newNode) {
            //newNode ist kleiner als currentNode
            if (newNode.getNumber() < currentNode.getNumber()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                } else
                    currentNode = currentNode.getLeft();
            } else {
                //gibts ein rechtes kind?
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                }
                //weiterspringen zu rechten seite
                currentNode = currentNode.getRight();
            }

        }
    }

    public Node searchNumber(int number) {
        System.out.print("SearchNumber - ");

        // TODO: Entweder Variante 1 oder 2 einkommentieren
        // Variante 1: Aufruf Rekursiv
        return searchNumberRecursive(root, number);
        // Variante 2: Aufruf Schleife
        //return searchNumberLoop(number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number) {
        // fall numbers are the same
        if (currentNode == null)
            return null;
        else {
            if (currentNode.getNumber() == number) {
                return currentNode;
                // fall number is smaller
            } else if (number < currentNode.getNumber()) {
                return searchNumberRecursive(currentNode.getLeft(), number);
                //fall number is bigger
            } else if (number > currentNode.getNumber())
                return searchNumberRecursive(currentNode.getRight(), number);

        }
        return null;
    }

    // Suche - Variante Schleife
    private Node searchNumberLoop(int number) {
        Node currentNode = root;
        while (currentNode != null) {
            if (number == currentNode.getNumber()) {
                return currentNode;
            } else if (number < currentNode.getNumber()) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    /**
     * Funktion zur Ausgabe des gesamten Baums.
     */
    public void printTree() {
        printTree(root, "");
    }

    /**
     * Funktion zur Ausgabe des Baums unterhalb eines Knotens
     *
     * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
     * @param prefix      Zur Einr�ckung
     */
    public void printTree(Node currentNode, String prefix) {
        if (currentNode == null) {
            return;
        }
        System.out.println(prefix + currentNode.getNumber());
        printTree(currentNode.getLeft(), prefix + "L ");
        printTree(currentNode.getRight(), prefix + "R ");
    }


}
