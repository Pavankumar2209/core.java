public class Pattern1{

		public static void main(String args[]){
		/* to print the output as # # # #
								  #     #
								  #     #
								  # # # #*/
		for(int row=1;row<=4;row++){
			for(int col=1;col<=4;col++){
				if(row==1 || col==1 ||row==4 || col==4 ){
					System.out.print("#"+" ");
				}else{System.out.print("  ");
				}
				
			
			}
		System.out.println(" ");
		}
		
		
		
		
		}



}