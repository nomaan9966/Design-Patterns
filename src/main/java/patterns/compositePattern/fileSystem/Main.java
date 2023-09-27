package patterns.compositePattern.fileSystem;

public class Main {

    public static void main(String[] args) {
        Directory movies = new Directory("Movie");
        movies.addFileSystem(new File("Sarkar"));

        Directory comedyMovies = new Directory("comedy movies");
        comedyMovies.addFileSystem(new File("PK"));
        comedyMovies.addFileSystem(new File("Hera Pheri"));
        movies.addFileSystem(comedyMovies);

        movies.ls();
    }
}
