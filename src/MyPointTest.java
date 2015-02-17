//Aril Mavinkere, 109681869
public class MyPointTest {

	public static void main(String[] args){
		MyPoint p=new MyPoint(-2,-3);
		MyPoint p2=new MyPoint(-4,4);
		
		System.out.println("getX test :"+p.getX());
		System.out.println("getY test :"+p.getY());
		System.out.println(p.distance(-4,4));
		System.out.println(p.distance(p2));
		
	}
}
