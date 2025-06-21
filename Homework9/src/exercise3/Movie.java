package exercise3;

public record Movie(String title, double rating, int year) {
	
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
