public class Movie{

    private String movie_title;
    private int release_year;
    private String director;
    private int duration;
    private String genre;
    private float rating;
    private int num_ratings;
    public Movie(String movie_title,int release_year,String director,int duration,String genre,float rating,int num_ratings){
        this.movie_title=movie_title;
        this.release_year=release_year;
        this.director=director;
        this.duration=duration;
        this.genre=genre;
        this.rating=rating;
        this.num_ratings=num_ratings;
    }
    public void getMovie_title(){
        System.out.println(movie_title);
    }
    public String getTitle(){
        return movie_title;
    }
    public void setMovie_title(String movie_title){
        System.out.println(movie_title);
    }
    public int getRelease_year(){
        return release_year;
    }
    public void setRelease_year(int release_year){

    }
    public String getDirector(){
        return director;

    }
    public void setDirector(String director){
        this.director=director;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){

    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){

    }
    public float getRating(){
        return rating;
    }
    public  void setRating(float rating){

    }
    public int getNum_ratings(){
        return num_ratings;
    }
    public void setNum_ratings(){

    }
}