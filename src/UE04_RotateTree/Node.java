package UE04_RotateTree;

public class Node
{
    private TvShow tvShow;
    private Node left;
    private Node right;

    public Node(TvShow tvShow)
    {
        this.tvShow = tvShow;
    }

    public TvShow getTvShow()
    {
        return tvShow;
    }

    public void setTvShow(TvShow tvShow)
    {
        this.tvShow = tvShow;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }
}
