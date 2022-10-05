package com.hmdb.hmdb;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    static {
        new Movie(
                1,
                "The Shining",
                "The Shining is a 1980 psychological horror film produced and directed by Stanley Kubrick and co-written with novelist Diane Johnson. The film is based on Stephen King's 1977 novel of the same name and stars Jack Nicholson, Shelley Duvall, Scatman Crothers, and Danny Lloyd.",
                1980);

        new Movie(
                2,
                "Lady Killer",
                "Lucien Bourrache, a good looking non-commissioned officer at the Spahis, is used to charm many women. He met Madeleine Courtois at Cannes. She is beautiful and lives in luxury. He lends her a large amount of money, which she loses gambling. Then she drops him. But Lucien is now in love, and once demobilized, he goes to Paris to find her again. But he's not so sexy without his uniform, and Madeleine and him do not belong to the same milieu.",
                1937);

        new Movie(
                3,
                "A Doll's House",
                "Years ago, Nora Helmer (Claire Bloom) committed a forgery in order to save the life of her authoritarian husband Torvald (Sir Anthony Hopkins). Now she is being blackmailed and lives in fear of her husband finding out, and of the shame such a revelation would bring to his career. But when the truth comes out, Nora is shocked to learn where she really stands in her husband's esteem.",
                1973);
    }

    public Movie(Integer id, String title, String description, Integer year) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }
}
