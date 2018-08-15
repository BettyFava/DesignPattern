package designpattern.strategie;

public class NePasVoler implements ComportementVol {

	@Override
	public void voler() {
		System.out.println("Je ne vole pas. Je suis un canard en mousse. En en plastique.");

	}

}
