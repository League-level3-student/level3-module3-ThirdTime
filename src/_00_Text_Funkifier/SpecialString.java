package _00_Text_Funkifier;

public class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String toString() {
		return s;
	}

	@Override
	public String funkifyText(String s) {
		return s;
	}
}
