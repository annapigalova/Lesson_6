import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

		sortWorks1(worksList);

		// Sort by WorkName Example #2

		sortWorks2(worksList);

		// Sort by WorkName Example #3

		sortWorks3(worksList);

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

	private static void sortWorks1(ArrayList<Work> worksList) {

		System.out.println("Sort List Ex.1");
		Collections.sort(worksList, Collection.sortByWork);

		for (int i = 0; i < worksList.size(); i++) {
			System.out.println(worksList.get(i));
		}

		System.out.println();
	}

	private static void sortWorks2(ArrayList<Work> worksList) {

		System.out.println("Sort List Ex.2");
		Collections.sort(worksList);

		for (int i = 0; i < worksList.size(); i++) {
			System.out.println(worksList.get(i));
		}

		System.out.println();
	}

	private static void sortWorks3(ArrayList<Work> worksList) {

		System.out.println("Sort List Ex.3");
		Collections.sort(worksList, new Comparator<Work>() {

			public int compare(Work w1, Work w2) {
				return w1.getWorkName().compareTo(w2.getWorkName());
			}
		});
       
		for (int i = 0; i < worksList.size(); i++) {
			System.out.println(worksList.get(i));
		}

		System.out.println();

	}
}
