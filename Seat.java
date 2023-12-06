import javax.naming.directory.SearchControls;

public class Seat{
    private int row;
    private int column_number;
    private int seat_availability;
    public Seat(int row,int column_number,int seat_availability){
        this.row=row;
        this.column_number=column_number;
        this.seat_availability=seat_availability;
    }
    public int getRow(int row){
        return row;
    }
    public void setRow(int row){

    }
    public int  getColumn_number(int column_number){
        return  column_number;
    }
    public void setColumn_number(int column_number){

    }
    public boolean isSeat_availability(boolean seat_availability){
        return  seat_availability;
    }
    public void setSeat_availability(boolean seat_availability){

    }
    public void viewSeats(){
        System.out.println("[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [X] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] \n" +
                "[O] [O] [O] [O] [O] [O] [O] [O] [O] [O] ");
    }
}
