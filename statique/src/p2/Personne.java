package p2;

public class Personne {

	private String name;
	private static int counter=0;
	public Personne(String name) {
		this.name=name;
		counter++;
	}
	public static int getCounter() {
		
		return counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
