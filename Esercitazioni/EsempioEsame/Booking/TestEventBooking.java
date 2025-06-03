package Booking;

public class TestEventBooking {
    public static void main(String[] args) {
        System.out.println("Testing EventBooking class...");

        EventBooking eb1 = new EventBooking("Concert", "Alice");
        EventBooking eb2 = new EventBooking("Conference");
        EventBooking eb3 = new EventBooking("Seminar", "Bob");
        EventBooking eb4 = new EventBooking("Workshop", "Carol");

        assert eb1.getEventName().equals("Concert") : "Event name mismatch";
        assert eb1.getAttendeeName().equals("Alice") : "Attendee name mismatch";
        assert eb2.getEventName().equals("Conference") : "Event name mismatch";
        assert eb2.getAttendeeName().startsWith("User") : "Attendee name generic format mismatch";

        int numBookingsBefore = EventBooking.getNumBookings();
        assert numBookingsBefore >= 4 : "Counter should be at least 4";

        EventBooking eb5 = new EventBooking("Concert", "Alice");
        assert eb1.equals(eb5) : "Equals method failed for equal objects";
        assert !eb1.equals(eb2) : "Equals method failed for different objects";

        String toStringOutput = eb1.toString();
        assert toStringOutput.contains("Concert") && toStringOutput.contains("Alice") : "toString output incorrect";

        eb1.confirmBooking();

        boolean cancelResult1 = eb1.cancelBooking();
        boolean cancelResult2 = eb2.cancelBooking();
        assert cancelResult1 : "Cancel booking should succeed for eb1";
        assert cancelResult2 : "Cancel booking should succeed for eb2";

        boolean cancelAgain = eb1.cancelBooking();
        assert !cancelAgain : "Cancel booking should fail if already cancelled";

        EventBookingVIP vip1 = new EventBookingVIP("Gala", "Charlie", "Free Drinks");
        assert vip1.getEventName().equals("Gala") : "VIP event name mismatch";
        assert vip1.getAttendeeName().equals("Charlie") : "VIP attendee name mismatch";
        assert vip1.getVipBenefits().equals("Free Drinks") : "VIP benefits mismatch";
        vip1.confirmBooking();

        System.out.println("All tests passed.");
    }
}
