class Splitmethod{
		
								//Concept: Using split method and count the number of words in a sentence 
		
		public static void main(String[] args){
		
		String city ="Bangluru mysore kalaburagi kodagu";
		System.out.println(city);
		
		//spliting the words in sentence by using split method
		String cities[]=city.split(" ");
		int count=0;
		for(int i=0; i<cities.length;i++){
			System.out.println(cities[i]);
			count+=1;
		
		}
		System.out.println("word count:"+count);
		}
	




}