
public class EchecConsole implements IEchec{

	@Override
	public void loose(int nbrLucky) {
		System.err.println("sorry , u lost. "+
				"the lucky number was " +nbrLucky);
		
	}

}
