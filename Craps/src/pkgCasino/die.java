package pkgCasino;

public class die {
	
	private byte DieValue;
	
	public die() {
		this.DieValue = (byte) (Math.random() * 6 + 1);
	}
	
	public short getDieValue() {
		return DieValue;
	}
}	
