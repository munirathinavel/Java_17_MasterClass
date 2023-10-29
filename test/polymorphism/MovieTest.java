package polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void watchMovie() {
        Movie leo = Movie.getMovie("Leo", TYPE.ADVENTURE);
        leo.watchMovie();

        Movie jawan = Movie.getMovie("Jawan", TYPE.COMEDY);
        jawan.watchMovie();

        Movie starWars = Movie.getMovie("Star Wars", TYPE.SCIENCE);
        starWars.watchMovie();

    }

    @Test
    void watchMovieWithTypeReference() {
        Object movie = Movie.getMovie("Leo", TYPE.ADVENTURE);
//        movie.watchMovie(); // Doesn't work
        Movie movie1 = Movie.getMovie("Leo", TYPE.ADVENTURE);
        movie1.watchMovie(); // This works
//        movie1.watchAdventure() // doesn't work
        var movie2 = Movie.getMovie("Leo", TYPE.ADVENTURE) ;
        movie2.watchMovie(); // This works.
//        movie2.watchAdventure() // doesn't work

        var adventure = new Adventure("Leo");
        adventure.watchAdventure();
        System.out.println("------");
    }

    @Test
    void watchMovieWithTypeCasting() {
        Object movie = Movie.getMovie("Leo", TYPE.ADVENTURE);
        if (movie.getClass().getSimpleName().equals("Adventure")) {
            ((Adventure) movie).watchAdventure();
        } else if (movie instanceof Adventure) {
            ((Adventure) movie).watchAdventure();
        } else if( movie instanceof Adventure adventure) { // Avaialable since Java 16
            adventure.watchAdventure();
        }
        System.out.println("------");
    }
}