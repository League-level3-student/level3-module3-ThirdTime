package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] stringAsCharArray = s.toCharArray();
		String mixedCapsString = "";
		for (int i = 0; i < stringAsCharArray.length; i++) {
			if (i % 2 == 0) {
				char lowercaseLetter = Character.toLowerCase(stringAsCharArray[i]);
				mixedCapsString = mixedCapsString + lowercaseLetter;
			} else {
				char capsLetter = Character.toUpperCase(stringAsCharArray[i]);
				mixedCapsString = mixedCapsString + capsLetter;
			}
		}
		return mixedCapsString;
	}

}
