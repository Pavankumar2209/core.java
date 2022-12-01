public class Pattern4{
 
	public static void main(String args[]){
	
	/*to print the output as     # # #  
								 #	 #
								 # # # 
								 #	  
								 #
								 # */
		
		for(int row=1;row<=6;row++){
			for(int col=1;col<=3;col++){
			if(row==1 || col==1 ||row==2 && col==3|| row==3 && col==2 ||row==3 && col==3  ){
					System.out.print("#"+" ");
				}else{System.out.print("  ");
				}
				
			
			}
		System.out.println("  ");
		}
		
	
	}


}