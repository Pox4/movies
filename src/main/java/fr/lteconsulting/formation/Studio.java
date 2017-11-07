package fr.lteconsulting.formation;

public class Studio {

	private String name;
	private String id;
	private int creationDate;
	
	
	
	
	public Studio() {
	}
	
	public Studio(String name, String id, int creationDate) {
		this.name = name;
		this.id = id;
		this.creationDate = creationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}
	
}

