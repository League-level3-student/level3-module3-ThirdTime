package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char [] stringAsCharArray = s.toCharArray();
		String backwardsString = "";
		for(int i = stringAsCharArray.length - 1; i >= 0; i--) {
			backwardsString = backwardsString + stringAsCharArray[i];
		}		
		return backwardsString;
	}

}
