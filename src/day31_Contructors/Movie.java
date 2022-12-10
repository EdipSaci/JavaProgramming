package day31_Contructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title,genre,releaseDate,director;
    public ArrayList<String> cast = new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre= genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast (String castName){
        cast.add(castName);
    }

    public void addCast (String  [] castName){
        cast.addAll(Arrays.asList(castName));
    }

    public String toString() {
        return "Name of country: " + country + " title: "+ title + " release date: "+ releaseDate+" total of number cast: "  + cast.size();
    }
}
