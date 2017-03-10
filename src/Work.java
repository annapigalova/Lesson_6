
public abstract class Work {
	
	String workName;
	String author;
	
	public String getWorkName() {
		return workName;
	}
	
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract String printText();

	@Override
	public String toString() {
		 
		return  "Name: " + getWorkName() + System.lineSeparator() + "Author: " + getAuthor();
	}
	
	

}
