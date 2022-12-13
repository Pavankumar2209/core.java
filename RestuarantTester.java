class RestuarantTester{

		public static void main(String[] args){
		
		String workers[]={"Mahesh","Kiran","omkar","Anand","Praveen"};
		String menu[]={"Gobi","chicken biriyani","Masala papad","Pani Puri"};
		
		Restuarant rest = new Restuarant(1,"MG Road","Udupi hotel",workers,menu);
		
		rest.displayDetails();
		
		Restuarant rest1= new Restuarant(12,"VV Puram","Shahi Taj",workers,menu);
		rest1.displayDetails();
		}

}