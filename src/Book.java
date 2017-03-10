
public class Book extends Collection {
	


	@Override
	public String getPrintType()
	{
		return "Black and White Print";
		
	}
	
	@Override
	public void addWork(Work work)
	{
		if(work instanceof Novel || work instanceof Poem)
		{
			super.addWork(work);
		}
		
	}
	

}
