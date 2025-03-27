import java.util.Date;

public class Booking extends User {

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
