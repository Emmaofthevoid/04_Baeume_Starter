package UE02_AddAndSearch;

public class Test
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        // Beispielbaum aufbauen und ausgeben
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(60);
        tree.add(80);
        tree.add(20);
        tree.add(40);
        tree.add(15);
        tree.add(25);
        tree.printTree();

        // Knoten suchen und Wert ausgeben
        Node foundNode = null;
        foundNode = tree.searchNumber(80);  // Wert kann ausgetauscht werden
        if (foundNode != null)
            System.out.println("FoundNode: " + foundNode.getNumber());
        else
            System.out.println("Number not found!");
    }
}
