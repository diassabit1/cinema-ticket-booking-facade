# Cinema Ticket Booking System

## Project Overview

This project demonstrates the Facade Design Pattern using a simple cinema ticket booking system developed in Java 17.

The system allows users to view movies, book tickets, check seat availability, process simulated payments, and cancel reservations.

## Design Pattern

The project uses the Facade structural design pattern.

The `CinemaBookingFacade` class provides a simple interface for interacting with multiple subsystem services.

Instead of calling each service separately, the client uses the Facade to complete booking operations.

## Project Structure

- `app` — contains the Main class
- `facade` — contains CinemaBookingFacade
- `model` — contains the Movie class
- `service` — contains MovieService, SeatService, PaymentService, and TicketService

## Main Features

- Display available movies
- Search for movies by title
- Validate seat numbers
- Reserve cinema seats
- Prevent duplicate reservations
- Simulate payment processing
- Release reserved seats when payment fails
- Generate tickets with unique IDs
- Cancel existing bookings
- Handle invalid booking requests

## Technologies

- Java 17
- IntelliJ IDEA
- Git and GitHub

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 17.
4. Open `src/app/Main.java`.
5. Run the `main()` method.
6. Check the console output.

## Facade Pattern Benefits

The Facade simplifies interaction between the client and the booking subsystem.

It reduces coupling, separates responsibilities, and makes the booking process easier to use and maintain.

## Author

Dias Sabit

Group: SE-2526

## GitHub Repository

https://github.com/diassabit1/cinema-ticket-booking-facade


## UML Diagrams

The project includes two UML diagrams:

- [Class Diagram](diagrams/class-diagram.puml)
- [Sequence Diagram](diagrams/sequence-diagram.puml)

The Class Diagram shows the structure and relationships between classes.

The Sequence Diagram demonstrates the booking process, including payment failure and rollback.


