public class SortString {

	public static void main(String[] args){
		System.out.println(sort("Java is great"));
	}
	
	public static String sort(String s){
		s=s.toLowerCase();
		char[] c=s.toCharArray();
		boolean swapped = true;
	      int j = 0;
	      char tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < c.length - j; i++) {                                       
	                  if (c[i] > c[i + 1]) {                          
	                        tmp = c[i];
	                        c[i] = c[i + 1];
	                        c[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	      return new String(c);
	}
}