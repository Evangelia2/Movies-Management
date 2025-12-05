/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Showthings;

import java.util.ArrayList;

/**
 *
 * @author Evangelia
 */
public class Show {

    private String title;
    private int releaseYear;
    private ArrayList<String> genre;
    private String countryOfProduction;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Double> rating;
    private int code;
    private double averagerating;
    
    public Show(String title, int releaseYear, ArrayList<String> genre, String countryOfProduction, String director, ArrayList<String> actors,ArrayList<Double> rating,int code,double averagerating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.countryOfProduction = countryOfProduction;
        this.director = director;
        this.actors = actors;
        this.rating = rating;
        this.code=code;
    }
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }
    
    public ArrayList<Double> getRating(){
        return rating;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getAveragerating() {
        return averagerating;
    }

    public void setAveragerating(double averagerating) {
        this.averagerating = averagerating;
    }
    
    
}