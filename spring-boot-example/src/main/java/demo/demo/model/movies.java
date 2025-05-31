package demo.demo.model;

public class movies {
	  private int year;
	    private String title;
	    private String role;
	    private String notes;

	    public movies(int year, String title, String role, String notes) {
	        this.year = year;
	        this.title = title;
	        this.role = role;
	        this.notes = notes;
	    }

	    // Getters
	    public int getYear() {
	        return year;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getRole() {
	        return role;
	    }

	    public String getNotes() {
	        return notes;
	    }
}
