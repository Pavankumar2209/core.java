class PatientShivappa{

	//declariation of variables
	static String patientName ;
	static	long patientContactNo ;
	static	int patientAge ;
	static	String bloodGroup ;
	static	String patientDisease ;
	static	String patientWard ;
	
	public static void main(String [] args)
	{
		
		System.out.println("Invoking variables before Initialization");
		System.out.println("==============================");
		
		System.out.println("Patient name is "+patientName);
		System.out.println("Patient contact no is "+patientContactNo);
		System.out.println("Patient age is "+patientAge);
		System.out.println("Patient bloodGroup is "+bloodGroup);
		System.out.println("Patient Disease is "+patientDisease);
		System.out.println("Patient Ward no is "+patientWard);
		
		//initialization of variables 
		 patientName = "Karthik" ;
		 patientContactNo = 9988667755l;
		 patientAge = 85 ;
		 bloodGroup= "A" ;
		 patientDisease = "Sugar" ;
		 patientWard = "B" ;
		
		System.out.println("==============================");
		System.out.println("Invoking variables after Initialization");
		System.out.println("Patient name is "+patientName);
		System.out.println("Patient contact no is "+patientContactNo);
		System.out.println("Patient age is "+patientAge);
		System.out.println("Patient bloodGroup is "+bloodGroup);
		System.out.println("Patient Disease is "+patientDisease);
		System.out.println("Patient Ward no is "+patientWard);
		
		}
}