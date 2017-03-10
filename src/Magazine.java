
public class Magazine extends Collection {

	@Override
	public String getPrintType() {
		return "Colour Print";

	}

	@Override
	public void addWork(Work work) {

		if (work instanceof Article)
			super.addWork(work);

	}

}
