//Aril Mavinkere, 109681869
import java.util.*;
public class Homework8 {

	public static void main(String[] args){
		try{
			System.out.println(parseBinary("11011"));
		}catch(BinaryFormatException e){
			System.out.println("String you entered was not a binary");
		}
	}
	
	//Binary format exception
	public static int parseBinary(String bin) throws BinaryFormatException{
		for(int i=0;i<bin.length();i++){
			if(bin.charAt(i)!='0' && bin.charAt(i)!='1')
				throw new BinaryFormatException();
		}		
		return Integer.parseInt(bin, 2);
	}
	
	//Permutations of a String
	public static ArrayList<ArrayList<String>> permutations(ArrayList<String> str){
		ArrayList<ArrayList<String>> perms =new ArrayList<ArrayList<String>>();
		if(str.isEmpty()){
			ArrayList<String> onePerm=new ArrayList<String>();
			perms.add(onePerm);
			return perms;
		}
		for(String oneElem:str){
			ArrayList<String> b=(ArrayList<String>)(str.clone());
			b.remove(oneElem);
			ArrayList<ArrayList<String>> perms2=permutations(b);
			for(ArrayList<String> onePerm:perms2){
				onePerm.add(oneElem);
				perms.add(onePerm);
			}
		}
				
		return perms;
	}
			
	//Largest element in an array
	public static int largest(int[] arr, int head, int end){
		if(head==end)return arr[head];
		else if(arr[head]<arr[end]){
			return largest(arr,head+1,end);
		}
		else return arr[head];
	}
	
	//Count occurrences
	public static int count(char[] chars, char ch)
	{
	    return count(chars, ch, chars.length - 1);
	}
	public static int count(char[] chars, char ch, int high)
	{
	    if (high == -1)	    {
	        return 0;
	    }
	    if (chars[high] == ch)	    {
	        return 1 + count(chars, ch, high - 1);
	    }
	    return count(chars, ch, high - 1);
	}

	
}

class BinaryFormatException extends Exception{
	
	public BinaryFormatException(){
		super();
	}
}
