package com.xworkz.stringmethodspack;

public class UsingStringMethods {
	
	public static void main(String[] args) {
		
		String name = "Pavan Kumar";
		String name1 = "Pavan Kumar";
		
		System.out.println(name.equals(name1)); // .equals method : here compare values with cases(upper or lower), if difference in case we het output as a false.
		
		String a= "Pavan kumar";
		String b= "PaVaN KuMaR";
		
		System.out.println(a.equalsIgnoreCase(b)); //.equalsIgnoreCase  method : here compare values or data only it will ignore cases (upper or lower)
		
		String c = "Pavan Kumar ";
		String d= "Kum";
		
		System.out.println(c.contains(d)); //.contains() method: here compare char's only if main String char are matching it will give true as output.
		
			
		String e = "PavanKumar";
		System.out.println(e.substring(3)); // substring() method with one object(intbeginIndex) : here we get  output which starts from given index value
				
		String f = "PavanKumar";
		System.out.println(f.substring(2, 7)); //substring() method with one object(intbeginIndex , intendIndex) : here we get output which is between indexbeging and indexend values.
		
		String g = "Pavankumar";
		System.out.println(g.indexOf('k')); //indexOf() method : here we get the index value of char which we want to know .
		
		String  h = "PavanKumar";
		System.out.println(h.length()); // .length() method: here we get length of the String.
		
		String i = name.toUpperCase(); // toUpperCase() method : to convert all String values to upper case
		System.out.println("lower case string value "+name+" "+ "to UPPER CASE:"+i);
		
		String nam1 = "PAVAN KUMAR";
		String j = nam1.toLowerCase(); // toLowerCase() method: it is used to convert  all lowercase string values to upper case.
		System.out.println("UPPER case string value "+nam1+" "+ "to lower case:"+j);
		
		String aa= "Krishna";										
		String bb="Mahesh";
		String cc= "Vinod";
		String dd = "Vilas";
		String ee = "Bharath";
		System.out.println(String.join(";",aa,bb,cc,dd,ee)); 
		/* Returns a new String composed of copies of the CharSequence elements joined together 
		with a copy ofthe specified delimite.
		For example,String message = String.join("-", "Java", "is", "cool"); 
		 message returned is: "Java-is-cool"
		Note that if an element is null, then "null" is added.Parameters:*/
		
		boolean kk = false;/* String.valueOf method: it is used to convert any datatype of  value to string vale;*/
		int ll =55;
		String s1 = String.valueOf(kk);
		String s2 = String.valueOf(ll);
		System.out.println(s1);  // output: false
		System.out.println(s2); // output: 55
		
		
	}
	

}
