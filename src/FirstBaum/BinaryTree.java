package FirstBaum;

import UE02_AddAndSearch.Node;

public class BinaryTree {
    private Node root;

    private void addNode(int number) {

        //Knote nerstellen
        Node newNode = new Node(number);
        newNode.setNumber(number);
        boolean nodeAdded = false;
        while (!nodeAdded) {


            //Fall = baum ist leer
            if (root == null) {
                root = newNode;
            }
            //Fall = baum ist nicht leer
            else {
                Node currentNode = root;
                //neue wert ist kleiner als aktuelle knoten
                if (newNode.getNumber() < root.getNumber()) {
                    //linkes kind nicht gesetzt, D.h dort einfügen
                    if (currentNode.getLeft() == null) {


                        currentNode.setLeft(newNode);
                        nodeAdded = true;
                    }
                    // fall : linkes kind ist gesetzt
                    else
                        currentNode = currentNode.getLeft();
                    // neuer wert ist grösser als als aktueller knoten
                } else if (currentNode.getRight() == null) {


                    currentNode.setRight(newNode);
                    nodeAdded = true;
                }
                // rechtes kind ist gesetzt
                else

                    currentNode = currentNode.getRight();
            }
        }
    }

    public Node searchNode(Node currentNode, int number) {
        if (currentNode == null) {
            return null;
        }
        //FAll 1  : man steht gerade am gesuchten knoten
        if (currentNode.getNumber() == number) {
            return currentNode;
        }

        //FALL 2 : gesuchte wert ist kleiner als aktuellen knoten
        else if (number < currentNode.getNumber()) {
            return searchNode(currentNode.getLeft(), number);
        } else if (number > currentNode.getNumber()) {
            return searchNode(currentNode.getRight(), number);
        }

        return null;

    }
}
