class RegularMovieFactory extends MovieFactory {

    @Override
    public Movie createMovie(String title, int duration) {
        return new RegularMovie(title, duration);
    }
}

class ThreeDMovieFactory extends MovieFactory {

    @Override
    public Movie createMovie(String title, int duration) {
        return new ThreeDMovie(title, duration);
    }
}

class IMAXMovieFactory extends MovieFactory {

    @Override
    public Movie createMovie(String title, int duration) {
        return new IMAXMovie(title, duration);
    }
}
