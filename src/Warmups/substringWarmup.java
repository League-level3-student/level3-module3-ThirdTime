package Warmups;

public class substringWarmup {
	public static void main(String[] args) {
		printAllSubstrings("Michiyo");
	}
	private static void printAllSubstrings(String string) {
		for(int i = 0; i < string.length(); i++) {
			for(int j = 0; j < string.length(); j++) {
				int endIndex = j+ i + 1;
				if(endIndex <= string.length()) {
					System.out.println(string.substring(j, endIndex));
				}
			}
		}
	}
}

