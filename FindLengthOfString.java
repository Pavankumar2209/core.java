class FindLengthOfString{
 
	// Concept: To counting the characters in strings
	
	
	public static void main(String[] args){
	
	String name="Class";
	System.out.println(name);
	
	//character count by using length() method
	System.out.println("String count is:"+name.length());
	
	//character count by using lengthtoCharArray()
	int count=0;
	char jai[]=name.toCharArray();
	for (int i=0;i<jai.length;i++){
	count+=1;
	}
	System.out.println("Word count:"+count);
	
	//character count by without using length method or lenth keyword, printing by using: foreach method
	int count1=0;
	for(char krish:name.toCharArray()){
		System.out.println(krish);
		count1+=1;
	}
	System.out.println("count the String count "+count1);
	
	
	}



}