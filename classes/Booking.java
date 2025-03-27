import java.util.Date;

public class Booking extends User {
    private String bookingId;
    private Date startDate;
    private Date endDate;
    private double totalPrice;
    
    public Booking(int hotelId, int roomId, String bookingId, Date startDate, Date endDate) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = 0.0;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double calculateTotalPrice(double pricePerNight, int nights) {
        this.totalPrice = pricePerNight * nights;
        return totalPrice;
    }
}
