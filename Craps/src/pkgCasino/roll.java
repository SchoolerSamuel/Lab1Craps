package pkgCasino;

public class roll {

	private die d1;
	private die d2;

	public roll() {
		d1 = new die();
		d2 = new die();

	}

	public int getScore() {
		return d1.getDieValue() + d2.getDieValue();
	}
}
