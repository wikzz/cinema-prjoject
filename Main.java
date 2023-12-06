import java.text.ParseException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        Theater theater=new Theater();
        Seat seat=new Seat(10,10,100);
        while(true){
            System.out.println("Welcome to the LUT Kino at Yliopistonkatu!");
            System.out.println("1. Add a movie\n" +
                    "2. Remove a movie\n" +
                    "3. View a movie\n" +
                    "4. View all movies\n" +
                    "5. Add a showtime\n" +
                    "6. Remove a showtime\n" +
                    "7. View a showtime\n" +
                    "8. View all showtimes\n" +
                    "9. Buy a ticket\n" +
                    "10. View seating\n" +
                    "0. Exit\n" +
                    "Enter your choice:");
            int choice=sc.nextInt();
            if(choice==0) {
                System.out.println("Goodbye!");
                break;}
            if(choice==1){
                theater.addMovie();
            }
            if(choice==2){
                String title=sc.nextLine();
                Movie movie=theater.getMoviebyTitle(title);
                theater.removeMovie();
            }
            if(choice==3){
                theater.viewMovie();
            }
            if (choice==4){
                theater.viewAllmovies();
            }
            if(choice==5){
                theater.addShowtime();
            }
            if(choice==6){
                theater.removeShowtime();
            }
            if(choice==7){
                theater.viewShowtime();
            }
            if(choice==8){
                theater.viewAllShowtimes();
            }
            if(choice==9){
                theater.buyTicket();
            }
            if(choice==10){
                seat.viewSeats();
            }
        }
    }
}