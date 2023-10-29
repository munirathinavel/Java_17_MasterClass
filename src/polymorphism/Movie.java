package polymorphism;

enum TYPE {
    ADVENTURE,
    COMEDY,
    SCIENCE
}
public class Movie {
    private final String title;
    private TYPE type;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String title, TYPE type) {
        return switch (type) {
            case ADVENTURE -> new Adventure(title);
            case COMEDY -> new Comedy(title);
            case SCIENCE -> new Science(title);
            default -> new Movie(title);
        };
    }

    public void watchMovie() {
        System.out.println("Watching movie: " + title);
    }

}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching Adventure film");
    }

    public void watchAdventure() {
        System.out.println("Watching Adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching Comedy film");
    }

    public void watchComedy() {
        System.out.println("Watching comedy movie");
    }
}

class Science extends Movie {
    public Science(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching Science film");
    }

    public void watchScience() {
        System.out.println("Watching Science Movie");
    }
}
