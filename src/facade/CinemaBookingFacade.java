
package facade;

import model.Movie;
import service.MovieService;
import service.SeatService;
import service.PaymentService;
import service.TicketService;

public class CinemaBookingFacade {
    private final MovieService movieService;
    private final SeatService seatService;
    private final PaymentService paymentService;
    private final TicketService ticketService;

    public CinemaBookingFacade() {
        movieService = new MovieService();
        seatService = new SeatService();
        paymentService = new PaymentService();
        ticketService = new TicketService();
    }

    public void showAvailableMovies() {
        movieService.showMovies();
    }

    public boolean bookTicket(String movieTitle, String seatNumber, double balance) {
        Movie movie = movieService.findMovie(movieTitle);

        if (movie == null) {
            System.out.println("Movie not found.");
            return false;
        }

        if (!seatService.isValidSeat(seatNumber)) {
            System.out.println("Invalid seat number.");
            return false;
        }

        if (!seatService.reserveSeat(movie.getTitle(), seatNumber)) {
            System.out.println("Seat is already booked.");
            return false;
        }

        if (!paymentService.processPayment(movie.getTicketPrice(), balance)) {
            seatService.releaseSeat(movie.getTitle(), seatNumber);
            System.out.println("Payment failed. Seat reservation cancelled.");
            return false;
        }

        ticketService.generateTicket(movie, seatNumber);
        System.out.println("Booking completed successfully.");
        return true;
    }

    public boolean cancelBooking(String ticketId) {
        String[] ticket = ticketService.findTicket(ticketId);

        if (ticket == null) {
            System.out.println("Ticket not found.");
            return false;
        }

        String movieTitle = ticket[0];
        String seatNumber = ticket[1];

        seatService.releaseSeat(movieTitle, seatNumber);
        ticketService.removeTicket(ticketId);

        System.out.println("Booking cancelled: " + ticketId);
        System.out.println("Seat " + seatNumber + " is available again.");

        return true;
    }
}
