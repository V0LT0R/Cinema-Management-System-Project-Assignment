public class Main {
    public static void main(String[] args) {
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie regularMovie = regularFactory.createMovie("Inception", 148);
        regularMovie.displayInfo();

        MovieFactory threeDFactory = new ThreeDMovieFactory();
        Movie threeDMovie = threeDFactory.createMovie("Avatar", 162);
        threeDMovie.displayInfo();

        MovieFactory imaxFactory = new IMAXMovieFactory();
        Movie imaxMovie = imaxFactory.createMovie("Interstellar", 169);
        imaxMovie.displayInfo();
    }
}
