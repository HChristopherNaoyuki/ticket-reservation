// TicketReservation/src/Solution/Musicals.java
package Solution;

public final class Musicals extends Ticket implements IBooking
{
    private boolean refreshmentsServed;

    // Constructor
    public Musicals(int ticketNumber, String eventName, String eventLocation, java.util.Date eventDate, boolean refreshmentsServed)
    {
        super(ticketNumber, eventName, eventLocation, eventDate);
        this.refreshmentsServed = refreshmentsServed;
        setEventLocation(eventLocation); // Call setEventLocation from constructor
    }

    // Get and Set methods for refreshmentsServed
    public boolean isRefreshmentsServed()
    {
        return refreshmentsServed;
    }

    public void setRefreshmentsServed(boolean refreshmentsServed)
    {
        this.refreshmentsServed = refreshmentsServed;
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
        return NoTickets * 250.0; // R250 per ticket for Musicals
    }
}
