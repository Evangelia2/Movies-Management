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
public class Series extends Show {
    private String miniseries;
    private int seasons;
    private int lastaired;
    private ArrayList<Integer> episodesperseason;

    /**
     *
     * @param miniseries
     * @param seasons
     * @param lastaired
     * @param episodesperseason
     * @param title
     * @param releaseYear
     * @param genre
     * @param countryOfProduction
     * @param averagerating
     * @param director
     * @param actors
     * @param rating
     * @param code
     */
    
    public Series(String title,int releaseYear ,ArrayList<String> genre,String countryOfProduction,String director,ArrayList<String> actors,ArrayList<Double> rating,int code,double averagerating,String miniseries,int seasons,int lastaired, ArrayList<Integer> episodesperseason ) {
        super(title, releaseYear, genre, countryOfProduction, director, actors, rating,code,averagerating);
        this.miniseries = miniseries;
        this.seasons = seasons;
        this.lastaired = lastaired;
        this.episodesperseason = episodesperseason;
    }

    public String isMiniseries() {
        return miniseries;
    }

    public void setMiniseries(String miniseries) {
        this.miniseries = miniseries;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getLastaired() {
        return lastaired;
    }

    public void setLastaired(int lastaired) {
        this.lastaired = lastaired;
    }

    public ArrayList<Integer> getEpisodesperseason() {
        return episodesperseason;
    }

    public void setEpisodesperseason(ArrayList<Integer> episodesperseason) {
        this.episodesperseason = episodesperseason;
    }
    
}
