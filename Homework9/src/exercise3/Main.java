package exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		// Bewertungen meist von amazon oder Prime Video
		movies.add(new Movie("Harry Potter und der Stein der Weisen", 9.6, 2001));
		movies.add(new Movie("Harry Potter und die Kammer des Schreckens", 7.4, 2002));
		movies.add(new Movie("Harry Potter und der Gefangene von Askaban", 7.9, 2004));
		movies.add(new Movie("Harry Potter und der Feuerkelch", 9.6, 2004));
		movies.add(new Movie("Harry Potter und der Orden des Phönix", 9.4, 2007));
		movies.add(new Movie("Harry Potter und der Halbblutprinz", 9.4, 2009));
		movies.add(new Movie("Harry Potter und die Heiligtümer des Todes", 9.7, 2010));
		movies.add(new Movie("Sortierungsbeispiel", 9.9, 2010));
		movies.add(new Movie("Harry Potter und der Halbblutprinz", 9.6, 2011));
		Stream<Movie> movieStream = movies.stream();
		Predicate<Movie> rating85 = t -> t.rating() >= 8.5;
		Comparator<Movie> year = (o1, o2) -> {
			if (o1.year() < o2.year())
				return -1;
			else if (o1.year() > o2.year())
				return 1;
			else
				return 0;
		};
		Comparator<Movie> rating = (o1, o2) -> {
			if (o1.rating() < o2.rating())
				return 1;
			else if (o1.rating() > o2.rating())
				return -1;
			else
				return 0;
		};
		System.out.println("Results ordered by year and then rating");
		movieStream.filter(rating85).sorted(year.thenComparing(rating)).forEach(System.out::println);

	}
}
