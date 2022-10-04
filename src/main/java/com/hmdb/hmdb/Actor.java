package com.hmdb.hmdb;

import java.util.ArrayList;

public class Actor {
    
    public static ArrayList<Actor> actors = new ArrayList<>();

    public Actor(int id, String firstName, String lastName, int birthYear, int movieId) {
    }

    public Integer id;
    public String firstName;
    public String lastName;
    public Integer birthYear;
    public Integer movieId;

    static {
       new Actor(1, "Jean", "Gabin", 1904, 2);
       new Actor(2, "Anthony", "Hopkins", 1937, 3);
       new Actor(3, "Jack", "Nicholson", 1937, 1);
    }



}
