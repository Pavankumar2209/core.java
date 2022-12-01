public class EvenAndOdd{

	static int numbers[]={0,1,2,3,4,5,6,7,8,9};
	static int evenarray[]=numbers.length;
	static int oddarray[]=numbers.length;
	
	public static void main(String args[]){
	
		System.out.println("Length of the array is"+numbers.length);
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2==0){
			 
			evenarray[i]=numbers[i];
			}else{oddarry[i]=numbers[i];
			}
		}
		System.out.println(evenarray[i]);
		System.out.println(oddarray[i]);
	 
   }
}
	 
	/*System.out.println("Length of the array is"+numbers.length);
	 for(int i=0;i<numbers.length;i++){
		 if(numbers[i]%2==0){
			System.out.println("Even numbers are"+numbers[i]);
		 }else{System.out.println("odd numbers are"+numbers[i]);
		 }
	
	}

	}*/
