import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Collection  {

	private String name;
	private int pagesNum;
	private double price;
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

		for (int i = 0; i < worksList.size(); i++) {
			if (workName.equals(worksList.get(i).getWorkName()))
				return true;

		}

		return false;

	}

	public abstract String getPrintType();

	@Override
	public String toString() {

		return "Name: " + getName() + System.lineSeparator() + "Pages: " + getPagesNum() + System.lineSeparator()
				+ "Price: " + getPrice();
	}

	private static Comparator<Work> sortByWorkComparator = new Comparator<Work>() {
		public int compare(Work w1, Work w2) {

			int workSort = w1.getWorkName().compareTo(w2.getWorkName());
			return workSort;
		}

	};
	
	public void sortByWork(ArrayList<Work> worksList)
	{
		Collections.sort(worksList, sortByWorkComparator);
	}
	
	private static Comparator<Work> sortByAuthorComparator = new Comparator<Work>() {
		public int compare(Work w1, Work w2) {

			int authorSort = w1.getAuthor().compareTo(w2.getAuthor());
			return authorSort;
		}

	};
	
	public void sortByAuthor(ArrayList<Work> worksList)
	{
		Collections.sort(worksList, sortByAuthorComparator);
	}
	
	private static Comparator<Work> sortByYearDescComparator = new Comparator<Work>() {
		public int compare(Work w1, Work w2) {

			int yearSort = Integer.compare(w2.getYear(), w1.getYear());
			return yearSort;
		}

	};
	
	public void sortByYearDesc(ArrayList<Work> worksList)
	{
		Collections.sort(worksList, sortByYearDescComparator);
	}

}
