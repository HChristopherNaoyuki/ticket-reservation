// TicketReservation/src/Solution/Ticket.java
package Solution;

import java.util.Date;

public abstract class Ticket
{
    private final int ticketNumber;
    private final String eventName;
    protected String eventLocation; // Protected for subclass access
    private final Date eventDate;

    // Constructor
    public Ticket(int ticketNumber, String eventName, String eventLocation, Date eventDate)
    {
        this.ticketNumber = ticketNumber;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
    }

    // Get methods
    public int getTicketNumber()
    {
        return ticketNumber;
    }

    public String getEventName()
    {
        return eventName;
    }

    public String getEventLocation()
    {
        return eventLocation;
    }

    public Date getEventDate()
    {
        return eventDate;
    }

    // Abstract method to set event location
    public abstract void setEventLocation(String eventLocation);
}
