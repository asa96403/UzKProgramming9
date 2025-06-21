package exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Harry Potter und der Stein der Weisen", 9.6, 2001));
		Stream<Movie> movieStream =movies.stream();
		Predicate<Movie> rating8 = t -> t.rating()>=8.5; 
		Comparator<Movie> year = (o1, o2) -> {
			if(o1.year()<o2.year()) return -1;
			else if(o1.year()>o2.year()) return 1;
			else return 0;
		};
		Comparator<Movie> rating = (o1, o2)-> {
			if(o1.rating()<o2.rating()) return 1;
			else if(o1.rating()>o2.rating()) return -1;
			else return 0;
		};
		movieStream.filter(rating8).sorted(year.thenComparing(rating)).forEach(System.out::println);;
		
	}
}
