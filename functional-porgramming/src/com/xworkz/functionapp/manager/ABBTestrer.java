package com.xworkz.functionapp.manager;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

public class ABBTestrer {
	
	public static void main(String[] args)  {
		
		Company abb = new ABBImpl();
		List<ManagerDTO> li = abb.getAllManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		try {
		for(int i=0; i<size ; i++) {
			
			ManagerDTO manager = new ManagerDTO();
			
			System.out.println("Enter Manager Id");
			manager.setId(sc.nextInt());
			
			System.out.println("Enter Manager Name");
			manager.setName(sc.next());
			
			System.out.println("Enter Manager Age");
			manager.setAge(sc.nextInt());
			
			System.out.println("Enter manager Qualification");
			manager.setQualification(sc.next());
			
			System.out.println("Enter manager Salary");
			manager.setSalary(sc.nextInt());
				
			abb.addManager(manager);
			
			}
			abb.getAllManager();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Maximum Salary of the Manager in list ");
			System.out.println(li.stream().max(Comparator.comparing(ManagerDTO::getSalary)));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}finally {
				if(sc!= null) {
					sc.close();
				}
			}
		
		
		
	}
	

}
