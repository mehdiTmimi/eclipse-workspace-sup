package p1;

public class Human {
	
	private String nomComplet;
	private int age;
	public Human() {
		super();
	}
	public Human(String nomComplet, int age) {
		super();
		this.nomComplet = nomComplet;
		this.age = age;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

	/*public Human() {
		this.nomComplet="";
		this.age=18;
	}
	public Human(String nomComplet) {
		this.nomComplet=nomComplet;
		this.age=18;
	}
	public Human(String nomComplet, int age) {
		this.nomComplet=nomComplet;
		this.age=age;
	}
	// getters
	public String getNomComplet() {
		return this.nomComplet;
	}
	public int getAge() {
		return this.age;
	}
	//setters
	public void setNomComplet(String nomComplet) {
		this.nomComplet=nomComplet;
	}
	public void setAge(int age)
	{
		if(age>=1 && age<=120)
			this.age=age;
	}*/

}
