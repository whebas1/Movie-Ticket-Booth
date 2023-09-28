import java.util.ArrayList;

public class Movie
{
    // A movie has a name, run time, rating, and in the case of theatres, showings.
    private String name;
    private double runtime;
    private String rating;
    private ArrayList<String> showings = new ArrayList<>();
    public Movie(String name, double runtime, String rating)
    {
        this.name = name;
        this.runtime = runtime;
        this.rating = rating;
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public double getRuntime()
    {
        return runtime;
    }
    public String getRating()
    {
        return rating;
    }
    public ArrayList<String> getShowings()
    {
        return showings;
    }
    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRuntime(double runtime)
    {
        this.runtime = runtime;
    }
    public void setRating(String rating)
    {
        this.rating = rating;
    }
    public void setShowings(ArrayList<String> showings)
    {
        this.showings = showings;
    }
    // toString method
    public String toString()
    {
        return "Title: " + name + "\nRuntime: " + runtime + "\nRating: " + rating;
    }
}
