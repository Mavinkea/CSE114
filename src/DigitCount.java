//Aril Mavinkere 109681869
public class DigitCount {

	public static void main(String[] args){
		for(int i:count("112233445566778899999"))
			System.out.print(i+" ");
	}
	
	public static int[] count(String s){
		int[] count={0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<s.length();i++)
			if(Character.isDigit(s.charAt(i)))
				count[Character.getNumericValue(s.charAt(i))]++;
		return count;		
	}
}
