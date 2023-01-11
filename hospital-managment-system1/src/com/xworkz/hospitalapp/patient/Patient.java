package com.xworkz.hospitalapp.patient;

public class Patient  {
		
	
	public Patient() {
		
	}
		private int patientId;
		private String patientName;
		private String bloodGroup;
		private int age;
		private String gender;
		
		public Patient(int patientId, String patientName, int age, String bloodGroup, String gender){
				
				this.patientId=patientId;
				this.patientName=patientName;
				this.age=age;
				this.bloodGroup = bloodGroup;
				this.gender=gender;
			
		}
		
		
		//public getter and setter method
		
		public void setPatientId(int patientId) {
			this.patientId=patientId;
		}
		public int getPatientId() {
			return patientId;
		}
		
		
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getPatientName() {
			return patientName;
		}
		
		public void setPatientBloodGroup(String bloodGroup) {
			this.bloodGroup=bloodGroup;
		}
		public String getPatientBloodGroup() {
			return bloodGroup;
		}
		
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		
		
		
		
		
}
