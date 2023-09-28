import java.lang.invoke.ConstantBootstraps;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Creating a new theatre with 4 auditoriums. Each auditorium will have 8 * 8 seats.
        Theatre theatre = new Theatre();
        for(int i = 0; i<4; i++)
        {
            theatre.addAuditorium(new Auditorium(i+1, 8, 8 ));
        }
        // Making new scanner variable to take user input.
        Scanner input = new Scanner(System.in);
        // Ask user for their name.
        System.out.println("Hello valued customer. What is your name?");
        String name = input.nextLine();
        Ticket customer = new Ticket(name);
        // Ask user for a movie (1 - n) where n is the number of movies currently available at the theatre.
        System.out.println("Good to see you " + name + "\nWhat movie are you planning to see?\n");
        // Creating movies
        Movie oppenheimer = new Movie("Oppenheimer", 2, "R");
        Movie barbie = new Movie("Barbie", 2, "PG-13");
        // Creating show times for each movie.
        ArrayList<String> times = new ArrayList<>();
        for(int i = 0; i<6; i++)
        {
            times.add(""+ (i+2) + ":00pm" );
        }
        // Assigning showtimes for each movie.
        oppenheimer.setShowings(times);
        barbie.setShowings(times);
        theatre.addMovie(oppenheimer);
        theatre.addMovie(barbie);

        for(int i = 0; i<theatre.getMovies().size(); i++)
        {
            System.out.println((i+1) + ": " + theatre.getMovies().get(i) + "\n");
        }
        int movie = input.nextInt() -1;
        Movie intendedMovie = theatre.getMovies().get(movie);
        customer.setMovie(intendedMovie);
        System.out.println("Here are the showings for " + intendedMovie.getName() + ":\n");
        // Creating a new showing for oppenheimer
        for(int i = 0; i<theatre.getMovies().size(); i++)
        {
            for(int j = 1; j<=5; j++)
            {
                theatre.getAuditorium(2).addShow(new Show(theatre.getMovies().get(i), "" + j + ":30"));
            }
        }
        theatre.getAuditorium(2).addShow(new Show(oppenheimer, "9:30"));
        // Loop through each auditorium in the theatre to check for shows
        // if a show is found, print it out.

        ArrayList<Show> shows = new ArrayList<>();
        int count = 1;
        for( int i = 0; i<theatre.getAuditoriums().size(); i++)
        {
            for( int s = 0; s<theatre.getAuditoriums().get(i).getShows().size(); s++)
            {
                if(theatre.getAuditorium(i).getShow(s).getMovie() == intendedMovie)
                {
                    System.out.println((count) + " - " + theatre.getAuditorium(i).getShow(s).getShowing());
                    theatre.getAuditorium(i).getShow(s).setAudNum(i);
                    shows.add(theatre.getAuditorium(i).getShow(s));
                    count++;
                }
            }
        }
        // Ask the user to input a showing
        System.out.println("\nWhich showing would you like?");
        int showNum = input.nextInt() -1;
        int menuOption;
        customer.setTime(shows.get(showNum).getShowing());
        customer.setAudNum(shows.get(showNum).getAudNum());
        System.out.println(theatre.getAuditorium(shows.get(showNum).getAudNum()));
        System.out.println("Pick your seats. Taken seats are labeled with an X \nSpecify the row first. First Row starts at the top (1).");
        menuOption = input.nextInt();
        customer.setRow(menuOption -1);
        System.out.println("Now specify the column. Column 1 starts furthest to the left.");
        menuOption = input.nextInt();
        customer.setColumn(menuOption -1);
        if(theatre.getAuditorium(shows.get(showNum).getAudNum()).getSeats()[customer.getRow()][customer.getColumn()] != null)
        {
            while(theatre.getAuditorium(shows.get(showNum).getAudNum()).getSeats()[customer.getRow()][customer.getColumn()] != null)
            {
                System.out.println("Seat is unavailable.");
                System.out.println("Pick your seats, Specify the row first. First Row starts at the top (1).");
                menuOption = input.nextInt();
                customer.setRow(menuOption -1);
                System.out.println("Now specify the column. Column 1 starts furthest to the left.");
                menuOption = input.nextInt();
                customer.setColumn(menuOption -1);
            }
        }
        else
        {
            theatre.getAuditorium(shows.get(showNum).getAudNum()).getSeats()[customer.getRow()][customer.getColumn()] = customer;
        }

        System.out.println(theatre.getAuditorium(shows.get(showNum).getAudNum()));
        System.out.println("All right, All set! Here's your receipt:");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(customer);
    }
}