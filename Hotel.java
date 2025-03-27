import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel extends Manager{

    public Hotel(int hotelId, String name, String location) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
    }

    public int getHotelId() { return hotelId; }
    public String getLocation() { return location; }

    public void addRoom(Room room) { rooms.add(room); }
    public void removeRoom(Room room) { rooms.remove(room); }

    public void addBooking(Booking booking) { bookings.add(booking); }
    public List<Booking> getBookings() { return new ArrayList<>(bookings); }

    public List<Room> getAvailableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();
        
        for (Room room : rooms) {
            boolean isAvailable = true;
            
            for (Booking booking : bookings) {
                if (booking.getRoom().equals(room) && 
                    datesOverlap(startDate, endDate, 
                                 booking.getStartDate(), booking.getEndDate())) {
                    isAvailable = false;
                    break;
                }
            }
            
            if (isAvailable) {
                availableRooms.add(room);
            }
        }
        
        return availableRooms;
    }

    private boolean datesOverlap(Date start1, Date end1, Date start2, Date end2) {
        return !(end1.before(start2) || start1.after(end2));
    }
}