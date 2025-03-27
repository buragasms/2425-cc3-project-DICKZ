public class Entity {
	private String id;
	private String name;
	private String contactInfo;

public Entity(int id, String name, String contactInfo) {
	this.id = String.valueOf(id);
	this.name = name; 
	this.contactInfo = contactInfo;
}

public int getId(){
	return Integer.parseInt(id);
}

public String getName(){
	return name;
}

public String getContactInfo(){
	return contactInfo;
}

public void setContactInfo(String contactInfo){
	this.contactInfo = contactInfo;
  }
}