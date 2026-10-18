package model;

public class Movie {
    private final String title;
    private final int duration;
    private final double ticketPrice;

    public Movie(String title, int duration, double ticketPrice) {
        this.title = title;
        this.duration = duration;
        this.ticketPrice = ticketPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
