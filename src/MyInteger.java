//Aril Mavinkere 109681869
public class MyInteger {

	private int n;
	
	public MyInteger(int n){
		this.n=n;
	}
	
	public int getInt(){
		return n;
	}
	
	public boolean isEven(){
		if(n%2==0)
			return true;
		else return false;
	}
	
	public boolean isOdd(){
		if(n%2!=0)
			return true;
		else return false;
	}
	
	public boolean isPrime(){
		boolean pr=true;
		for(int i=2;i<n;i++){
			if(n%i==0)pr=false;
		}
		return pr;
	}
	
	public static boolean isEven(int n){
		if(n%2==0)return true;
		else return false;
	}
	
	public static boolean isOdd(int n){
		if(n%2!=0)return true;
		else return false;
	}
	
	public static boolean isPrime(int n){
		boolean pr=true;
		for(int i=2;i<n;i++){
			if(n%i==0)pr=true;
		}
		return pr;
	}
	
	public boolean equals(int i){
		if(n==i)return true;
		else return false;
	}
	
	public boolean equals(MyInteger m){
		if(m.getInt()==n)return true;
		else return false;
	}
	
	public static int parseInt(String s){
		int val=0;
		for(int i=0;i<s.length();i++){
			val+=(s.charAt(i)-48)*Math.pow(10, s.length()-i-1);
		}
		return val;
	}
	
	
	
	
	
}
