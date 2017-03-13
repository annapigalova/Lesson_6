
public abstract class Work {

	private String workName;
	private String author;
	private int year;

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public abstract String printText();

	@Override
	public String toString() {

		return "Name: " + getWorkName() + System.lineSeparator() + "Author: " + getAuthor() + System.lineSeparator()
				+ "Year: " + getYear();
	}

}
