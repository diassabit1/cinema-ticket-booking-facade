
package service;

import model.Movie;
import java.util.HashMap;
import java.util.Map;

public class TicketService {
    private final Map<String, String[]> tickets = new HashMap<>();
    private int nextTicketId = 1;

    public String generateTicket(Movie movie, String seatNumber) {
        String ticketId = "TICKET-" + nextTicketId;
        nextTicketId++;

        tickets.put(ticketId, new String[]{movie.getTitle(), seatNumber});

        System.out.println("----- CINEMA TICKET -----");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Duration: " + movie.getDuration() + " minutes");
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: $" + movie.getTicketPrice());
        System.out.println("-------------------------");

        return ticketId;
    }

    public String[] findTicket(String ticketId) {
        return tickets.get(ticketId);
    }

    public void removeTicket(String ticketId) {
        tickets.remove(ticketId);
    }
}
