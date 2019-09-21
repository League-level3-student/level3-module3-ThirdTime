package _00_Text_Funkifier;

public class SnakeString extends SpecialString{
	
	public SnakeString(String s) {
		super(s);
	}
	
	public String funkifyText(String s) {
		String newString = s;
		if(s.contains("s")) {
			newString = s.replace("s", "ssss");
		}
		newString = newString + " (hiss)";
		return newString;
		
	}


}
