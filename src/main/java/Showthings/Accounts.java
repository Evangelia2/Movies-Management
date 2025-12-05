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
public class Accounts {

    private String username;
    private String email;
    private int password;
    private ArrayList<Double> myratings;
    private ArrayList<String> favoriteactors;
    private ArrayList<String> favoritedirectors;

    public Accounts(String username, String email, int password, ArrayList<Double> myratings, ArrayList<String> favoriteactors, ArrayList<String> favoritedirectors) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.myratings = myratings;
        this.favoriteactors = favoriteactors;
        this.favoritedirectors = favoritedirectors;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Double> getMyratings() {
        return myratings;
    }

    public void setMyratings(ArrayList<Double> myratings) {
        this.myratings = myratings;
    }

    public ArrayList<String> getFavoriteactors() {
        return favoriteactors;
    }

    public void setFavoriteactors(ArrayList<String> favoriteactors) {
        this.favoriteactors = favoriteactors;
    }

    public ArrayList<String> getFavoritedirectors() {
        return favoritedirectors;
    }

    public void setFavoritedirectors(ArrayList<String> favoritedirectors) {
        this.favoritedirectors = favoritedirectors;
    }
    
}
