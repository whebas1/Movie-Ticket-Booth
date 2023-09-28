import java.util.ArrayList;
public class Theatre
{
    // A Theatre has a list of auditoriums with their own respective showings.
    private ArrayList<Auditorium> auditoriums = new ArrayList<>();
    private ArrayList<Movie> movies = new ArrayList<>();

    public Theatre()
    {

    }
    // Getters
    public ArrayList<Auditorium> getAuditoriums()
    {
        return auditoriums;
    }

    public Auditorium getAuditorium(int num)
    {
        return auditoriums.get(num);
    }
    public ArrayList<Movie> getMovies()
    {
        return movies;
    }

    // Setters
    public void setAuditoriums (ArrayList<Auditorium> auditoriums)
    {
        this.auditoriums = auditoriums;
    }
    // Add an auditorium
    public void addAuditorium(Auditorium auditorium)
    {
        auditoriums.add(auditorium);
    }
    // Remove an auditorium
    public void removeAuditorium(Auditorium auditorium)
    {
        auditoriums.remove(auditorium);
    }
    public void addMovie(Movie movie)
    {
        movies.add(movie);
    }
}
