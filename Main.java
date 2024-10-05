public class Main {
    public static void main(String[] args) {
        TicketBooking basicBooking = new TicketBooking.TicketBookingBuilder("Inception", "B12")
                .build();
        System.out.println(basicBooking);

        TicketBooking snackBooking = new TicketBooking.TicketBookingBuilder("Avatar", "A15")
                .setSnackCombo("Popcorn and Soda")
                .build();
        System.out.println(snackBooking);

        TicketBooking fullBooking = new TicketBooking.TicketBookingBuilder("Interstellar", "C5")
                .setSnackCombo("Nachos and Soda")
                .setSpecialScreening("IMAX")
                .build();
        System.out.println(fullBooking);
    }
}
