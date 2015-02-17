//Aril Mavinkere, 109681869
public class MyIntegerTest {

	public static void main(String[] args){
		MyInteger m=new MyInteger(10);
		
		System.out.println("getInt() test :"+m.getInt());		
		System.out.println("isEven() test :"+m.isEven());
		System.out.println("isOdd() test :"+m.isOdd());
		System.out.println("isPrime() test :"+m.isPrime());
		System.out.println("equals(int n) test :"+m.equals(14));
		System.out.println("equals(MyInteger m) test :"+m.equals(new MyInteger(10)));
		
		System.out.println("static isEven() test :"+MyInteger.isEven(5));
		System.out.println("static isOdd() test :"+MyInteger.isOdd(5));
		System.out.println("static isPrime() test :"+MyInteger.isPrime(5));
		System.out.println("parseInt(String s) test :"+MyInteger.parseInt("139"));
		
	}
}
