import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Collection remarkBook = new Book();

		ArrayList<Work> worksList = initialWorks();

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

		// Sort by WorkName

		System.out.println("By WorkName");

		remarkBook.sortByWork(remarkBook.getListWorks());

		for (int i = 0; i < remarkBook.getListWorks().size(); i++) {
			System.out.println(remarkBook.getListWorks().get(i));
		}

		System.out.println();

		// Sort by Year

		System.out.println("By Year");

		remarkBook.sortByYearDesc(remarkBook.getListWorks());

		for (int i = 0; i < remarkBook.getListWorks().size(); i++) {
			System.out.println(remarkBook.getListWorks().get(i));
		}

	}

	private static ArrayList<Work> initialWorks() {

		ArrayList<Work> worksList = new ArrayList<>();
		ArrayList<String> authorList = new ArrayList<>(Arrays.asList("Dostoevskiy", "Remark", "Bulgakov"));

		Random rn = new Random();
		int numAuthor = 0;

		for (int i = 0; i < 15; i++) {

			numAuthor = rn.nextInt(authorList.size() - 1);
			int year = rn.nextInt((1975 - 1860) + 1 ) + 1860;

			Work novel = new Novel();
			novel.setWorkName("Novel #" + i);
			novel.setAuthor(authorList.get(numAuthor));
			novel.setYear(year);
			worksList.add(novel);

			Work article = new Article();
			article.setWorkName("Article #" + i);
			article.setAuthor(authorList.get(numAuthor));
			article.setYear(year);
			worksList.add(article);

			Work poem = new Poem();
			poem.setWorkName("Poem #" + i);
			poem.setAuthor(authorList.get(numAuthor));
			poem.setYear(year);
			worksList.add(poem);

		}

		return worksList;

	}

}
