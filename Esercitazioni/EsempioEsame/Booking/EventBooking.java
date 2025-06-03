package Booking;

public class EventBooking {
    static int counter = 0;
    private int id;
    private String eventName;
    private String attendeeName;

    public EventBooking(String eventName, String attendeeName) {
        assert(eventName != null && attendeeName != null) : "Campi vuoti!";
        this.eventName = eventName;
        this.attendeeName = attendeeName;
        counter++;
        id = counter;
    }

    public EventBooking(String eventName) {
        assert(eventName != null) : "Campo vuoto!";
        counter++;
        id = counter;
        this.eventName = eventName;
        attendeeName = "User" + id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EventBooking))
            return false;
        
        EventBooking eb = (EventBooking) obj;
        return (this.eventName.compareTo(eb.eventName) == 0) && (this.attendeeName.compareTo(eb.attendeeName) == 0);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tEventName: " + eventName + "\tAttendeeName: " + attendeeName;
    }

    public void confirmBooking() {
        System.out.println("Prenotazione confermata!");
    }

    public boolean cancelBooking() {
        if (counter > 0) {
            System.out.println("Prenotazione cancellata");
            counter--;
            return true;
        }

        System.out.println("Non è possibile cancellare la prenotazione!");
        return false;
    }

    public static int getNumBookings() {
        return counter;
    }
}
