package com.xworkz.hospitalapp.patient;

public class Patient  {
		
		public int patientId;
		public String patientName;
		public String bloodGroup;
		public int age;
		public String gender;
		
		public Patient(int patientId, String patientName, int age, String bloodGroup, String gender){
				
				this.patientId=patientId;
				this.patientName=patientName;
				this.age=age;
				this.bloodGroup = bloodGroup;
				this.gender=gender;
			
		}
	
}
