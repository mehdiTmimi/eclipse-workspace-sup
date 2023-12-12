
public class EchecConsole implements IEchec{
	private Main main;
	public EchecConsole() {
	}
	@Override
	public void loose(int nbrLucky) {
		System.err.println("sorry , u lost. "+
				"the lucky number was " +nbrLucky);
		main.incrementEchec();
	}
	public void setMain(Main main) {
		this.main=main;
	}
}
