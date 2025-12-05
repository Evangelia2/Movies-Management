/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Showthings;

/**
 *
 * @author Evangelia
 */
public class Person {
    
    private String namesurname;
    private String birthcountry;
    private String birthday;
    private String website;
    private int id;

    public Person(String namesurname, String birthcountry, String birthday, String website, int id) {
        this.namesurname = namesurname;
        this.birthcountry = birthcountry;
        this.birthday = birthday;
        this.website = website;
        this.id = id;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNamesurname() {
        return namesurname;
    }

    public void setNamesurname(String namesurname) {
        this.namesurname = namesurname;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
