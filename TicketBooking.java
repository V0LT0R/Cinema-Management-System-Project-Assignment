public class TicketBooking {
    private String movieName;
    private String seat;

    private String snackCombo;
    private String specialScreening;

    private TicketBooking(TicketBookingBuilder builder) {
        this.movieName = builder.movieName;
        this.seat = builder.seat;
        this.snackCombo = builder.snackCombo;
        this.specialScreening = builder.specialScreening;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSeat() {
        return seat;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    public String getSpecialScreening() {
        return specialScreening;
    }

    @Override
    public String toString() {
        return "TicketBooking [movieName=" + movieName + ", seat=" + seat +
                (snackCombo != null ? ", snackCombo=" + snackCombo : "") +
                (specialScreening != null ? ", specialScreening=" + specialScreening : "") + "]";
    }

    public static class TicketBookingBuilder {
        private String movieName;
        private String seat;

        private String snackCombo;
        private String specialScreening;

        public TicketBookingBuilder(String movieName, String seat) {
            this.movieName = movieName;
            this.seat = seat;
        }

        public TicketBookingBuilder setSnackCombo(String snackCombo) {
            this.snackCombo = snackCombo;
            return this;
        }

        public TicketBookingBuilder setSpecialScreening(String specialScreening) {
            this.specialScreening = specialScreening;
            return this;
        }

        public TicketBooking build() {
            return new TicketBooking(this);
        }
    }
}
