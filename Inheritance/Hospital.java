class Hospital{


			Patient patient[] = new Patient[1];
			int index;
			
			public Hospital(){
				System.out.println("Hospital Object is created");
			}

			//Patient patient[] = mew Patient[Size];   2nd type of arry initialization;
			//String str[]={"pavan","Praveen","Vinay"};   1st type of arry initialization;
			
			public boolean admit(Patient patient){
				System.out.println("Admit Process Started");
					boolean isAdmitted=false;
				
				//validation
				if(patient.patientName !=null){
				
					this.patient[index++] = patient;
					isAdmitted = true;	
				}
				
				System.out.println("Admit Process ended");
				
				return isAdmitted;
			
			}

			public void getPatient(){
					System.out.println("detail of patient are:");
					for(int ind=0; ind<this.patient.length;ind++){	
					System.out.println(patient[ind].patientId+ " "+ patient[ind].patientName+" "+ patient[ind].bloodGroop+ " "+patient[ind].age + " " +patient[ind].gender);
					}
			}
				
			
			
			
}