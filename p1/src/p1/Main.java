package p1;

public class Main {

	public static void main(String[] args) {
		/*Human h1 = new Human();
		h1.setNomComplet("mehdi tmimi");
		h1.setAge(31);
		*/
		Human h1 = new Human("mehdi tmimi",31);
		Human h2 = h1;
		System.out.println(h2.getNomComplet());
		System.out.println(h2.getAge());
		
		h2.setAge(-20);
		System.out.println("apres modification");
		System.out.println(h2.getAge());
		
	}

}
