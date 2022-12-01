public class RowAndColumn{

	public static void main(String args[]){
		for(int row=1; row<=4;row++){
			for(int col=1;col<=4;col++){
				if(row==1 && col==1 ){
				System.out.print("@@@"+" ");	
				}else{System.out.print(col+" ");
				}
							
				
			}
		System.out.println(" ");
		}
		for(int row=1;row<=4;row++){
			for(int col=row;col<=4;col++){
			System.out.print(col);
		}
		
		System.out.println();
	}
	}
}