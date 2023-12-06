public class Showtime{
    private String movie;
    private String date;
    private String time;
    private float price;
    public  Showtime(String movie,String date,String time,float price){
        this.movie=movie;
        this.time=time;
        this.date=date;
        this.price=price;
    }
    public String getMovie(){
        return  movie;
    }
    public void setMovie(String movie){

    }
    public String getDate() {
        return date;
    }
    public String getTime(){
        return time;
    }
    public void setTime(float time){

    }
    public float getPrice(){
        return  price;
    }
    public void setPrice(float price){

    }
}