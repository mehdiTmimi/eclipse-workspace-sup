import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nom;
	private String address;

	private List<Animal> animals;
	public Zoo() {
		animals = new ArrayList<Animal>();
	}
	public Zoo(String nom, String address) {
		super();
		this.nom = nom;
		this.address = address;
		animals = new ArrayList<Animal>();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
}
