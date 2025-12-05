/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.it2022068;

import Showthings.Accounts;
import Showthings.Person;
import Showthings.Series;
import Showthings.Show;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Evangelia
 */
public class It2022068 {
    
    public static void main(String args[]) {

        //ΔΗΜΙΟΥΡΓΙΑ ΤΩΝ ARRAYLIST 
       ArrayList<Show> shows = new ArrayList<>();
       ArrayList<String> Allactors = new ArrayList<>();
       ArrayList<String> Alldirectors = new ArrayList<>();
       ArrayList<Accounts> accounts=new ArrayList<>();
       ArrayList<Person> person = new ArrayList<>();
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 1ου ΘΕΑΜΑΤΟΣ-ΣΕΙΡΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 1ο ΘΕΑΜΑ

       ArrayList<String> genreshow1 = new ArrayList<>();
       ArrayList<String> show1Actors = new ArrayList<>();
       ArrayList<Integer>series1episodes = new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΕΠΕΙΣΟΔΙΩΝ ΑΝΑ ΣΕΖΟΝ ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 1ου ΘΕΑΜΑΤΟΣ
       series1episodes.add(12);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(16);
       series1episodes.add(10);

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 1ου ΘΕΑΜΑΤΟΣ
       genreshow1.add("legal drama");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 1ου ΘΕΑΜΑΤΟΣ
       show1Actors.add("Gabriel Macht");
       show1Actors.add("Patrick J. Adams");
       show1Actors.add("Meghan Markle");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Gabriel Macht");
       Allactors.add("Patrick J. Adams");
       Allactors.add("Meghan Markle");

       //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥ ΣΚΗΝΟΘΕΤΕΣ
       Alldirectors.add("Aaron Korsh");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 1ο ΘΕΑΜΑ
       ArrayList<Double>show1ratings=new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 1ο ΘΕΑΜΑ
       show1ratings.add(9.0);
       show1ratings.add(8.4);
       show1ratings.add(9.7);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 1ου ΘΕΑΜΑΤΟΣ
       Series show1 = new Series("Suits",2011,genreshow1,"United States","Aaron Korsh",show1Actors,show1ratings,1,9.03,"NO",9,2019,series1episodes);
       shows.add(new Series("Suits",2011,genreshow1,"United States","Aaron Korsh",show1Actors,show1ratings,1,9.03,"NO",9,2019,series1episodes));
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 2ου ΘΕΑΜΑΤΟΣ-ΤΑΙΝΙΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 2ο ΘΕΑΜΑ
       ArrayList<String> genreshow2 = new ArrayList<>();
       ArrayList<String> show2Actors = new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 2ου ΘΕΑΜΑΤΟΣ
       genreshow2.add("crime");
       genreshow2.add("mystery");
       genreshow2.add("thriller");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 2ου ΘΕΑΜΑΤΟΣ
       show2Actors.add("Jesse Eisenberg");
       show2Actors.add("Mark Ruffalo");
       show2Actors.add("Morgan Freeman");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Jesse Eisenberg");
       Allactors.add("Mark Ruffalo");
       Allactors.add("Morgan Freeman");

        //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥ ΣΚΗΝΟΘΕΤΕΣ
       Alldirectors.add("Alex Kurtzman");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 2ο ΘΕΑΜΑ
       ArrayList<Double>show2ratings=new ArrayList<>();

        //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 2ο ΘΕΑΜΑ
       show2ratings.add(7.6);
       show2ratings.add(8.2);
       show2ratings.add(7.8);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 2ου ΘΕΑΜΑΤΟΣ
       Show show2 = new Show("Now you see me",2013,genreshow2,"United States","Alex Kurtzman",show2Actors,show2ratings,2,7.86);
       shows.add(new Show("Now you see me",2013,genreshow2,"United States","Alex Kurtzman",show2Actors,show2ratings,2,7.86));
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 3ου ΘΕΑΜΑΤΟΣ-ΤΑΙΝΙΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 3ο ΘΕΑΜΑ
       ArrayList<String> genreshow3 = new ArrayList<>();
       ArrayList<String> show3Actors = new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 3ου ΘΕΑΜΑΤΟΣ
       genreshow3.add("science-fiction");
       genreshow3.add("action");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 3ου ΘΕΑΜΑΤΟΣ
       show3Actors.add("Dylan O'Brien");
       show3Actors.add("Kaya Scodelario");
       show3Actors.add("Thomas Brodie-Sangster");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Dylan O'Brien");
       Allactors.add("Kaya Scodelario");
       Allactors.add("Thomas Brodie-Sangster");

        //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥ ΣΚΗΝΟΘΕΤΕΣ
       Alldirectors.add("Wes Ball");
       
        //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 3ο ΘΕΑΜΑ
       ArrayList<Double>show3ratings=new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 3ο ΘΕΑΜΑ
       show3ratings.add(6.8);
       show3ratings.add(7.3);
       show3ratings.add(7.9);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 3ου ΘΕΑΜΑΤΟΣ
       Show show3 = new Show("Maze Runner",2014,genreshow3,"United States","Wes Ball",show3Actors,show3ratings,3,7.33);
       shows.add(new Show("Maze Runner",2014,genreshow3,"United States","Wes Ball",show3Actors,show3ratings,3,7.33));
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 4ου ΘΕΑΜΑΤΟΣ-ΣΕΙΡΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 4ο ΘΕΑΜΑ
       ArrayList<String> genreshow4 = new ArrayList<>();
       ArrayList<String>show4Actors = new ArrayList<>();
       ArrayList<Integer>series2episodes = new ArrayList<>();

        //ΠΡΟΣΘΗΚΗ ΕΠΕΙΣΟΔΙΩΝ ΑΝΑ ΣΕΖΟΝ ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 4ου ΘΕΑΜΑΤΟΣ
       series2episodes.add(10);

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 4ου ΘΕΑΜΑΤΟΣ
       genreshow4.add("drama");
       genreshow4.add("supernatural");
       genreshow4.add("horror");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 4ου ΘΕΑΜΑΤΟΣ
       show4Actors.add("Michiel Huisman");
       show4Actors.add("Carla Gugino");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Michiel Huisman");
       Allactors.add("Carla Gugino");

       //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Alldirectors.add("Mike Flanagan");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 4ο ΘΕΑΜΑ
       ArrayList<Double>show4ratings=new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 4ο ΘΕΑΜΑ
       show4ratings.add(8.6);
       show4ratings.add(6.9);
       show4ratings.add(7.5);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 4ου ΘΕΑΜΑΤΟΣ
       Series show4  = new Series("The haunting of Hill House",2018,genreshow4,"United States","Mike Flanagan",show4Actors,show4ratings,4,7.66,"YES",1,2020,series2episodes);
       shows.add(new Series("The haunting of Hill House",2018,genreshow4,"United States","Mike Flanagan",show4Actors,show4ratings,4,7.66,"YES",1,2020,series2episodes));
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 5ου ΘΕΑΜΑΤΟΣ-ΣΕΙΡΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 5ο ΘΕΑΜΑ
       ArrayList<String> genreshow5 = new ArrayList<>();
       ArrayList<String> show5Actors = new ArrayList<>();
       ArrayList<Integer> series3episodes = new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΕΠΕΙΣΟΔΙΩΝ ΑΝΑ ΣΕΖΟΝ ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 5ου ΘΕΑΜΑΤΟΣ
       series3episodes.add(22);
       series3episodes.add(22);
       series3episodes.add(13);
       series3episodes.add(22);
       series3episodes.add(9);

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 5ου ΘΕΑΜΑΤΟΣ
       genreshow5.add("crime");
       genreshow5.add("action");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 5ου ΘΕΑΜΑΤΟΣ
       show5Actors.add("Dominic Purcell");
       show5Actors.add("Wentworth Miller");
       show5Actors.add("Robin Tunney");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Dominic Purcell");
       Allactors.add("Wentworth Miller");
       Allactors.add("Robin Tunney");

        //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Alldirectors.add("Paul Scheuring");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 5ο ΘΕΑΜΑ
       ArrayList<Double>show5ratings= new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 5ο ΘΕΑΜΑ
       show5ratings.add(9.8);
       show5ratings.add(8.3);
       show5ratings.add(9.2);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 5ου ΘΕΑΜΑΤΟΣ
       Series show5  = new Series ("Prison break",2005,genreshow5,"United States","Paul Scheuring",show5Actors,show5ratings,5,9.1,"NO",5,2017,series3episodes);
       shows.add(new Series ("Prison break",2005,genreshow5,"United States","Paul Scheuring",show5Actors,show5ratings,5,9.1,"NO",5,2017,series3episodes));
       
       //ΑΡΧΙΚΟΠΟΙΗΣΗ ΤΟΥ 6ου ΘΕΑΜΑΤΟΣ-ΤΑΙΝΙΑ
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟ 6ο ΘΕΑΜΑ
       ArrayList<String> genreshow6 = new ArrayList<>();
       ArrayList<String> show6Actors = new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΕΙΔΟΥΣ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 6ου ΘΕΑΜΑΤΟΣ
       genreshow6.add("science-fiction");
       genreshow6.add("action");

       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ  ΣΤΟ ΑΝΤΙΣΤΟΙΧΟ ARRAYLIST ΤΟΥ 6ου ΘΕΑΜΑΤΟΣ
       show6Actors.add("Leonardo DiCaprio");
       show6Actors.add("Cillian Murphy");
       
       //ΠΡΟΣΘΗΚΗ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Allactors.add("Leonardo DiCaprio");
       Allactors.add("Cillian Murphy");

       //ΠΡΟΣΘΗΚΗ ΣΚΗΝΟΘΕΤΗ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
       Alldirectors.add("Christopher Nolan");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 6ο ΘΕΑΜΑ
       ArrayList<Double>show6ratings=new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΑΠΟ ΤΟΥΣ ΧΡΗΣΤΕΣ ΓΙΑ ΤΟ 6ο ΘΕΑΜΑ
       show6ratings.add(7.8);
       show6ratings.add(8.4);
       show6ratings.add(9.0);
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ 6ου ΘΕΑΜΑΤΟΣ
       Show show6  = new Show("Inception",2010,genreshow6,"United States","Christopher Nolan",show6Actors,show6ratings,6,8.4);
       shows.add(new Show("Inception",2010,genreshow6,"United States","Christopher Nolan",show6Actors,show6ratings,6,8.4));
       

       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΗΘΟΠΟΙΩΝ/ΣΚΗΝΟΘΕΤΩΝ
       Person p1 = new Person ("Gabriel Macht","New York","22/1/1972","https://en.wikipedia.org/wiki/Gabriel_Macht",100);
       person.add(new Person ("Gabriel Macht","New York","22/1/1972","https://en.wikipedia.org/wiki/Gabriel_Macht",100));
       
       Person p2 = new Person ("Patrick J. Adams","Canada","27/8/1981","https://en.wikipedia.org/wiki/Patrick_J._Adams",101);
       person.add(new Person ("Patrick J. Adams","Canada","27/8/1981","https://en.wikipedia.org/wiki/Patrick_J._Adams",101));
       
       Person p3 = new Person ("Meghan Markle","California","4/8/1981","https://en.wikipedia.org/wiki/Meghan_Duchess_of_Sussex",102);
       person.add(new Person ("Meghan Markle","California","4/8/1981","https://en.wikipedia.org/wiki/Meghan_Duchess_of_Sussex",102));
       
       Person p4 = new Person ("Aaron Korsh","United States","7/11/1966","https://en.wikipedia.org/wiki/Aaro_Korsh",103);
       person.add(new Person ("Aaron Korsh","United States","7/11/1966","https://en.wikipedia.org/wiki/Aaro_Korsh",103));
       
       Person p5 = new Person ("Jesse Eisenberg","New York","5/10/1983","https://en.wikipedia.org/wiki/Jesse_Eisenberg",104);
       person.add(new Person ("Jesse Eisenberg","New York","5/10/1983","https://en.wikipedia.org/wiki/Jesse_Eisenberg",104));
       
       Person p6 = new Person ("Mark Ruffalo","United States","22/11/1967","https://en.wikipedia.org/wiki/Mark_Ruffalo",105);
       person.add(new Person ("Mark Ruffalo","United States","22/11/1967","https://en.wikipedia.org/wiki/Mark_Ruffalo",105));
       
       Person p7 = new Person ("Morgan Freeman","United States","1/6/1937","https://en.wikipedia.org/wiki/Morgan_Freeman",106);
       person.add(new Person ("Morgan Freeman","United States","1/6/1937","https://en.wikipedia.org/wiki/Morgan_Freeman",106));
       
       Person p8 = new Person ("Alex Kurtzman","California","7/9/1973","https://en.wikipedia.org/wiki/Alex_Kurtzman",107);
       person.add(new Person ("Alex Kurtzman","California","7/9/1973","https://en.wikipedia.org/wiki/Alex_Kurtzman",107));
       
       Person p9 = new Person ("Dylan O'Brien","New York","26/8/1991","https://en.wikipedia.org/wiki/Dylan_O%27Brien",108);
       person.add(new Person ("Dylan O'Brien","New York","26/8/1991","https://en.wikipedia.org/wiki/Dylan_O%27Brien",108));
       
       Person p10 = new Person ("Kaya Scodelario","England","13/3/1992","https://en.wikipedia.org/wiki/Kaya_Scodelario",109);
       person.add(new Person ("Kaya Scodelario","England","13/3/1992","https://en.wikipedia.org/wiki/Kaya_Scodelario",109));
       
       Person p11 = new Person ("Thomas Brodie-Sangster","England","16/5/1990","https://en.wikipedia.org/wiki/Thomas_Brodie-Sangster",110);
       person.add(new Person ("Thomas Brodie-Sangster","England","16/5/1990","https://en.wikipedia.org/wiki/Thomas_Brodie-Sangster",110));
       
       Person p12 = new Person ("Wes Ball","Florida","28/10/1980","https://en.wikipedia.org/wiki/Wes_Ball",111);
       person.add(new Person ("Wes Ball","Florida","28/10/1980","https://en.wikipedia.org/wiki/Wes_Ball",111));
       
       Person p13 = new Person ("Michiel Huisman","Netherlands","18/7/1981","https://en.wikipedia.org/wiki/Michiel_Huisman",112);
       person.add(new Person ("Michiel Huisman","Netherlands","18/7/1981","https://en.wikipedia.org/wiki/Michiel_Huisman",112));
       
       Person p14 = new Person ("Carla Gugino","Frorida","29/8/1971","https://en.wikipedia.org/wiki/Carla_Cugino",113);
       person.add(new Person ("Carla Gugino","Frorida","29/8/1971","https://en.wikipedia.org/wiki/Carla_Cugino",113));
       
       Person p15 = new Person ("Mike Flanagan","Massachusetts","20/5/1978","https://en.wikipedia.org/wiki/Mike_Flanagan",114);
       person.add(new Person ("Mike Flanagan","Massachusetts","20/5/1978","https://en.wikipedia.org/wiki/Mike_Flanagan",114));
       
       Person p16 = new Person ("Dominic Purcell","England","17/2/1970","https://en.wikipedia.org/wiki/Dominic_Purcell",115);
       person.add(new Person ("Dominic Purcell","England","17/2/1970","https://en.wikipedia.org/wiki/Dominic_Purcell",115));
       
       Person p17 = new Person ("Wentworth Miller","England","2/6/1972","https://en.wikipedia.org/wiki/Wentworth_Miller",116);
       person.add(new Person ("Wentworth Miller","England","2/6/1972","https://en.wikipedia.org/wiki/Wentworth_Miller",116));
       
       Person p18 = new Person ("Robin Tunney","Chicago","19/6/1972","https://en.wikipedia.org/wiki/Robin_Tunney",117);
       person.add(new Person ("Robin Tunney","Chicago","19/6/1972","https://en.wikipedia.org/wiki/Robin_Tunney",117));
       
       Person p19 = new Person ("Paul Scheuring","Illinois","20/11/1968","https://en.wikipedia.org/wiki/Paul_Scheuring",118);
       person.add(new Person ("Paul Scheuring","Illinois","20/11/1968","https://en.wikipedia.org/wiki/Paul_Scheuring",118));
       
       Person p20 = new Person ("Leonardo DiCaprio","California","11/11/1974","https://en.wikipedia.org/wiki/Leonardo_DiCaprio",119);
       person.add(new Person ("Leonardo DiCaprio","California","11/11/1974","https://en.wikipedia.org/wiki/Leonardo_DiCaprio",119));
       
       Person p21 = new Person ("Cillian Murphy","Ireland","25/5/1976","https://en.wikipedia.org/wiki/Cillian_Murphy",120);
       person.add(new Person ("Cillian Murphy","Ireland","25/5/1976","https://en.wikipedia.org/wiki/Cillian_Murphy",120));
       
       Person p22 = new Person ("Christopher Nolan","England","30/7/1970","https://en.wikipedia.org/wiki/Christopher_Nolan",121);
       person.add(new Person ("Christopher Nolan","England","30/7/1970","https://en.wikipedia.org/wiki/Christopher_Nolan",121));
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 1
       ArrayList<Double>myratings1 = new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST 
       myratings1.add(9.0);
       myratings1.add(7.6);
       myratings1.add(6.8);
       myratings1.add(8.6);
       myratings1.add(9.8);
       myratings1.add(7.8);
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΗΘΟΠΟΙΟΥΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 1
       ArrayList<String>favoriteactors1=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST
       favoriteactors1.add("Jesse Eisenberg");
       favoriteactors1.add("Wentworth Miller");
       favoriteactors1.add("Patrick J. Adams");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΣΚΗΝΟΘΕΤΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 1
       ArrayList<String>favoritedirectors1=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΣΚΗΝΟΘΕΤΩΝ ΣΤΟ ARRAYLIST 
       favoritedirectors1.add("Wes Ball");
       favoritedirectors1.add("Christopher Nolan");
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 1
       Accounts account1 = new Accounts("maria","mariapapagewrgiou@gmail.com",5208,myratings1,favoriteactors1,favoritedirectors1);
       accounts.add(new Accounts("maria","mariapapagewrgiou@gmail.com",5208,myratings1,favoriteactors1,favoritedirectors1));
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 2
       ArrayList<Double>myratings2 = new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST
       myratings2.add(8.4);
       myratings2.add(8.2);
       myratings2.add(7.3);
       myratings2.add(6.9);
       myratings2.add(8.3);
       myratings2.add(8.4);
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΗΘΟΠΟΙΟΥΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 2
       ArrayList<String>favoriteactors2=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST
       favoriteactors2.add("Leonardo DiCaprio");
       favoriteactors2.add("Kaya Scodelario");
       favoriteactors2.add("Dominic Purcell");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΣΚΗΝΟΘΕΤΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 2
       ArrayList<String>favoritedirectors2=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΣΚΗΝΟΘΕΤΩΝ ΣΤΟ ARRAYLIST
       favoritedirectors2.add("Paul Scheuring");
       favoritedirectors2.add("Mike Flanagan");
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 2
       Accounts account2 = new Accounts("george","georgeathanasiou@gmail.com",9473,myratings2,favoriteactors2,favoritedirectors2);
       accounts.add(new Accounts("george","georgeathanasiou@gmail.com",9473,myratings2,favoriteactors2,favoritedirectors2));
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΜΕ ΤΙΣ ΒΑΘΜΟΛΟΓΙΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 3
       ArrayList<Double>myratings3 = new ArrayList<>();

       //ΑΡΧΙΚΟΠΟΙΗΣΗ ARRAYLIST
       myratings3.add(9.7);
       myratings3.add(7.8);
       myratings3.add(7.9);
       myratings3.add(7.5);
       myratings3.add(9.2);
       myratings3.add(9.0);
       
        //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΗΘΟΠΟΙΟΥΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 2
       ArrayList<String>favoriteactors3=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΗΘΟΠΟΙΩΝ ΣΤΟ ARRAYLIST
       favoriteactors3.add("Morgan Freeman");
       favoriteactors3.add("Thomas Brodie-Sangster");
       favoriteactors3.add("Mark Ruffalo");
       
       //ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΓΙΑ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΣΚΗΝΟΘΕΤΕΣ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 3
       ArrayList<String>favoritedirectors3=new ArrayList<>();

       //ΠΡΟΣΘΗΚΗ ΑΓΑΠΗΜΕΝΩΝ ΣΚΗΝΟΘΕΤΩΝ ΣΤΟ ARRAYLIST
       favoritedirectors3.add("Aaron Korsh");
       favoritedirectors3.add("Alex Kurtzman");
       
       //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΛΟΓΑΡΙΑΣΜΟΥ 3
       Accounts account3 = new Accounts("eva","evapapadopoulou@gmail.com",1061,myratings3,favoriteactors3,favoritedirectors3);
       accounts.add(new Accounts("eva","evapapadopoulou@gmail.com",1061,myratings3,favoriteactors3,favoritedirectors3));
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Welcome!");
       String title="";
       String inputs="";
       int option1;
       int id = 121;
       int code = 6;
       
       //ΤΟ ΠΡΟΓΡΑΜΜΑ ΕΠΑΝΑΛΑΜΒΑΝΕΤΑΙ ΜΕΧΡΙ Ο ΧΡΗΣΤΗΣ ΝΑ ΔΩΣΕΙ ΤΟΝ ΑΡΙΘΜΟ 5
       do{
            //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ ΕΙΣΟΔΟΥ 
            while(true){
                System.out.println("Please choose one of the below options:");
                System.out.println("1.Show Registration \n2.Show Update \n3.Search for Information & Ratings\n4.Search for Information & Favorite Actor/Director\n5.Exit");
                if(input.hasNextInt()){
                    option1 = input.nextInt();
                    if((option1>=1)&&(option1<=5)){
                        break;
                    }
                }else{
                    input.next();
                }
                System.out.println("Invalid input.Try again!");
            }
            
            switch(option1){
                //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΚΑΤΑΧΩΡΗΣΗ ΘΕΑΜΑΤΟΣ
                case 1 ->{

                    int option2;

                    //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ 
                    while(true){
                        System.out.println("Do you want to register a movie(1) or a series/mini series(2)?");
                        if(input.hasNextInt()){
                            option2 = input.nextInt();
                            if((option2==1)||(option2==2)){
                                break;
                            }
                        }else{
                            input.next();
                        }
                        System.out.println("Invalid input.Try again!");
                    }
                    
                    System.out.println("Please provide us with some informations about the show you want to register.");
                    
                    //ΑΥΞΑΝΕΤΑΙ ΚΑΤΑ 1 Ο ΜΟΝΑΔΙΚΟΣ ΚΩΔΙΚΟΣ ΤΑΥΤΟΠΟΙΗΣΗΣ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΚΑΝΕΙ ΝΕΑ ΚΑΤΑΧΩΡΗΣΗ 
                    code++;
                    
                    //ΖΗΤΑΕΙ ΤΟΝ ΤΙΤΛΟ ΤΟΥ ΘΕΑΜΑΤΟΣ
                    System.out.println("Title:");
                    input.nextLine();
                    title = input.nextLine();
                    
                    //ΖΗΤΑΕΙ ΤΟ ΕΤΟΣ 1ΗΣ ΠΡΟΒΟΛΗΣ ΚΑΙ ΚΑΝΕΙ ΕΛΕΓΧΟ ΕΚΓΥΡΟΤΗΤΑΣ
                    int releaseyear;
                    while(true){
                        System.out.println("Release year:");
                        if(input.hasNextInt()){
                            releaseyear = input.nextInt();
                            break;
                        }else{
                            System.out.println("Invalid input.Try again!");
                            inputs =input.next();
                        }
                        
                    }
                    
                    //ΔΗΜΙΟΥΡΓΕΙ ΤΑ ARRAYLIST ΠΟΥ ΧΡΕΙΑΖΕΤΑΙ ΕΝΑ ΘΕΑΜΑ
                    ArrayList<Double> showratings=new ArrayList<>();
                    ArrayList <String> showactors = new ArrayList<>();
                    ArrayList<String> genreoftheshow = new ArrayList<>();
                    
                    int j = 0;
                    String addnewgenre="";
                    
                    //ΖΗΤΑΕΙ ΤΟ ΕΙΔΟΣ ΘΕΑΜΑΤΟΣ - ΕΝΑ ΘΕΑΜΑ ΜΠΟΡΕΙ ΝΑ ΕΧΕΙ ΜΕΧΡΙ 3 ΕΙΔΗ
                    do{
                        j++;
                        System.out.println("Type:");
                        input.nextLine();
                        String type = input.nextLine();

                        genreoftheshow.add(type);
                        
                        
                        if(j>3){
                            System.out.println("You cant add another genre of this show");
                        }else{
                            System.out.println("Do you want to add another genre of this show?YES/NO");
                            addnewgenre = input.next();
                            
                        }
                        
                    }while(("YES".equals(addnewgenre))&&(j<3));
                    
                    //ΖΗΤΑΕΙ ΤΗΝ ΧΩΡΑ ΠΑΡΑΓΩΓΗΣ
                    System.out.println("Country of production:");
                    input.nextLine();
                    String countryofproduction = input.nextLine();
                    
                    //ΖΗΤΑΕΙ ΤΟΝ ΣΚΗΝΟΘΕΤΗ
                    System.out.println("Director:");
                    
                    String newdirector = input.nextLine();
                    
                    //ΕΛΕΓΧΕΙ ΑΝ Ο ΣΚΗΝΟΘΕΤΗΣ ΕΙΝΑΙ ΗΔΗ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΟ ΣΥΣΤΗΜΑ , ΑΝ ΔΕΝ ΕΙΝΑΙ ΖΗΤΑΕΙ ΔΙΑΦΟΡΑ ΣΤΟΙΧΕΙΑ ΤΟΥ
                    if(!Alldirectors.contains(newdirector)){

                        //ΑΥΞΑΝΕΤΑΙ ΚΑΤΑ 1 Ο ΜΟΝΑΔΙΚΟΣ ΑΡΙΘΜΟΣ ΤΑΥΤΟΠΟΙΗΣΗΣ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΚΑΝΕΙ ΝΕΑ ΚΑΤΑΧΩΡΗΣΗ
                        id ++;
                        
                        Alldirectors.add(newdirector);
                        System.out.println("Now provide us with some informations about the director");
                        
                        //ΖΗΤΑΕΙ ΤΗΝ ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ
                        System.out.println("Birthday:");
                        
                        String birthday = input.nextLine();

                        //ΖΗΤΑΕΙ ΤΗΝ ΧΩΡΑ ΓΕΝΝΝΗΣΗΣ        
                        System.out.println("Birthcountry:");
                        
                        String birthcountry = input.nextLine();
                        
                        //ΖΗΤΑΕΙ ΤΟ WEBSITE 
                        System.out.println("Website:");
                        
                        String website = input.nextLine();
                        
                        //ΔΗΜΙΟΥΡΓΕΙ ΑΝΤΙΚΕΙΜΕΝΟ 
                        Person p = new Person(newdirector,birthcountry,birthday,website,id);
                    }else{
                        
                        System.out.println("This director "+newdirector+" is already registered!");
                    }

                    //ΖΗΤΑΕΙ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ ΤΟΥ ΘΕΑΜΑΤΟΣ 
                    String addnewactor;
                    do{
                        System.out.println("Actor:");
                        input.nextLine();
                        String newactor = input.nextLine();
                        
                        //ΕΛΕΓΧΕΙ ΑΝ ΕΙΝΑΙ ΗΔΗ ΚΑΤΑΧΩΡΗΜΕΝΟΣ Ο ΗΘΟΠΟΙΟΣ ΣΤΟ ΣΥΣΤΗΜΑ , ΑΝ ΔΕΝ ΕΙΝΑΙ ΖΗΤΑΕΙ ΔΙΑΦΟΡΑ ΣΤΟΙΧΕΙΑ ΤΟΥ
                        boolean found2 = false;
                        for(String actor: Allactors){
                            if(actor.equals(newactor)){
                                found2 = true;
                                break;
                            }
                        }
                        if (found2){
                            System.out.println("This actor "+newactor+" is already registered!");
                        }else{

                            //ΑΥΞΑΝΕΤΑΙ ΚΑΤΑ 1 Ο ΜΟΝΑΔΙΚΟΣ ΑΡΙΘΜΟΣ ΤΑΥΤΟΠΟΙΗΣΗΣ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΚΑΝΕΙ ΝΕΑ ΚΑΤΑΧΩΡΗΣΗ
                            id ++;
                        
                            Allactors.add(newactor);
                            System.out.println("Now provide us with some informations about the actor");

                            //ΖΗΤΑΕΙ ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ
                            System.out.println("Birthday:");
                            
                            String birthday = input.nextLine();

                            //ΖΗΤΑΕΙ ΧΩΡΑ ΓΕΝΝΗΣΗΣ    
                            System.out.println("Birthcountry:");
                            
                            String birthcountry = input.nextLine();

                            //ΙΣΤΟΣΕΛΙΔΑ
                            System.out.println("Website:");
                            
                            String website = input.nextLine();

                            //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ
                            Person p = new Person(newactor,birthcountry,birthday,website,id);
                        
                            
                            
                        }
                        
                        //ΠΡΟΣΘΗΚΗ ΤΟΥ ΗΘΟΠΟΙΟΥ ΣΤΟ ARRAYLIST ΤΟΥ ΘΕΑΜΑΤΟΣ
                        showactors.add(newactor);
                        System.out.println("Do you want to add another actor?YES/NO");
                        addnewactor = input.next();
                        
                    }while("YES".equals(addnewactor));

                    
                    switch (option2){

                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΤΑΧΩΡΗΣΕΙ ΤΑΙΝΙΑ
                            case 1-> {
                                    Show newshow = new Show(title,releaseyear,genreoftheshow,countryofproduction,newdirector,showactors,showratings,code,0);
                                    shows.add(new Show(title,releaseyear,genreoftheshow,countryofproduction,newdirector,showactors,showratings,code,0));
                                    System.out.println("Code of the movie:"+code+"\nTitle:"+title+"\nMovie\nGenre:");
                                    
                                        System.out.println(genreoftheshow);
                                    
                                    System.out.println("Name and surname of the director:"+newdirector);
                            }

                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΤΑΧΩΡΗΣΕΙ ΣΕΙΡΕΣ
                            case 2 -> {
                                    System.out.println("Is it a mini series?YES/NO");
                                    String miniseries = input.next();

                                    //ΖΗΤΑΕΙ ΣΕΖΟΝ ΚΑΙ ΚΑΝΕΙ ΕΛΕΓΧΟ ΕΓΚΥΡΟΤΗΤΑΣ
                                    int seasons;
                                    while(true){
                                        System.out.println("Number of seasons:");
                                        if(input.hasNextInt()){
                                            seasons = input.nextInt();
                                            break;
                                        }else{
                                            input.next();
                                            
                                        }
                                        System.out.println("Invalid input.Try again!");
                                    }

                                    //ΖΗΤΑΕΙ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ ΚΑΙ ΚΑΝΕΙ ΕΛΕΓΧΟ ΕΚΓΥΡΟΤΗΤΑΣ
                                    int lastaired;
                                    while(true){
                                        System.out.println("Last year aired:");
                                        if(input.hasNextInt()){
                                            lastaired = input.nextInt();
                                            break;
                                        }else{
                                            input.next();
                                        }
                                        System.out.println("Invalid input.Try again!");
                                    }

                                    //ΔΗΜΙΟΥΡΓΕΙ ARRAYLIST ΓΙΑ ΤΑ ΕΠΕΙΣΟΔΙΑ ΑΝΑ ΣΕΖΟΝ ΤΗΣ ΣΕΙΡΑΣ
                                    ArrayList <Integer> episodesperseasons = new ArrayList<>();

                                    //ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΓΙΑ ΚΑΘΕ ΣΕΖΟΝ ΠΟΣΑ ΕΠΕΙΣΟΔΙΑ ΕΧΕΙ
                                    for(int i=1;i<=seasons;i++){
                                        int episodes;
                                        while(true){
                                            System.out.printf("How many episodes has season %d:\n",i);
                                            if(input.hasNextInt()){
                                                episodes = input.nextInt();
                                                break;
                                            }else{
                                                input.next();
                                            }
                                            System.out.println("Invalid input.Try again!");
                                        }

                                        //ΠΡΟΣΘΗΚΗ ΕΠΕΙΣΟΔΙΩΝ ΣΤΟ ARRAYLIST
                                        episodesperseasons.add(episodes);
                                    }

                                    //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΣΕΙΡΑΣ
                                    Series newshow1 = new Series(title,releaseyear,genreoftheshow,countryofproduction,newdirector,showactors,showratings,code,0,miniseries,seasons,lastaired,episodesperseasons);
                                    shows.add(new Series(title,releaseyear,genreoftheshow,countryofproduction,newdirector,showactors,showratings,code,0,miniseries,seasons,lastaired,episodesperseasons));

                                    //ΑΝ ΔΕΝ ΕΙΝΑΙ ΜΙΝΙ ΣΕΙΡΑ ΝΑ ΕΚΤΥΠΩΝΕΙ:
                                    if("YES".equalsIgnoreCase(miniseries)){
                                        System.out.println("Code of the series:"+code+"\nTitle:"+title+"\nSeries\nGenre");
                                        
                                            System.out.println(genreoftheshow);
                                        
                                        System.out.println("Name and surname of the director:"+newdirector);
                                    //ΑΝ ΕΙΝΑΙ ΜΙΝΙ ΣΕΙΡΑ ΝΑ ΕΚΤΥΠΩΝΕΙ:
                                    }else{
                                        System.out.println("Code of the series:"+code+"\nTitle:"+title+"\nMiniSeries\nGenre");
                                        
                                            System.out.println(genreoftheshow);
                                        
                                        System.out.println("Name and surname of the director:"+newdirector);
                                    }
                            }
                            }
                        }

                //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΣΕΙΡΑΣ
                case 2 -> {

                    //ΕΠΙΛΕΓΕΙ ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΖΗΤΗΣΗ ΜΕ ΤΟΝ ΤΙΤΛΟ Ή ΜΕ ΤΟΝ ΜΟΝΑΔΙΚΟ ΚΩΔΙΚΟ ΤΑΥΤΟΠΟΙΗΣΗΣ ΘΕΑΜΑΤΟΣ
                    //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                    int option3;
                    while(true){
                        System.out.println("Please enter the title(1) or the code(2) of the series you want to update:");
                        if(input.hasNextInt()){
                            option3 = input.nextInt();
                            if((option3==1)||(option3==2)){
                                break;
                            }
                        }else{
                            input.next();
                        }
                        System.out.println("Invalid input. Try again!");
                    }

                    switch(option3){

                        //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΖΗΤΗΣΗ ΜΕ ΒΑΣΗ ΤΟΝ ΤΙΤΛΟ
                        case 1 ->{

                            //ΖΗΤΑΕΙ ΤΟΝ ΤΙΤΛΟ
                            System.out.println("Give us the title:");
                            input.nextLine();
                            String searchupdateofseriestitle = input.nextLine();

                            //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ Η ΣΕΙΡΑ ΣΤΟ ΣΥΣΤΗΜΑ
                            Series foundShow = null;
                            for (Show show : shows) {
                                
                                    if (show instanceof Series series) {
                                        
                                        if ((series.getTitle()).equals(searchupdateofseriestitle)){
                                            foundShow = series;
                                            break;
                                        }
                                    }
                                
                            }
                           
                           //ΑΝ ΥΠΑΡΧΕΙ Η ΣΕΙΡΑ
                            if (foundShow != null) {
                                if (foundShow instanceof Series) {
                                    Series series = (Series) foundShow;
                                    int option4;
                                    
                                    //ΕΠΑΝΑΛΗΠΤΙΚΗ ΤΗΣ ΑΝΑΝΕΩΣΗΣ ΣΕΙΡΑΣ ΜΕΧΡΙ ΝΑ ΔΩΣΕΙ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΑΡΙΘΜΟ 5
                                    do{

                                        //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ 
                                        while(true){
                                            System.out.println("What to you want to update in this series?");
                                            System.out.println("1.Number of seasons\n2.Number of episodes for any season you want\n3.Last aired\n4.Add new actors\n5.Exit of the update");


                                            if(input.hasNextInt()){
                                                option4 = input.nextInt();
                                                if((option4==1)||(option4==2)||(option4==3)||(option4==4)||(option4==5)){
                                                    break;
                                                }
                                            }else{
                                                input.next();
                                            }
                                            System.out.println("Invalid input. Try again!");
                                        }
                                        
                                        //ΕΠΙΛΕΓΕΙ ΤΙ ΕΝΕΡΓΕΙΑ ΣΤΗΝ ΑΝΑΝΕΩΣΗ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ
                                        switch(option4){

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΑΝΑΝΕΩΣΗ ΣΤΟΝ ΑΡΙΘΜΟ ΣΕΖΟΝ ΤΗΣ ΣΕΙΡΑΣ
                                            case 1->{

                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newSeasons;
                                                while(true){
                                                    System.out.println("Give the number of seasons:");
                                                    if(input.hasNextInt()){
                                                        newSeasons=input.nextInt();
                                                        if(newSeasons>foundShow.getSeasons()){
                                                            break;
                                                        }
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input.Try again!");
                                                }

                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟΝ ΑΝΑΝΕΩΜΕΝΟ ΑΡΙΘΜΟ ΣΕΖΟΝ
                                                foundShow.setSeasons(newSeasons);
                                                
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΣΤΑ ΕΠΕΙΣΟΔΙΑ ΟΠΟΙΑΣ ΣΕΖΟΝ ΘΕΛΕΙ
                                            case 2 ->{
                                                System.out.println("Please provide for which season you want to change the number of episodes:");

                                                //ΖΗΤΑΕΙ ΣΕ ΠΟΙΑ ΣΕΖΟΝ ΘΕΛΕΙ ΝΑ ΑΛΛΑΞΕΙ ΤΟΝ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ
                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int season;
                                                while(true){
                                                    System.out.println("Give the number of seasons:");
                                                    if(input.hasNextInt()){
                                                        season=input.nextInt();
                                                        if(season<=foundShow.getSeasons()){
                                                            break;
                                                        }
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input.Try again!");
                                                }

                                                //ΖΗΤΑΕΙ ΤΟΝ ΝΕΟ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ ΣΤΗΝ ΣΕΖΟΝ ΠΟΥ ΕΠΕΛΕΞΕ
                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newepisodesforseason;
                                                while(true){
                                                    System.out.println("How many episodes does this season have?");
                                                    if(input.hasNextInt()){
                                                        newepisodesforseason = input.nextInt();
                                                        break;
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input. Try again!");
                                                }


                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟΝ ΝΕΟ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΘΕΣΗ ΤΟΥ ARRAYLIST ΠΟΥ ΑΝΑΠΑΡΙΣΤΑ ΤΗΝ ΣΕΖΟΝ , ΣΤΗΝ ΣΥΓΚΕΚΡΙΜΕΝΗ ΣΕΙΡΑ
                                                ArrayList<Integer> episodesperseason = foundShow.getEpisodesperseason();
                                                episodesperseason.set(season, newepisodesforseason);
                                                foundShow.setEpisodesperseason(episodesperseason);
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΤΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                            case 3->{

                                                //ΖΗΤΑΕΙ ΤΟ ΝΕΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                                //ΕΛΕΓΧΟ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newlastaired;
                                                while(true){
                                                    System.out.println("Last aired:");
                                                    if(input.hasNextInt()){
                                                        newlastaired = input.nextInt();
                                                        break;
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input. Try again!");
                                                }

                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟ ΝΕΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                                foundShow.setLastaired(newlastaired);
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΠΡΟΣΘΕΣΕΙ ΗΘΟΠΟΙΟΥΣ ΣΤΗΝ ΣΕΙΡΑ
                                            case 4->{

                                                //ΕΠΑΝΑΛΗΠΤΙΚΗ ΠΡΟΣΘΕΣΗΣ ΗΘΟΠΟΙΩΝ ΣΤΗΝ ΣΕΙΡΑ 
                                                String found3;
                                                do {

                                                    //ΖΗΤΑΕΙ ΤΟ ΟΝΟΜΑ ΗΘΟΠΟΙΟΥ ΠΟΥ ΘΕΛΕΙ ΝΑ ΠΡΟΣΘΕΣΕΙ ΣΤΗΝ ΣΕΙΡΑ
                                                    System.out.println("Please enter the name-surname of the actor you want to add to the series:");
                                                    input.nextLine();
                                                    String newactor = input.nextLine();


                                                    //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ ΗΔΗ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΟ ΣΥΣΤΗΜΑ
                                                    boolean found2 = false;
                                                    for(String actor: Allactors){
                                                        if(actor.equals(newactor)){
                                                            found2 = true;
                                                            break;
                                                        }
                                                    }

                                                    //ΑΝ ΥΠΑΡΧΕΙ
                                                    if (found2){
                                                        
                                                        System.out.println("This actor "+newactor+" is already registered in our system!");

                                                        //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ Ο ΗΘΟΠΟΙΟΣ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΥΓΚΕΚΡΙΜΕΝΗ ΣΕΙΡΑ
                                                        ArrayList<String> actors = foundShow.getActors();
                                                        if((foundShow.getActors()).contains(newactor)){

                                                            //ΑΝ ΥΠΑΡΧΕΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΕΙΡΑ 
                                                            System.out.println("This actor "+newactor+" is already registered in the series!");
                                                        }else{
                                                            
                                                            //ΑΝ ΔΕΝ ΥΠΑΡΧΕΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΕΙΡΑ ΤΟΤΕ ΝΑ ΤΟΝ ΠΡΟΣΘΕΣΕΙ
                                                            actors.add(newactor);
                                                            System.out.println("We have successfully added the actor in the series!");
                                                        }
                                                    
                                                    }else{

                                                        //ΑΝ ΔΕΝ ΕΙΝΑΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΟ ΣΥΣΤΗΜΑ ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΝΑ ΔΩΣΕΙ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ
                                                        //ΑΥΞΑΝΕΤΑΙ ΚΑΤΑ 1 Ο ΜΟΝΑΔΙΚΟΣ ΑΡΙΘΜΟΣ ΤΑΥΤΟΠΟΙΗΣΗΣ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΚΑΝΕΙ ΝΕΑ ΚΑΤΑΧΩΡΗΣΗ
                                                        id ++;

                                                        //ΠΡΟΣΘΕΤΕΙ ΤΟΝ ΗΘΟΠΟΙΟ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
                                                        Allactors.add(newactor);
                                                        System.out.println("Now provide us with some informations about the actor");

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ
                                                        System.out.println("Birthday:");
                                                        input.nextLine();
                                                        String birthday = input.nextLine();

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΧΩΡΑ ΓΕΝΝΗΣΗΣ
                                                        System.out.println("Birthcountry:");
                                                        input.nextLine();
                                                        String birthcountry = input.nextLine();

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΙΣΤΟΣΕΛΙΔΑ
                                                        System.out.println("Website:");
                                                        input.nextLine();
                                                        String website = input.nextLine();

                                                        //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΗΘΟΠΟΙΟΥ
                                                        Person p = new Person(newactor,birthcountry,birthday,website,id);

                                                        //ΠΡΟΣΘΕΤΕΙ ΤΟΝ ΗΘΟΠΟΙΟ ΣΤΟ ARRAYLIST ΗΘΟΠΟΙΩΝ ΤΗΣ ΣΕΙΡΑΣ
                                                        ArrayList<String> actors = foundShow.getActors();
                                                        actors.add(newactor);
                                                        
                                                    }
                                                    
                                                    System.out.println("Do you want to add another actor?YES/NO");
                                                    
                                                    found3 =  input.next();
                                                }while(!"NO".equals(found3)); //ΤΕΛΟΣ ΠΡΟΣΘΗΚΗΣ ΗΘΟΠΟΙΩΝ
                                            }
                                        }
                                    }while(option4!=5); //ΤΕΛΟΣ ΑΝΑΝΕΩΣΗΣ
                                }
                            }else{
                                System.out.println("There is no such series in the system!");
                            }
                        }

                        //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΜΕ ΒΑΣΗ ΤΟΝ ΜΟΝΑΔΙΚΟ ΚΩΔΙΚΟ ΤΑΥΤΟΠΟΙΗΣΗΣ ΣΕΙΡΑΣ
                        case 2 ->{
                            
                            //ΖΗΤΑΕΙ ΤΟΝ ΜΟΝΑΔΙΚΟ ΚΩΔΙΚΟ ΤΑΥΤΟΠΟΙΗΣΗΣ ΤΗΣ ΣΕΙΡΑΣ
                            //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                            int searchupdateofseriescode;
                            while(true){
                                System.out.println("Code of the series:");
                                if(input.hasNextInt()){
                                    searchupdateofseriescode = input.nextInt();
                                    break;
                                }else{
                                    input.next();
                                }
                                System.out.println("Invalid input. Try again!");
                            }

                            //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ Η ΣΕΙΡΑ ΣΤΟ ΣΥΣΤΗΜΑ
                            Series foundShow2 = null;
                            for (Show show : shows) {
                                if (show instanceof Series series) {
                                    if (series.getCode()==(searchupdateofseriescode)){
                                        foundShow2 = series;
                                        break;
                                    }
                                    
                                }
                            }

                            //ΑΝ ΥΠΑΡΧΕΙ Η ΣΕΙΡΑ
                            if (foundShow2 != null) {
                                if (foundShow2 instanceof Series) {
                                    Series series = (Series) foundShow2;
                                    int option4;
                                    
                                    //ΕΠΑΝΑΛΗΠΤΙΚΗ ΤΗΣ ΑΝΑΝΕΩΣΗΣ ΣΕΙΡΑΣ ΜΕΧΡΙ ΝΑ ΔΩΣΕΙ Ο ΧΡΗΣΤΗΣ ΤΟΝ ΑΡΙΘΜΟ 5
                                    do{
                                        
                                        //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                        while(true){
                                            System.out.println("What do you want to update in this series?");
                                            System.out.println("1.Number of seasons\n2.Number of episodes for any season you want\n3.Last aired\n4.Add new actors\n5.Exit of the update");
                                            if(input.hasNextInt()){
                                                option4 = input.nextInt();
                                                if((option4>=1)&&(option4<=5)){
                                                   break; 
                                                }
                                            }else{
                                                input.next();
                                            }
                                            System.out.println("Invalid input. Try again!");
                                        }

                                        //ΕΠΙΛΕΓΕΙ ΤΙ ΕΝΕΡΓΕΙΑ ΣΤΗΝ ΑΝΑΝΕΩΣΗ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ
                                        switch(option4){

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΑΝΑΝΕΩΣΗ ΣΤΟΝ ΑΡΙΘΜΟ ΣΕΖΟΝ ΤΗΣ ΣΕΙΡΑΣ
                                            case 1->{

                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newSeasons;
                                                while(true){
                                                    System.out.println("Give the number of seasons:");
                                                    if(input.hasNextInt()){
                                                        newSeasons=input.nextInt();
                                                        if(newSeasons>foundShow2.getSeasons()){
                                                            break;
                                                        }
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input.Try again!");
                                                }

                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟΝ ΑΝΑΝΕΩΜΕΝΟ ΑΡΙΘΜΟ ΣΕΖΟΝ
                                                foundShow2.setSeasons(newSeasons);
                                                
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΣΤΑ ΕΠΕΙΣΟΔΙΑ ΟΠΟΙΑΣ ΣΕΖΟΝ ΘΕΛΕΙ
                                            case 2 ->{
                                                System.out.println("Please provide for which season you want to change the number of episodes:");

                                                //ΖΗΤΑΕΙ ΣΕ ΠΟΙΑ ΣΕΖΟΝ ΘΕΛΕΙ ΝΑ ΑΛΛΑΞΕΙ ΤΟΝ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ
                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int season;
                                                while(true){
                                                    System.out.println("Give the number of seasons:");
                                                    if(input.hasNextInt()){
                                                        season=input.nextInt();
                                                        if(season<=foundShow2.getSeasons()){
                                                            break;
                                                        }
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input.Try again!");
                                                }
                                                
                                                //ΖΗΤΑΕΙ ΤΟΝ ΝΕΟ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ ΣΤΗΝ ΣΕΖΟΝ ΠΟΥ ΕΠΕΛΕΞΕ
                                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newepisodesforseason;
                                                while(true){
                                                    if(input.hasNextInt()){
                                                        System.out.println("How many episodes does this season have?");
                                                        newepisodesforseason = input.nextInt();
                                                        break;
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input. Try again!");
                                                }

                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟΝ ΝΕΟ ΑΡΙΘΜΟ ΕΠΕΙΣΟΔΙΩΝ ΣΤΗΝ ΑΝΤΙΣΤΟΙΧΗ ΘΕΣΗ ΤΟΥ ARRAYLIST ΠΟΥ ΑΝΑΠΑΡΙΣΤΑ ΤΗΝ ΣΕΖΟΝ , ΣΤΗΝ ΣΥΓΚΕΚΡΙΜΕΝΗ ΣΕΙΡΑ
                                                ArrayList<Integer> episodesperseason = foundShow2.getEpisodesperseason();
                                                episodesperseason.set(season, newepisodesforseason);
                                                foundShow2.setEpisodesperseason(episodesperseason);
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΚΑΝΕΙ ΑΝΑΝΕΩΣΗ ΤΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                            case 3->{

                                                //ΖΗΤΑΕΙ ΤΟ ΝΕΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                                //ΕΛΕΓΧΟ ΕΓΚΥΡΟΤΗΤΑΣ
                                                int newlastaired;
                                                while(true){
                                                    if(input.hasNextInt()){
                                                        newlastaired = input.nextInt();
                                                        break;
                                                    }else{
                                                        input.next();
                                                    }
                                                    System.out.println("Invalid input. Try again!");
                                                }

                                                //ΑΠΟΘΗΚΕΥΕΙ ΤΟ ΝΕΟ ΕΤΟΣ ΤΕΛΕΥΤΑΙΑΣ ΠΡΟΒΟΛΗΣ
                                                foundShow2.setLastaired(newlastaired);
                                            }

                                            //ΑΝ ΘΕΛΕΙ ΝΑ ΠΡΟΣΘΕΣΕΙ ΗΘΟΠΟΙΟΥΣ ΣΤΗΝ ΣΕΙΡΑ
                                            case 4->{

                                                //ΕΠΑΝΑΛΗΠΤΙΚΗ ΠΡΟΣΘΕΣΗΣ ΗΘΟΠΟΙΩΝ ΣΤΗΝ ΣΕΙΡΑ 
                                                String found3;
                                                do {

                                                    //ΖΗΤΑΕΙ ΤΟ ΟΝΟΜΑ ΗΘΟΠΟΙΟΥ ΠΟΥ ΘΕΛΕΙ ΝΑ ΠΡΟΣΘΕΣΕΙ ΣΤΗΝ ΣΕΙΡΑ
                                                    System.out.println("Please enter the name-surname of the actor you want to add to the series:");
                                                    input.nextLine();
                                                    String newactor = input.nextLine();

                                                    //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ ΗΔΗ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΟ ΣΥΣΤΗΜΑ
                                                    boolean found2 = false;
                                                    
                                                        if(Allactors.contains(newactor)){
                                                            found2 = true;
                                                            
                                                        }
                                                    
                                                    //ΑΝ ΥΠΑΡΧΕΙ
                                                    if (found2){
                                                        
                                                        System.out.println("This actor "+newactor+" is already registered in our system!");

                                                        //ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΕΙ Ο ΗΘΟΠΟΙΟΣ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΥΓΚΕΚΡΙΜΕΝΗ ΣΕΙΡΑ
                                                        ArrayList<String> actors= foundShow2.getActors();
                                                        if(foundShow2.getActors().contains(newactor)){

                                                            //ΑΝ ΥΠΑΡΧΕΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΕΙΡΑ
                                                            System.out.println("This actor "+newactor+" is already registered in the series!");
                                                        }else{

                                                            //ΑΝ ΔΕΝ ΥΠΑΡΧΕΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΗΝ ΣΕΙΡΑ ΤΟΤΕ ΝΑ ΤΟΝ ΠΡΟΣΘΕΣΕΙ
                                                            actors.add(newactor);
                                                            System.out.println("We have successfully added the actor in the series!");
                                                        }
                                                        
                                                    }else{

                                                        //ΑΝ ΔΕΝ ΕΙΝΑΙ ΚΑΤΑΧΩΡΗΜΕΝΟΣ ΣΤΟ ΣΥΣΤΗΜΑ ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΝΑ ΔΩΣΕΙ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ
                                                        //ΑΥΞΑΝΕΤΑΙ ΚΑΤΑ 1 Ο ΜΟΝΑΔΙΚΟΣ ΑΡΙΘΜΟΣ ΤΑΥΤΟΠΟΙΗΣΗΣ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΚΑΝΕΙ ΝΕΑ ΚΑΤΑΧΩΡΗΣΗ
                                                        id ++;

                                                        //ΠΡΟΣΘΕΤΕΙ ΤΟΝ ΗΘΟΠΟΙΟ ΣΤΟ ARRAYLIST ΜΕ ΟΛΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
                                                        Allactors.add(newactor);
                                                        System.out.println("Now provide us with some informations about the actor");

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ
                                                        System.out.println("Birthday:");
                                                        input.nextLine();
                                                        String birthday = input.nextLine();

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΧΩΡΑ ΓΕΝΝΗΣΗΣ
                                                        System.out.println("Birthcountry:");
                                                        input.nextLine();
                                                        String birthcountry = input.nextLine();

                                                        //ΖΗΤΑΕΙ ΤΗΝ ΙΣΤΟΣΕΛΙΔΑ
                                                        System.out.println("Website:");
                                                        input.nextLine();
                                                        String website = input.nextLine();
                                                        
                                                        //ΔΗΜΙΟΥΡΓΙΑ ΑΝΤΙΚΕΙΜΕΝΟΥ ΗΘΟΠΟΙΟΥ
                                                        Person p = new Person(newactor,birthcountry,birthday,website,id);

                                                        //ΠΡΟΣΘΕΤΕΙ ΤΟΝ ΗΘΟΠΟΙΟ ΣΤΟ ARRAYLIST ΗΘΟΠΟΙΩΝ ΤΗΣ ΣΕΙΡΑΣ
                                                        ArrayList<String> actors = foundShow2.getActors();
                                                        actors.add(newactor);
                                                        
                                                    }
                                                    
                                                    System.out.println("Do you want to add another actor?YES/NO");
                                                    
                                                    found3 =  input.next();
                                                }while(!"NO".equals(found3)); //ΤΕΛΟΣ ΠΡΟΣΘΗΚΗΣ ΗΘΟΠΟΙΩΝ
                                            }
                                        }
                                    }while(option4!=5); //ΤΕΛΟΣ ΑΝΑΝΕΩΣΗΣ
                                }
                            }else{
                                System.out.println("There is no such series in the system!");
                            }
                        }
                    }
                }

                //ΑΝ ΘΕΛΕΙ ΝΑ ΒΡΕΙ ΠΛΗΡΟΦΟΡΙΕΣ ΓΙΑ ΗΘΟΠΟΙΟ/ΣΚΗΝΟΘΕΤΗ ΚΑΙ ΑΞΙΟΛΟΓΗΣΕΙΣ
                case 3->{

                    //ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΝΑ ΚΑΝΕΙ SIGN IN/SIGN UP
                   
                   int option5;

                   //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                   while(true){
                        System.out.println("1.Sign in\n2.Register");
                       if(input.hasNextInt()){
                           option5 = input.nextInt();
                           if((option5==1)||(option5==2)){
                               break;
                           }
                       }else{
                           input.next();
                       }
                       System.out.println("Invalid input. Try again!");
                   }

                   Accounts thisaccount=null;

                   switch(option5){

                        //ΑΝ ΕΠΕΛΕΞΕ ΝΑ ΚΑΝΕΙ SIGN IN 
                       case 1->{

                            //ΖΗΤΑΕΙ ΕΜΑΙΛ
                           System.out.println("Please provide your email:");
                           input.nextLine();
                           String email = input.nextLine();

                           //ΖΗΤΑΕΙ ΚΩΔΙΚΟ
                           System.out.println("and your password:");
                           int password;

                           //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                           while(true){
                               if(input.hasNextInt()){
                                   password = input.nextInt();
                                   break;
                               }else{
                                   input.next();
                               }
                               System.out.println("Invalid input. Try again!");
                           }

                           //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ Ο ΛΟΓΑΡΙΑΣΜΟΣ
                           for(Accounts user: accounts){
                               if((user.getEmail().equals(email))&&user.getPassword()==password){
                                   thisaccount=user;
                               }
                            }
                            if(thisaccount==null){
                                System.out.println("This account does not exist in our system!");
                            }
                       }

                       //ΑΝ ΕΠΕΛΕΞΕ ΝΑ ΚΑΝΕΙ ΕΓΓΡΑΦΗ
                       case 2->{

                        //ΖΗΤΑΕΙ ΟΝΟΜΑ
                           System.out.println("Please provide your username:");
                           
                           String username = input.next();

                           //ΖΗΤΑΕΙ ΕΜΑΙΛ
                           System.out.println("Now give us your email:");
                           input.nextLine();
                           String email = input.next();

                           //ΖΗΤΑΕΙ ΚΩΔΙΚΟ
                           System.out.println("and your password:");
                           int password;

                           //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                           while(true){
                               if(input.hasNextInt()){
                                   password = input.nextInt();
                                   break;
                               }else{
                                   input.next();
                               }
                               System.out.println("Invalid input. Try again!");
                           }

                           //ΔΗΜΙΟΥΡΓΙΑ ΚΑΤΑΛΛΗΛΩΝ ARRAYLIST ΓΙΑ ΤΟΝ ΝΕΟ ΛΟΓΑΡΙΑΣΜΟ
                           ArrayList<Double> myratings = new ArrayList<>();
                           ArrayList<String> favoriteactors = new ArrayList<>();
                           ArrayList<String> favoritedirectors = new ArrayList<>();
                           Accounts a = new Accounts(username,email,password,myratings,favoriteactors,favoritedirectors);
                           thisaccount=a;
                       }
                    }

                    //ΑΝ ΥΠΑΡΧΕΙ/ΦΤΙΑΧΤΗΚΕ Ο ΛΟΓΑΡΙΑΣΜΟΣ
                    if(thisaccount!=null){
                        Show foundShow3 = null;

                        //ΖΗΤΑΕΙ ΝΑ ΕΠΙΛΕΞΕΙ ΑΝ ΘΑ ΑΝΑΖΗΤΗΣΕΙ ΒΑΣΗ ΤΙΤΛΟΥ Ή ΕΤΟΥΣ 1ΗΣ ΠΡΟΒΟΛΗΣ
                        System.out.println("Please provide us with the title(1) or with the release year(2) of the show you want to find information about");
                        int option6;

                        //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                        while(true){
                            if(input.hasNextInt()){
                                option6 = input.nextInt();
                                if ((option6==1)||(option6==2)){
                                    break;
                                }
                            }else{
                                input.next();
                            }
                            System.out.println("Invalid input. Try again!");
                        }
                        
                        title=" ";
                        int releaseyear=0;
                        
                        //ΜΕ ΤΙ ΘΑ ΚΑΝΕΙ ΑΝΑΖΗΤΗΣΗ Ο ΧΡΗΣΤΗΣ
                        switch(option6){
                            
                            //ΜΕ ΒΑΣΗ ΤΟΝ ΤΙΤΛΟ
                            case 1->{
                                
                                //ΖΗΤΑΕΙ ΤΟΝ ΤΙΤΛΟ
                                System.out.println("Title:");
                                input.nextLine();
                                title = input.nextLine();

                            }

                            //ΜΕ ΒΑΣΗ ΕΤΟΣ 1ΗΣ ΠΡΟΒΟΛΗΣ
                            case 2->{

                                //ΖΗΤΑΕΙ ΕΤΟΣ 1ΗΣ ΠΡΟΒΟΛΗΣ
                                //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                                while(true){
                                    System.out.println("Release year:");
                                    if(input.hasNextInt()){
                                        releaseyear = input.nextInt();
                                        break;
                                    }else{
                                        input.next();
                                    }
                                    System.out.println("Invalid input. Try again!");
                                }

                            }
                            
                        }

                        //ΑΝΑΖΗΤΗΣΗ ΘΕΑΜΑΤΟΣ
                        for (Show showforinformation : shows) {
                            
                            double totalrating=0;
                            int numberofratings=0;
                            
                            
                            if ((showforinformation.getTitle().equals(title))||(showforinformation.getReleaseYear()==releaseyear)){
                                foundShow3 = showforinformation;
                                
                            }else{
                                foundShow3=null;
                            } 

                            //ΑΝ ΒΡΕΘΗΚΕ ΤΟ ΘΕΑΜΑ ΕΚΤΥΠΩΝΕΙ ΚΑΠΟΙΑ ΣΤΟΙΧΕΙΑ 
                            if(foundShow3!=null){
                                System.out.println("Title:"+foundShow3.getTitle());
                                System.out.println("Code:"+foundShow3.getCode());
                                System.out.println("Release year:"+foundShow3.getReleaseYear());
                                System.out.println("Genre:"+foundShow3.getGenre());
                                System.out.println("Director:"+foundShow3.getDirector());
                                
                                //ΥΠΟΛΟΓΙΣΜΟΣ ΜΕΣΗΣ ΒΑΘΜΟΛΟΓΙΑΣ
                                for(double rating: foundShow3.getRating()){
                                    totalrating+= rating;
                                    numberofratings++;
                                }
                                double averagerating=totalrating/numberofratings;
                                System.out.println("Average rating:"+averagerating);

                                //ΑΠΟΘΗΚΕΥΣΗ ΜΕΣΗΣ ΒΑΘΜΟΛΟΓΙΑΣ ΤΟΥ ΘΕΑΜΑΤΟΣ
                                foundShow3.setAveragerating(averagerating);
                                
                                //ΑΝ ΕΙΝΑΙ ΣΕΙΡΑ ΕΚΤΥΠΩΝΕΙ ΚΑΠΟΙΑ ΕΞΤΡΑ ΣΤΟΙΧΕΙΑ
                                if(showforinformation instanceof Series){
                                    Series series =(Series)foundShow3;
                                    
                                    System.out.println("Last aired:"+series.getLastaired());
                                    System.out.println("Number of seasons:"+series.getSeasons());
                                    
                                }

                                
                                System.out.println("Do you wanna rate this show?YES/NO");
                                String option7 = input.next();

                                //ΑΝ ΘΕΛΕΙ Ο ΧΡΗΣΤΗΣ ΝΑ ΒΑΘΜΟΛΟΓΗΣΕΙ ΤΟ ΘΕΑΜΑ
                                if("YES".equals(option7)){
                                    double ratethisshow = 0.0;
                                    String rating2;

                                    //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ 
                                    while(true){
                                        System.out.println("Please provide the score, between 1 and 10, for this show:");
                                        
                                        rating2 = input.next();
                                        try{
                                            ratethisshow = Double.parseDouble(rating2);
                                            if(ratethisshow>=1.0 && ratethisshow <= 10.0){
                                                break;
                                            }else{
                                                System.out.println("Invalid input.Try again!");
                                            }
                                        } catch (NumberFormatException e){
                                            System.out.println("Invalid input.Try again!");
                                        }
                                       
                                        
                                    }
                                    
                                    //ΑΠΟΘΗΚΕΥΣΗ ΑΞΙΟΛΟΓΗΣΗΣ ΣΤΗΝ ΛΙΣΤΑ ΑΞΙΟΛΟΓΗΣΕΩΝ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ
                                    ArrayList<Double> myratings=thisaccount.getMyratings();
                                    myratings.set((foundShow3.getCode()+1),ratethisshow);
                                    thisaccount.setMyratings(myratings);

                                    //ΑΠΟΘΗΚΕΥΣΗ ΑΞΙΟΛΟΓΗΣΗΣ ΣΤΗΝ ΛΙΣΤΑ ΑΞΙΟΛΟΓΗΣΕΩΝ ΤΟΥ ΘΕΑΜΑΤΟΣ
                                    ArrayList<Double>rating= foundShow3.getRating();
                                    rating.add(ratethisshow);
                                }
                                
                                System.out.println("Do you wanna see all ratings for this show?YES/NO");
                                String option8=input.next();

                                //ΑΝ ΘΕΛΕΙ Π ΧΡΗΣΤΗΣ ΝΑ ΔΕΙ ΟΛΕΣ ΤΙΣ ΑΞΙΟΛΟΓΗΣΕΙΣ ΓΙΑ ΤΟ ΘΕΑΜΑ ΑΥΤΟ
                                if("YES".equals(option8)){
                                    System.out.println("Ratings:"+foundShow3.getRating());
                                }
                                
                            }
                        }
                        System.out.println("Do you wanna see all your ratings?YES/NO");
                        String option9=input.next();

                        //ΑΝ ΘΕΛΕΙ Ο ΧΡΗΣΤΗΣ ΝΑ ΔΕΙ ΟΛΕΣ ΤΙΣ ΑΞΙΟΛΟΓΗΣΕΙΣ ΤΟΥ
                        if("YES".equals(option9)){
                            ArrayList<Double>myratings= thisaccount.getMyratings();
                            for(int k=0;k<myratings.size();k++){
                                Double rate = myratings.get(k);
                                for(Show show: shows){
                                    if(show.getCode()==(k-1)){ 

                                        //ΕΚΤΥΠΩΣΗ ΤΙΤΛΟΥ ΓΙΑ ΚΑΘΕ ΘΕΑΜΑ
                                        System.out.println("Title:"+show.getTitle());
                                    }
                                }
                                double rating = myratings.get(k);

                                //ΕΚΤΥΠΩΣΗ ΑΞΙΟΛΟΓΗΣΗΣ ΓΙΑ ΚΑΘΕ ΘΕΑΜΑ 
                                System.out.println("My rating:"+rating);
                            }
                        }
                    }
                }
    //ΑΝ ΘΕΛΕΙ ΝΑ ΔΕΙ ΠΛΉΡΟΦΟΡΙΕΣ ΚΑΙ ΑΓΑΠΗΜΕΝΟΣ ΗΘΟΠΟΙΟΣ/ΣΚΗΝΟΘΕΤΗΣ
	case 4->{
                    
                    //ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΝΑ ΚΑΝΕΙ SIGN IN/SIGN UP
                    int option5;

                    //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                    while(true){
                        System.out.println("1.Sign in\n2.Register");
                        if(input.hasNextInt()){
                            option5 = input.nextInt();
                            if((option5==1)||(option5==2)){
                               break ;
                            }
                        }else{
                            input.next();
                        }
                        System.out.println("Invalid input. Try again!");
                    }

                    Accounts thisaccount=null;

                    switch(option5){

                        //ΑΝ ΕΠΕΛΕΞΕ ΝΑ ΚΑΝΕΙ SIGN IN 
                        case 1->{

                            //ΖΗΤΑΕΙ ΕΜΑΙΛ
                            System.out.println("Please provide your email:");
                            String email = input.next();
                            
                            //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                            int password;
                            while(true){

                                //ΖΗΤΑΕΙ ΚΩΔΙΚΟ
                                System.out.println("and your password:");
                                if(input.hasNextInt()){
                                    password = input.nextInt();
                                    break;
                                }else{
                                    input.next();
                                }
                                System.out.println("Invalid input. Try again!");
                            }

                            //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ Ο ΛΟΓΑΡΙΑΣΜΟΣ
                            for(Accounts user: accounts){
                                if((user.getEmail().equals(email))&&(user.getPassword()==password)){
                                   thisaccount=user;
                                }
                            }
                            if(thisaccount==null){
                                System.out.println("This account does not exist in our system!");
                            }
                        }

                        //ΑΝ ΕΠΕΛΕΞΕ ΝΑ ΚΑΝΕΙ ΕΓΓΡΑΦΗ
                        case 2->{

                            //ΖΗΤΑΕΙ ΟΝΟΜΑ
                            System.out.println("Please provide your username:");
                            input.nextLine();
                            String username = input.nextLine();

                            //ΖΗΤΑΕΙ ΕΜΑΙΛ
                            System.out.println("Now give us your email:");
                            input.nextLine();
                            String email = input.nextLine();

                            //ΖΗΤΑΕΙ ΚΩΔΙΚΟ
                            //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ
                            int password;
                            while(true){
                                System.out.println("and your password:");
                                if(input.hasNextInt()){
                                    password = input.nextInt();
                                    break;
                                }else{
                                    input.next();
                                }
                                System.out.println("Invalid input. Try again!");
                            }

                            //ΔΗΜΙΟΥΡΓΙΑ ΚΑΤΑΛΛΗΛΩΝ ARRAYLIST ΓΙΑ ΤΟΝ ΝΕΟ ΛΟΓΑΡΙΑΣΜΟ
                            ArrayList<Double> myratings = new ArrayList<>();
                            ArrayList<String> favoriteactors = new ArrayList<>();
                            ArrayList<String> favoritedirectors = new ArrayList<>();
                            Accounts a = new Accounts(username,email,password,myratings,favoriteactors,favoritedirectors);
                            thisaccount=a;
                        }
                    }
                    Person foundperson=null;
                    System.out.println("Please give us the name-surname of the actor or the director you wanna find information about:");
                    input.nextLine();
                    String personforinformation = input.nextLine();

                    //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ Ο ΗΘΟΠΟΙΟΣ/ΣΚΗΝΟΘΕΤΗΣ
                    for(Person searchperson: person){
                        if(searchperson.getNamesurname().equals(personforinformation)){
                            foundperson = searchperson;
                            break;
                        }
                    }

                    //ΑΝ ΥΠΑΡΧΕΙ 
                    if(foundperson!=null){

                        //ΕΚΤΥΠΩΝΕΙ ΚΑΠΟΙΑ ΣΤΟΙΧΕΙΑ ΤΟΥ
                        System.out.println("Id:"+foundperson.getId());
                        System.out.println("Name-surname:"+foundperson.getNamesurname());

                        //ΕΚΤΥΠΩΝΕΙ ΤΟΥΣ ΤΙΤΛΟΥΣ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΛΑΒΕΙ ΜΕΡΟΣ
                        for(Show searchshow: shows){
                            
                            if(searchshow.getDirector().equals(foundperson)||(searchshow.getActors().equals(foundperson))){
                                System.out.println("Show: "+searchshow.getTitle());
                            }    
                        }
                        System.out.println("Do you want to see the show with the highest average rating and the show with the lowest average rating in which "+foundperson+"has participated in ? YES/NO");
                        String option9 = input.next();

                        //ΑΝ ΘΕΛΕΙ ΤΗΝ ΜΕΓΑΛΥΤΕΡΗ ΚΑΙ ΤΗΝ ΜΙΚΡΟΤΕΡΗ ΒΑΘΜΟΛΟΓΙΑ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΠΑΡΕΙ ΜΕΡΟΣ Ο ΗΘΟΠΟΙΟΣ/ΣΚΗΝΟΘΕΤΗΣ
                        if("YES".equals(option9)){
                            double maxrate=-1;
                            String maxshow="";
                            double minrate=11;
                            String minshow="";
                            
                            //ΥΠΟΛΟΓΙΣΜΟΣ ΜΕΓΑΛΥΤΕΡΗΣ ΚΑΙ ΜΙΚΡΟΤΕΡΗΣ ΒΑΘΜΟΛΟΓΙΑΣ
                            for(Show searchshow: shows){
                                if(searchshow.getDirector().equals(foundperson)||(searchshow.getActors().contains(foundperson))){
                                    System.out.println("Show:"+searchshow.getTitle());
                                    if(searchshow.getAveragerating()>maxrate){
                                        maxrate = searchshow.getAveragerating();
                                        maxshow = searchshow.getTitle();
                                    }
                                    if(searchshow.getAveragerating()<minrate){
                                        minrate = searchshow.getAveragerating();
                                        minshow = searchshow.getTitle();
                                    }
                                }    
                            }

                            //ΕΚΤΥΠΩΣΗ ΑΠΟΤΕΛΕΣΜΑΤΩΝ
                            System.out.println("The show with the highest average rating is "+maxshow+" with "+maxrate);
                            System.out.println("The show with the lowest average rating is "+minshow+" with "+minrate);
                        }
                    }
                    System.out.println("Do you wanna add actor or director to your favorite list?YES/NO");
                    String option10 = input.next();

                    //ΑΝ ΘΕΛΕΙ ΝΑ ΠΡΟΣΘΕΣΕΙ ΣΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΤΟΥ
                    if("YES".equals(option10)){

                        //ΕΚΤΥΠΩΣΗ ΟΛΩΝ ΤΩΝ ΗΘΟΠΟΙΩΝ/ΣΚΗΝΟΘΕΤΩΝ ΠΟΥ ΥΠΑΡΧΟΥΝ ΣΤΟ ΣΥΣΤΗΜΑ 
                        System.out.println(""+Alldirectors);
                        System.out.println(""+Allactors);

                        //ΖΗΤΑΕΙ ΟΝΟΜΑ 
                        System.out.println("Give us the name of the actor/director you wanna add, from the lists above ,to your favorite list");
                        input.nextLine();
                        String nametoaddtofavorite = input.nextLine();

                        //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΤΟΥΣ ΣΚΗΝΟΘΕΤΕΣ
                        boolean found4=false;
                        for(String s1 : Alldirectors){
                           if(s1.equals(nametoaddtofavorite)){
                               found4=true;
                               break;
                           }
                        }

                        //ΑΝ ΥΠΑΡΧΕΙ ΝΑ ΤΟΝ ΠΡΟΣΘΕΤΕΙ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΤΟΥ ΣΚΗΝΟΘΕΤΕΣ
                        if(found4){
                            ArrayList<String>myfavoritedirectors = thisaccount.getFavoritedirectors();
                            myfavoritedirectors.add(nametoaddtofavorite);
                        }

                        //ΕΛΕΓΧΟΣ ΑΝ ΥΠΑΡΧΕΙ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
                        boolean found5=false;
                        for(String s2: Allactors){
                            if(s2.equals(nametoaddtofavorite)){
                                found5=true;
                                break;
                            }
                        }

                        //ΑΝ ΥΠΑΡΧΕΙ ΝΑ ΤΟΝ ΠΡΟΣΘΕΤΕΙ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΤΟΥΣ ΗΘΟΠΟΙΟΥΣ
                        if(found5){
                            ArrayList<String>myfavoriteactors = thisaccount.getFavoriteactors();
                            myfavoriteactors.add(nametoaddtofavorite);
                        }
                    }
                    
                    System.out.println("Do you want to see your list of your favorite actors or directors?YES/NO");
                    
                    String option12 = input.next();

                    //ΑΝ ΘΕΛΕΙ ΝΑ ΔΕΙ ΤΟΥΣ ΑΓΑΠΗΜΕΝΟΥΣ ΤΟΥ ΕΚΤΥΠΩΝΟΝΤΑΙ ΟΙ ΛΙΣΤΕΣ
                    if("YES".equals(option12)){
                        System.out.println("Favorite actors"+thisaccount.getFavoriteactors());
                        System.out.println("Favorite directors"+thisaccount.getFavoritedirectors());
                    }
                }
            }
        }while(option1!=5); //ΤΕΛΟΣ ΠΡΟΓΡΑΜΜΑΤΟΣ
        System.out.println("Thank you!");
    }   
}
