class ParentAndChildTester{

	public static void main(String[] args){
	
	System.out.println("Main Method Started");
	
	Child child =new Child();
	long turnover=child.doBusiness();
	System.out.println("Business Turnover is"+turnover);
	System.out.println("Main Method Ended");

	
		
		
	}
	


}