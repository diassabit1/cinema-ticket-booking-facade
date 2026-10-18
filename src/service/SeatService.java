
package service;

import java.util.HashSet;
import java.util.Set;

public class SeatService {
    private final Set<String> bookedSeats = new HashSet<>();

    private String getSeatKey(String movieTitle, String seatNumber) {
        return movieTitle.toLowerCase() + ":" + seatNumber.toUpperCase();
    }

    public boolean isValidSeat(String seatNumber) {
        return seatNumber != null && seatNumber.matches("[A-Z][1-9][0-9]?");
    }

    public boolean isSeatAvailable(String movieTitle, String seatNumber) {
        return !bookedSeats.contains(getSeatKey(movieTitle, seatNumber));
    }

    public boolean reserveSeat(String movieTitle, String seatNumber) {
        if (!isValidSeat(seatNumber)) {
            return false;
        }

        String seatKey = getSeatKey(movieTitle, seatNumber);

        if (!isSeatAvailable(movieTitle, seatNumber)) {
            return false;
        }

        bookedSeats.add(seatKey);
        return true;
    }

    public void releaseSeat(String movieTitle, String seatNumber) {
        bookedSeats.remove(getSeatKey(movieTitle, seatNumber));
    }
}
