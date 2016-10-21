package my.lab1;

public class StringStorage{
	
	private String str1;
	private String str2;
	private String str3;

	public StringStorage(String s1,String s2,String s3){
		str1=s1;
		str2=s2;
		str3=s3;
	}

	public String[] getStrArray(){
		String[] myString = {str1,str2,str3};
		return myString;
	}
}