// TicketReservation/src/Solution/SportGame.java
package Solution;

public final class SportGame extends Ticket implements IBooking
{
    // Constructor
    public SportGame(int ticketNumber, String eventName, String eventLocation, java.util.Date eventDate)
    {
        super(ticketNumber, eventName, eventLocation, eventDate);
        setEventLocation(eventLocation); // Call setEventLocation from constructor
    }

    // Implementing abstract method setEventLocation
    @Override
    public void setEventLocation(String eventLocation)
    {
        this.eventLocation = eventLocation;
    }

    // CalculateBooking method implementation
    @Override
    public double CalculateBooking(int NoTickets)
    {
        return NoTickets * 120.0; // R120 per ticket for SportGame
    }
}
