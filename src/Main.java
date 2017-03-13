import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Work> worksList = initialWorks();

		Collection remarkBook = new Book();

		remarkBook.setName("Remark Colection");
		remarkBook.setPagesNum(100500);
		remarkBook.setPrice(100);

		for (Work wrk : worksList) {
			if (wrk.getAuthor().equals("Remark")) {
				remarkBook.addWork(wrk);
			}
		}

		// Find by WorkName
		if (remarkBook.isWorkExist("Novel #1")) {
			System.out.println("Book exists");

		} else {
			System.out.println("Book doesn't exist");
		}

		// Sort by WorkName Example #1
		System.out.println("Sort List Ex.1");
		sortWorks(worksList);

	}

	private static ArrayList<Work> initialWorks() {

		ArrayList<Work> worksList = new ArrayList<>();
		ArrayList<String> authorList = new ArrayList<>(Arrays.asList("Dostoevskiy", "Remark", "Bulgakov"));

		Random rn = new Random();
		int numAuthor = 0;

		for (int i = 0; i < 15; i++) {

			numAuthor = rn.nextInt(2);

			Work novel = new Novel();
			novel.setWorkName("Novel #" + i);
			novel.setAuthor(authorList.get(numAuthor));
			worksList.add(novel);

			Work article = new Article();
			article.setWorkName("Article #" + i);
			article.setAuthor(authorList.get(numAuthor));
			worksList.add(article);

			Work poem = new Poem();
			poem.setWorkName("Poem #" + i);
			poem.setAuthor(authorList.get(numAuthor));
			worksList.add(poem);

		}

		return worksList;

	}

	private static void sortWorks(ArrayList<Work> workList) {

		Collections.sort(workList, Collection.sortByWork);

		for (int i = 0; i < workList.size(); i++) {
			System.out.println(workList.get(i));
		}
	}

}
