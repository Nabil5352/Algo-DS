public class DVD {
	public String name;
	public int releaseYear;
	public String director;
	
	public DVD(String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}
	
	public String toString() {
		return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
	}
	
	public static void main(String[] args) {
		DVD avengersDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD incrediblesDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jhon Favreau");
		
		DVD[] dvdCollection = new DVD[15];
		
		dvdCollection[2] = lionKingDVD;
		dvdCollection[3] = incrediblesDVD;
		dvdCollection[7] = avengersDVD;
		dvdCollection[9] = findingDoryDVD;
		
		for (DVD item : dvdCollection) {
			System.out.println(item);
		}
		
		System.out.println("The capacity of the DVD array is " + dvdCollection.length);
	}
}