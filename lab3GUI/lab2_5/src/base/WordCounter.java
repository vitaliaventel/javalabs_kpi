package base;

public class WordCounter {

	private String entredString;

	public WordCounter() {

	}

	public WordCounter(String entredString) {
		this.entredString = entredString;
	}

	public int strCounter() {
		boolean test = false;
		int counter = 1;
		for (int i = 0; i < entredString.length(); i++) {
			if (entredString.charAt(i) == ' ' && !test) {
				test = true;
				counter++;
			} else if (entredString.charAt(i) != ' ') {
				test = false;
			}
		}
		return counter;
	}
}