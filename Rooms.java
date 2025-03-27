public class Rooms {
    private String roomId;
    private String roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    public Rooms(int hotelId, int roomId, int roomNumber, String roomType, double price) {
        this.roomId = String.valueOf(roomId);
        this.roomNumber = String.valueOf(roomNumber);
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomId() {
        return Integer.parseInt(roomId);
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
