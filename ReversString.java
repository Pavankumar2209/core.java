class ReversString{

										//Concept: To print the String in revers order 
	
	public static void main(String[] args){
	
	String name="Class";
	
	//converting string to array
	
	char jai[]=name.toCharArray();
	
	for (int i=jai.length-1;i>=0;i--){
	
	System.out.println(jai[i]);

	}

	//To print the words in revers order
	
	String word= "There will be no class Tomorrow";	
	String words[]= word.split(" ");
	
	for(int i=words.length-1;i>=0;i--){
		System.out.print(words[i]+" ");
	}
	}


}