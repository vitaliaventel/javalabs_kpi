package base;

public class SymbolReplace {
	private int numberOfReplace;
	private String[] strToArray;

	public SymbolReplace() {

	}

	public SymbolReplace(String str) {
		strToArray = str.split("\\s");
	}

	public void setK(int num) {
		numberOfReplace = num;
	}

	public void setArray(String str) {
		strToArray = str.split("\\s");
	}

	public String strReplace() {
		String result = "";
		String[] tempArray = new String[strToArray.length];
		for (int i = 0; i < strToArray.length; i++) {
			if (numberOfReplace <= strToArray[i].length()) {
				tempArray[i] = "";
				tempArray[i] += strToArray[i].substring(0, numberOfReplace - 1);
				tempArray[i] += '#';
				tempArray[i] += strToArray[i].substring(numberOfReplace, strToArray[i].length());
			} else {
				tempArray[i] = strToArray[i];
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			result += tempArray[i] + " ";
		}
		return result;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < strToArray.length; i++) {
			result += strToArray[i] + " ";
		}
		return "StringReplace[ " + result + " ]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof SymbolReplace)
			return (this.strToArray.length == ((SymbolReplace) obj).strToArray.length);
		return false;
	}
}
