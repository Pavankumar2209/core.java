public class GetTheOutput1{

		public static void main(String args[]){
		
		/*1st program: to Print  the output as 1 2 3 4
											1 2 3 4
											1 2 X-workz 4
											1 2 3 4*/
		for(int row=1;row<=4;row++){
			for(int col=1;col<=4;col++){
				if(row==3 && col==3){
					System.out.print("X-workz"+" ");
				}
			System.out.print(col);
			}
		System.out.println(" ");
		}
		
		System.out.println("Printing 2nd program");
		
		/*2nd program: to print the output as X-workz 1 1 1
											2 2 2 2
											3 3 3 3
											4 4 4 4*/
		
		for(int row=1;row<=4;row++){
			for(int col=1;col<=4;col++){
				if(row==1 && col==1){
					System.out.print("X-workz"+" ");
				}else{System.out.print(row);
				}
			
			}
		System.out.println(" ");
		}		
		
		
		}
		
		
	

}