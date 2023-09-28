import java.util.ArrayList;
public class Auditorium
{
    // Auditorium number
    // An auditorium has a showing
    // An auditorium has an auditorium number
    // An auditorium has a number of available seats as well as a display of available seats
    private int num;
    private int rows;
    private int columns;
    private Ticket seats[][];
    private ArrayList<Show> shows = new ArrayList<>();

    public Auditorium( int num, int rows, int columns)
    {
        this.num = num;
        this.rows = rows;
        this.columns = columns;
        this.seats = new Ticket[rows][columns];
    }
    // Getters
    public int getAudNum()
    {
        return num;
    }
    public ArrayList<Show> getShows()
    {
        return this.shows;
    }

    public Show getShow(int num)
    {
        return this.shows.get(num);
    }

    public Ticket[][] getSeats() {
        return seats;
    }

    //Setters
    public void setAudNum(int num)
    {
        this.num = num;
    }
    // Add a show
    public void addShow(Show show)
    {
        shows.add(show);
    }

    // Have to print out the seats
    public String toString()
    {
        for(int r = 0;r < seats.length; r++)
        {
            for(int c = 0; c<seats[r].length; c++)
            {
                System.out.print("[");
                if(seats[r][c] != null)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print("O");
                }
                System.out.print("]");
            }
            System.out.println("");
        }
        return "";
    }

}
