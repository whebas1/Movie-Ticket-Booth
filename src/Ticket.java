public class Ticket
{
    private int audNum;
    private String purchaser;
    private String time;
    private int row;
    private int column;
    private Movie movie;

    public Ticket(int audNum, String purchaser, String time)
    {
        this.audNum = audNum;
        this.purchaser = purchaser;
        this.time = time;

    }
    public Ticket(String purchaser)
    {
        this.purchaser = purchaser;
    }

    // Getters
    public int getAudNum()
    {
        return audNum;
    }
    public int getColumn()
    {
        return this.column;
    }
    public int getRow()
    {
        return this.row;
    }
    public String getPurchaser()
    {
        return purchaser;
    }
    public String getTime()
    {
        return time;
    }

    //Setters
    public void setRow(int row)
    {
        this.row = row;
    }
    public void setColumn(int column)
    {
        this.column = column;
    }
    public void setAudNum(int audNum)
    {
        this.audNum = audNum;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }
    // toString
    public String toString()
    {
        return "Name: " + purchaser + "\nAuditorium " + audNum + " Time - " + time + "\n" + movie + "\nRow " + (row + 1) + " Column " + (column + 1);
    }
}
