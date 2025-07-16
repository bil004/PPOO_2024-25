package Booking;

public class EventBookingVIP extends EventBooking {
    private String vipBenefits;
    
    public EventBookingVIP(String eventName, String attendeeName, String vipBenefits) {
        super(eventName, attendeeName);
        this.vipBenefits = vipBenefits;
    }

    public EventBookingVIP(String eventName, String vipBenefits) {
        super(eventName);
        this.vipBenefits = vipBenefits;
    }

    public String getVipBenefits() {
        return vipBenefits;
    }

    @Override
    public void confirmBooking() {
        System.out.println("Prenotazione confermata con vipBenefits: " + vipBenefits);
    }
}
