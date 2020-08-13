package StringExeImp;

public class EXE1 {
	public static void main(String[] args) {
	char data[] = {'a', 'b', 'c'}; 
	String str= new String(data);
	
	//Constructastringobjectbypassinganotherstringobject.
	String str2=new String(str);
	
	//Thelength()methodreturnsthelengthofthestring.Eg:
		System.out.println("Varun".length());
		
	//	The+operatorisusedtoconcatenatetwoormorestrings.Eg:
			String myName="Varun";
			String s="Mynameis"+myName+".";
			//Characters in a string canbe retrieved in a number of ways
			
			//public char charAt(int index);
			//Method returns the character at the specified index.An indexr anges from 0 to length()-1
			char c;
			c="abc".charAt(1);//c=“b”
			
			//equals()Method-This method is used to compare the invoking String to the object specified.It will return true,if theargument is not null and it is Stringobject which contains the same sequence of charactersastheinvokingString.public
			//boolean equals( ObjectanObjec
			//compareTo - 
			//indexOf() - search for the first occourance of a character or substring. Return -1 if character does not occour
			
			// public int indexOf(int ch) - It searches for the character represented by ch within this string and returns the indexof first occurrence of this character 
			//public int index Of(String str)-It searches for the substring specified by str within this string and returns the indexof first occurrence of this substring
			
			
			//String str= “How was your day today?”;
			//str.indexOf(‘t’); 
			//str.indexOf(“was”)
			
			
			//public int indexOf(int ch,int fromIndex)-It searches for the character represented by ch within this string and returns the indexof first occurrence of this character starting from the position specified by from Index
			
			//public int indexOf(String str,int fromIndex)-Returns the index with in this stringof the first occurrence of the specifieds ubstring,starting at the specified index.

	
//			String str=“Howwasyourdaytoday?”;
//			str.indexOf(‘a’,6);
//			str.indexOf(“was”, 2)
//	
	}
}
