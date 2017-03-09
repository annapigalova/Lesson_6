import java.util.ArrayList;

public class Collection {
	
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
	
	public void addWorks(Work work) {
		worksList.add(work);
	}
	
	public void removeWorks(Work work)
	{
		worksList.remove(work);
	}
	
	public void searchByWorkName(String workName)
	{
		ArrayList<Work> searchResult = new ArrayList<>();
		
		for (Work wrk : worksList)
			
			if(workName.equals(wrk.getWorkName()))
					searchResult.add(wrk);		
		 
	}
	

}
