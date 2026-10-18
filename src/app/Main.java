
package app;

import facade.CinemaBookingFacade;

public class Main {
    public static void main(String[] args) {
        CinemaBookingFacade booking = new CinemaBookingFacade();

        booking.showAvailableMovies();

        System.out.println("\nFirst booking:");
        booking.bookTicket("Inception", "A5", 20.0);

        System.out.println("\nSecond booking:");
        booking.bookTicket("Inception", "A5", 20.0);

        System.out.println("\nThird booking:");
        booking.bookTicket("Interstellar", "B3", 5.0);

        System.out.println("\nFourth booking:");
        booking.bookTicket("Interstellar", "B3", 20.0);

        System.out.println("\nFifth booking:");
        booking.bookTicket("Unknown Movie", "C1", 20.0);

        System.out.println("\nSixth booking:");
        booking.bookTicket("Interstellar", "A5", 20.0);

        System.out.println("\nSeventh test - Cancel booking:");
        booking.cancelBooking("TICKET-1");

        System.out.println("\nEighth test - Book released seat:");
        booking.bookTicket("Inception", "A5", 20.0);

        System.out.println("\nNinth test - Cancel unknown ticket:");
        booking.cancelBooking("TICKET-100");

        System.out.println("\nTenth test - Invalid seat:");
        booking.bookTicket("Inception", "123", 20.0);

    }
}
