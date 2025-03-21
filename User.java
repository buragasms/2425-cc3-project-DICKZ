import java.util.List;
import java.util.Date;


public class User extends Entity {
	private String username;
	private String password;

	public User(int id, String name, String contactInfo, String username, String password) {
	this.username = username
	this.password = password 
}

public String getUsername() {
	return username;
}

public String getPassword() {
	return password;
}
public void setPassword(String password)
{
	this.password = password;
}
public List<Room>
viewAvailableRooms(Hotel hotel, Room room, Date startDate, Date endDate)
{
	return null;
   }
public void viewBooking(Booking booking){
  }
}