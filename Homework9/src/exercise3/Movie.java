package exercise3;

public record Movie(String title, double rating, int year) {
	
	/**
	 * Constructor for Movie. The rating system is from 0 to 10.
	 * If the rating provided is not in those boundaries, the rating is set to 5.
	 * @param title the title of the movie
	 * @param rating the rating of the movie, must be between 0 and 10
	 * @param year the year of publication of the movie
	 * @author aabert
	 */
	public Movie(String title, double rating, int year) {
		this.title=title;
		if(rating <=10 && rating>0) {
			this.rating=rating;			
		} else {
			this.rating=5;
			}
		this.year=year;
	}

}
