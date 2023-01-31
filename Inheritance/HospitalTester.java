class HospitalTester{


		public static void main(String[] args){
		
		System.out.println("Main method is started");
		
		
		Hospital hospital= new Hospital();
		Hospital hospital1= new Hospital();
		
		
		Patient patient = new Patient(12, "Vinay",25, "o+", "Male");
		Patient patient1 = new Patient(22,"Naveen",25, "AB+", "Male");
		
		hospital.admit(patient);
		hospital.getPatient();
		
		hospital1.admit(patient1);
		hospital1.getPatient();
		
		System.out.println("main method ended");
		
		}
		
		



}