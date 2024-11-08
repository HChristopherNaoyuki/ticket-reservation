// TicketReservation/src/Solution/useTickets.java
package Solution;

import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class useTickets
{
    public static void main(String[] args)
    {
        // Formatter for date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Formatter for currency
        DecimalFormat currencyFormat = new DecimalFormat("R#,##0.00");

        // Instantiate Musicals class
        Musicals musicalEvent = new Musicals(201, "Battle of the Bands", "Thunderdome Club", new Date(113, 7, 20), true);
        int musicalTickets = 4;
        System.out.println("Musical Concert Booking:");
        System.out.println("Ticket Number: " + musicalEvent.getTicketNumber());
        System.out.println("Event Date: " + dateFormat.format(musicalEvent.getEventDate()));
        System.out.println("Event Name: " + musicalEvent.getEventName());
        System.out.println("Event Location: " + musicalEvent.getEventLocation());
        System.out.println("The Price for " + musicalTickets + " tickets is " + currencyFormat.format(musicalEvent.CalculateBooking(musicalTickets)));

        // Instantiate SportGame class
        SportGame sportEvent = new SportGame(101, "Easter Soccer", "Crusaders Sport Club", new Date(113, 9, 30));
        int sportTickets = 4;
        System.out.println("\nSports Event Booking:");
        System.out.println("Ticket Number: " + sportEvent.getTicketNumber());
        System.out.println("Event Date: " + dateFormat.format(sportEvent.getEventDate()));
        System.out.println("Event Name: " + sportEvent.getEventName());
        System.out.println("Event Location: " + sportEvent.getEventLocation());
        System.out.println("The Price for " + sportTickets + " tickets is " + currencyFormat.format(sportEvent.CalculateBooking(sportTickets)));
    }
}
