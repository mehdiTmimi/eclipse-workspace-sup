package polymorphisme;

public class Main {

	public Main() {
		exp02();
	}
	private void exp02() {
		Animal[] zoo = new Animal[4];
		zoo[0]=new Chat();
		zoo[1]=new Chien();
		zoo[2]=new Chat();
		zoo[3]=new Pitbull();
		for(int i=0;i<zoo.length;i++)
			zoo[i].crier();
	}
	private void exp01() {
		Animal a = new Pitbull();
		a.crier();
		System.out.println(a);//a.toString
		
	}
	public static void main(String[] args) {
		new Main();

	}

}
