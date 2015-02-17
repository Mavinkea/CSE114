public class SelectionSort {

	public static void main(String[] args){
		/*int[] arr = {1,2,5,4};
		int[] sorted=selectionSort(arr);
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i]+" ");
		}
		int[][] a={{1,2,3,4},{1,2,3,4}};
		System.out.println(sumWithDoWhile(a));
		*/
		
	}
	
	public static int[] selectionSort(int[] arr){
		int minIndex;
		for(int i=0;i<arr.length;i++){
			minIndex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			if(minIndex!=i){
				swap(i,minIndex,arr);
			}
		}
		
		return arr;
	}
	
	public static int[] insertionSort(int[] arr){
		int element,j;
		for(int i=1;i<arr.length;i++){
			element=arr[i];
			j=i;
			while(j>0 && arr[j-1]>element){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=element;
		}
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(j,j+1,arr);
				}
			}
		}
		
		return arr;
	}
	
	public static int sumWithWhile(int[][] arr){
		int sum=0,i=0,j=0;
		while(i<arr.length){
			while(j<arr[i].length){
				sum+=arr[i][j];
				j++;
			}
			j=0;
			i++;
		}	
		return sum;
	}
	
	public static int sumWithDoWhile(int[][] arr){
		int sum=0,i=0,j=0;
		do{
			do{
				sum+=arr[i][j];
				j++;
			}while(j<arr[i].length);
			i++;
			j=0;
		}while (i<arr.length);	
		return sum;
	}
	
	public static void swap(int i,int j,int[] arr){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	//recursively returns largest element of an array 
	public static int largest(int[] arr, int head, int end){
		if(head==end)return arr[head];
		else if(arr[head]<arr[end]){
			return largest(arr,head+1,end);
		}
		else return arr[head];
	}
	
	//recursively returns the factorial of a number n
	public static int factorial(int n){
		if(n==1)return 1;
		else return n*factorial(n-1);
	}
	
	public static int fibonnaci(int n){
		if(n==1 || n==0)return n;
		else {
			return fibonnaci(n-1)+fibonnaci(n-2);
		}
	}
	
	public static boolean isPalindrome(String s){
		if(s.length()<=1)return true;//returns true if recursive calls have knocked off all letters from either side
		else if(s.charAt(0)!=s.charAt(s.length()-1))return false;
		else return isPalindrome(s.substring(1,s.length()-1));//recursive call with string not including 1st and last chars
	}
	
	
}
