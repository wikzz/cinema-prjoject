import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Theater{
    Scanner sc=new Scanner(System.in);
    //private ArrayList<Movie> movies;
    ArrayList<Movie> movies= new ArrayList<>();
    ArrayList<Showtime> Showtime=new ArrayList<>();
    private Seat[][] seats;
    private String movie;
    Theater theater;
    private String date;
    private String time;
    private float price;
    Showtime showtime=new Showtime(movie,date,time,price);
    public Theater(){

    }

    // public Theater(Seat[][] seats,String name,String location){
    //super(name ,location);
    //this.seats=seats;
    //}


    public Movie getMoviebyTitle(String title){
        for(Movie movie :movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }
    public void addMovie(){
        System.out.println("Enter the movie title:");
        String movie_title=sc.nextLine();
        //movies.add(movie_title);
        System.out.println("Enter the director:");
        String director=sc.nextLine();

        System.out.println("Enter the duration:");
        int duration=Integer.parseInt(sc.nextLine());
        //showtime.add(duration)
        Movie M=new Movie(movie_title,2009-12-15,director,duration,"Action,Adventure",7.5F,27002);
        movies.add(M);
        //M.setValues(movie_title,0,director,duration,"horror");
        System.out.println("Movie added successfully!");
    }
    public void removeMovie() {
        System.out.println("Enter the movie title:");
        String movie_remove = sc.nextLine();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equals(movie_remove)) {
                movies.remove(i);
                System.out.println("Movie removed successfully.");
                return;
            }
        }
        System.out.println("Movie not found.");
    }
    public void viewMovie() {
        System.out.println("Enter the movie for viewing:");
        String view_movie = sc.nextLine();

        for (Movie m : movies) {
            if (m.getTitle().equals(view_movie)) {
                System.out.println("Title: " + m.getTitle());
                System.out.println("Release Year: " + m.getRelease_year());
                System.out.println("Director: " + m.getDirector());
                System.out.println("Duration: " + m.getDuration());
                System.out.println("Genre: " + m.getGenre());
                System.out.println("Rating: " + m.getRating());
                System.out.println("Number of Ratings: " + m.getNum_ratings());
                System.out.println();
                return;
            }
        }

        System.out.println("There is no such movie.");
    }

    public void viewAllmovies(){
        for(int i=0;i<movies.size();i++){
            Movie movie = movies.get(i);
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Release year: " + movie.getRelease_year());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Duration: " + movie.getDuration());
            System.out.println("Rating: "+movie.getRating());
            System.out.println("Number of Ratings: "+movie.getNum_ratings());
            System.out.println();
        }
    }

    public void addShowtime(){
        System.out.println("Enter the movie title:");
        String movie_title = sc.nextLine();
        System.out.println("Enter the date (yyyy-mm-dd):");
        String date = sc.nextLine();
        System.out.println("Enter the time (hh:mm):");
        String time = sc.nextLine();
        System.out.println("Enter the price:");
        float price = sc.nextFloat();
        sc.nextLine(); // consume the extra newline character
        Showtime showtime = new Showtime(movie_title, date, time, price);
        Showtime.add(showtime);
        System.out.println("Showtime added successfully.");
    }

    public void removeShowtime() throws ParseException {
        System.out.println("Enter the movie title:");
        String title = sc.nextLine();
        System.out.println("Enter the date (yyyy/MM/dd):");
        String dateStr = sc.nextLine();
        System.out.println("Enter the time (HH:mm):");
        String timeStr = sc.nextLine();
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateStr);
        Date time = new SimpleDateFormat("HH:mm").parse(timeStr);
        Showtime showtime = findShowtime(title, date, time);
        if (showtime != null) {
            Showtime.remove(showtime);
            System.out.println("Showtime removed successfully.");
        } else {
            System.out.println("Showtime not found.");
        }
    }
    public Showtime findShowtime(String title, Date date, Date time) {
        for (Showtime showtime : Showtime) {
            if (getMoviebyTitle(title).equals(title) &&
                    showtime.getDate().equals(date) &&
                    showtime.getTime().equals(time)) {
                return showtime;
            }
        }
        return null;
    }
    public void viewShowtime() {
        System.out.println("Enter the movie title:");
        String title = sc.nextLine();

        boolean found = false;
        for (Showtime showtime : Showtime) {
            if (showtime.getMovie().equalsIgnoreCase(title)) {
                System.out.println("Movie: " + showtime.getMovie());
                System.out.println("Date: " + showtime.getDate());
                System.out.println("Time: " + showtime.getTime());
                System.out.println("Price: " + showtime.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No showtime found for the movie: " + title);
        }
    }

    public void viewAllShowtimes() {
        for (Showtime showtime : Showtime) {
            System.out.println("Movie title: " + showtime.getMovie() + "\nDate: " + showtime.getDate() + "\nTime: " + showtime.getTime() + "\nPrice: " + showtime.getPrice());
            System.out.println();
        }
    }
    public void buyTicket(){
    }

}