public class Show
{
    // A show has a movie and a time.
    private Movie movie;
    private String showing;
    private int audNum;

    public Show( Movie movie, String showing)
    {
        this.movie = movie;
        this.showing = showing;
    }

    // Getters
    public Movie getMovie()
    {
        return this.movie;
    }
    public String getShowing()
    {
        return this.showing;
    }
    public int getAudNum()
    {
        return this.audNum;
    }
    // Setters
    public void setAudNum(int num)
    {
        this.audNum = num;
    }
}
