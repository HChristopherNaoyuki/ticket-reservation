# Ticket Reservation

A Java-based ticket reservation system for booking tickets to on-campus events such as musicals and sports games. This project demonstrates the use of inheritance, interfaces, and abstract classes in Java, along with formatted output for ticket booking details.

## Project Structure

The project contains the following classes within the `Solution` package:

- **`IBooking`**: An interface with the `CalculateBooking` method, which calculates the total price based on the number of tickets.
- **`Ticket`**: An abstract base class containing common attributes (`ticketNumber`, `eventName`, `eventLocation`, `eventDate`) and an abstract method for setting the event location.
- **`Musicals`**: A subclass of `Ticket` that implements `IBooking`. It includes a price calculation of R250 per ticket and an additional attribute `refreshmentsServed`.
- **`SportGame`**: A subclass of `Ticket` that implements `IBooking`. It includes a price calculation of R120 per ticket.
- **`useTickets`**: The driver class for testing the system, where instances of `Musicals` and `SportGame` are created, and booking details are printed with formatted currency output.

## File Structure

```plaintext
TicketReservation/
└── src/
    └── Solution/
        ├── IBooking.java
        ├── Ticket.java
        ├── Musicals.java
        ├── SportGame.java
        └── useTickets.java
```

## Usage 💻

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE such as IntelliJ IDEA, Eclipse, or NetBeans for running the code

### Running the Code
1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/ticket-reservation.git
   ```
2. Open the project in your IDE.
3. Navigate to the `useTickets.java` file in the `Solution` package and run it.
4. Expected Output:
   ```
   Musical Concert Booking:
   Ticket Number: 201
   Event Date: 20/08/2013
   Event Name: Battle of the Bands
   Event Location: Thunderdome Club
   The Price for 4 tickets is R1,000.00

   Sports Event Booking:
   Ticket Number: 101
   Event Date: 30/10/2013
   Event Name: Easter Soccer
   Event Location: Crusaders Sport Club
   The price for 4 tickets is R480.00
   ```

## Features 🌟
- Demonstrates object-oriented principles (inheritance, polymorphism, and encapsulation).
- Uses `NumberFormat` for currency formatting in South African Rand (R).
- Provides modular and maintainable code with separated class files and clear project structure.

---
