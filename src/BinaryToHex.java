//Aril Mavinkere 109681869
public class BinaryToHex {

	public static void main(String[] args){
		System.out.println(binaryToHex("110101010101"));
	}
	
	public static String binaryToHex(String bin){
		String hex="";
		while(bin.length()%4!=0){bin='0'+bin;}
		for(int i=0;i<bin.length();i=i+4){
			int sum=0;
			for(int j=3;j>=0;j--){
				sum+=Character.getNumericValue(bin.charAt(i+j))*(Math.pow(2, 3 - j));
			}
			if(sum%10==0)hex+='A';
			else if(sum%11==0)hex+='B';
			else if(sum%12==0)hex+='C';
			else if(sum%13==0)hex+='D';
			else if(sum%14==0)hex+='E';
			else if(sum%15==0)hex+='F';
			else hex+=Integer.toString(sum);
		}
		return hex;
	}
}
