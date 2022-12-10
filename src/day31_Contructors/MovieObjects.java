package day31_Contructors;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie = new Movie("USA","Journey to SDET: Cydeo Batch 10","Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");

        movie.addCast("Asiya");

        String [] cast = {"Muhtar", "Ozi", "Adam"};

        movie.addCast(cast);

        System.out.println(movie);


    }
}
