package UE04_RotateTree;

public class TvShow
{
    private final int rank;
    private final String title;
    private final double rating;

    // Konstruktor

    public TvShow(int rank, String title, double rating)
    {
        this.rank = rank;
        this.title = title;
        this.rating = rating;
    }

    // Getter- & Setter-Methoden

    public int getRank()
    {
        return rank;
    }

    public String getTitle()
    {
        return title;
    }

    public double getRating()
    {
        return rating;
    }

}
