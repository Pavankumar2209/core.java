class Practices{

			static String name = "Pavan";
			static String names[] = {"Pavan","praveen", "vijay", "krishna", "mahesh"};
			
			
			public static void getnames(){
			
			
				System.out.println(name);
				
				System.out.println(names[0]+" "+names[1]+" " +names[2]+" "+names[3]);
				
				for(int namess=0; namess<names.length; namess++)
				{
					System.out.println(names[namess]);
				}
			
			}
			
			public static void main (String a[]){
					
				getnames();
			
			}
			
}