package finbarre.StopgninnipSMysdroW;

public class SpinWords {
	public String spinWords(String sentence) {

		int previousSpacePosition = 0;
		String strToReplace = "";
		String reversed = "";
		for (int i = 0; i < sentence.length(); i++) {
			strToReplace = strToReplace + sentence.charAt(i);
			if (String.valueOf(sentence.charAt(i)).equals(" ") || (i == sentence.length() - 1)) {
				for (int j = i; j >= previousSpacePosition; j--) {
					reversed = reversed + sentence.charAt(j);
				}
				reversed = reversed.trim();
				if (reversed.length() >= 5) {
					if (!(i == sentence.length() - 1)) {
						reversed = reversed + " ";
					}
					sentence = sentence.replace(strToReplace, reversed);
				}
				reversed = "";
				strToReplace = "";
				previousSpacePosition = i;

			}
		}

		return sentence;
	}
}
