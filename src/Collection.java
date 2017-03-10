import java.util.ArrayList;

public abstract class Collection {

	String name;
	int pagesNum;
	double price;
	ArrayList<Work> worksList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPagesNum() {
		return pagesNum;
	}

	public void setPagesNum(int pagesNum) {
		this.pagesNum = pagesNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Work> getListWorks() {
		return worksList;
	}

	public void addWork(Work work) {
		worksList.add(work);
	}

	public void removeWorks(Work work) {
		worksList.remove(work);
	}

	public boolean isWorkExist(String workName) {

		boolean isWorkExist = false;

		for (int i = 0; i < worksList.size(); i++) {
			if (workName.equals(this.worksList.get(i).getWorkName()))
				return true;

		}

		return isWorkExist;

	}

	public abstract String getPrintType();

	@Override
	public String toString() {

		return "Name: " + getName() + System.lineSeparator() + "Pages: " + getPagesNum() + System.lineSeparator()
				+ "Price: " + getPrice();
	}

}
