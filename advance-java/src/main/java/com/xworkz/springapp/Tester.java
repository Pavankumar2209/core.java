package main.java.com.xworkz.springapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	
	public static void main(String args[]) {
		
		//ApplicationContext is a interface  and AnnotationConfigApplicationContext is implemented class and SpringConfiguration.class is argument
		ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Person person1 =  application .getBean("person1",Person.class);
		System.out.println(person1);
		
		Person person2 = application.getBean("person2",Person.class);
		System.out.println(person2);
		
		Person person3 = application.getBean("person3",Person.class);
		System.out.println(person3);
		
		Person person4 = application.getBean("person4",Person.class);
		System.out.println(person4);
		
		Person person5 = application.getBean("person5",Person.class);
		System.out.println(person5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Wire wi1 = application.getBean("wire1",Wire.class);
		System.out.println(wi1);
		
		Wire wi2 = application.getBean("wire2",Wire.class);
		System.out.println(wi2);
		
		Wire wi3 = application.getBean("wire3",Wire.class);
		System.out.println(wi3);
		
		Wire wi4 = application.getBean("wire4",Wire.class);
		System.out.println(wi4);
		
		Wire wi5 = application.getBean("wire5",Wire.class);
		System.out.println(wi1);
		
		System.out.println("----------------------------------------------------------------------");
		
		Train rail1 =  application.getBean("train1",Train.class);
		System.out.println(rail1);
		
		Train rail2 =  application.getBean("train2",Train.class);
		System.out.println(rail2);
		
		Train rail3 =  application.getBean("train1",Train.class);
		System.out.println(rail1);
		
		Train rail4 =  application.getBean("train4",Train.class);
		System.out.println(rail4);
		
		Train rail5 =  application.getBean("train5",Train.class);
		System.out.println(rail5);
		
		System.out.println("----------------------------------------------------------------------");
		
		FoodStall fod1 = application.getBean("food1",FoodStall.class);
		System.out.println(fod1);
		
		FoodStall fod2 = application.getBean("food2",FoodStall.class);
		System.out.println(fod2);
		
		FoodStall fod3 = application.getBean("food3",FoodStall.class);
		System.out.println(fod3);
		
		FoodStall fod4 = application.getBean("food4",FoodStall.class);
		System.out.println(fod4);
		
		FoodStall fod5 = application.getBean("food5",FoodStall.class);
		System.out.println(fod5);
	
		System.out.println("----------------------------------------------------------------------");
		
		Laptop lp1 = application.getBean("laptop1",Laptop.class);
		System.out.println(lp1);
		
		Laptop lp2 = application.getBean("laptop2",Laptop.class);
		System.out.println(lp2);
		
		Laptop lp3 = application.getBean("laptop3",Laptop.class);
		System.out.println(lp3);
		
		Laptop lp4 = application.getBean("laptop4",Laptop.class);
		System.out.println(lp4);
		
		Laptop lp5 = application.getBean("laptop5",Laptop.class);
		System.out.println(lp5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Kitchen kit1 = application.getBean("kitchen1",Kitchen.class);
		System.out.println(kit1);
		
		Kitchen kit2 = application.getBean("kitchen2",Kitchen.class);
		System.out.println(kit2);
		
		Kitchen kit3 = application.getBean("kitchen3",Kitchen.class);
		System.out.println(kit3);
		
		Kitchen kit4 = application.getBean("kitchen4",Kitchen.class);
		System.out.println(kit4);
		
		Kitchen kit5 = application.getBean("kitchen5",Kitchen.class);
		System.out.println(kit5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Glass gls1 = application.getBean("glass1",Glass.class);
		System.out.println(gls1);
		
		Glass gls2 = application.getBean("glass2",Glass.class);
		System.out.println(gls2);
		
		Glass gls3 = application.getBean("glass3",Glass.class);
		System.out.println(gls3);
		
		Glass gls4 = application.getBean("glass4",Glass.class);
		System.out.println(gls4);
		
		Glass gls5 = application.getBean("glass5",Glass.class);
		System.out.println(gls5);
		
		System.out.println("----------------------------------------------------------------------");
		
		String abc1 = application.getBean("str1",String.class);
		System.out.println(abc1);
		
		String abc2 = application.getBean("str2",String.class);
		System.out.println(abc2);
		

		String abc3 = application.getBean("str3",String.class);
		System.out.println(abc3);
		

		String abc4 = application.getBean("str4",String.class);
		System.out.println(abc4);
		

		String abc5 = application.getBean("str5",String.class);
		System.out.println(abc5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Integer in1 = application.getBean("inter1",Integer.class);
		System.out.println(in1);
		
		Integer in2 = application.getBean("inter2",Integer.class);
		System.out.println(in1);
		
		Integer in3 = application.getBean("inter3",Integer.class);
		System.out.println(in1);
		
		Integer in4 = application.getBean("inter4",Integer.class);
		System.out.println(in1);
		
		Integer in5 = application.getBean("inter5",Integer.class);
		System.out.println(in1);
		
		System.out.println("----------------------------------------------------------------------");
		
		Byte byt1 = application.getBean("byt1",Byte.class);
		System.out.println(byt1);
		
		Byte byt2 = application.getBean("byt2",Byte.class);
		System.out.println(byt2);
		
		Byte byt3 = application.getBean("byt3",Byte.class);
		System.out.println(byt3);
		
		Byte byt4 = application.getBean("byt4",Byte.class);
		System.out.println(byt4);
		
		Byte byt5 = application.getBean("byt5",Byte.class);
		System.out.println(byt5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Character ch1 = application.getBean("chr1",Character.class);
		System.out.println(ch1);
		
		Character ch2 = application.getBean("chr2",Character.class);
		System.out.println(ch2);
		
		Character ch3 = application.getBean("chr3",Character.class);
		System.out.println(ch3);
		
		Character ch4 = application.getBean("chr4",Character.class);
		System.out.println(ch4);
		
		Character ch5 = application.getBean("chr5",Character.class);
		System.out.println(ch5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Boolean boolen1 = application.getBean("boolen1",Boolean.class);
		System.out.println(boolen1);
		
		Boolean boolen2 = application.getBean("boolen2",Boolean.class);
		System.out.println(boolen2);
		
		Boolean boolen3 = application.getBean("boolen3",Boolean.class);
		System.out.println(boolen3);
		
		Boolean boolen4 = application.getBean("boolen4",Boolean.class);
		System.out.println(boolen4);
		
		Boolean boolen5 = application.getBean("boolen5",Boolean.class);
		System.out.println(boolen5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Long lng1 = application.getBean("lon1",Long.class);
		System.out.println(lng1);
		
		Long lng2 = application.getBean("lon2",Long.class);
		System.out.println(lng1);
		
		Long lng3 = application.getBean("lon3",Long.class);
		System.out.println(lng1);
		
		Long lng4 = application.getBean("lon4",Long.class);
		System.out.println(lng1);
		
		Long lng5 = application.getBean("lon5",Long.class);
		System.out.println(lng1);
		
		System.out.println("----------------------------------------------------------------------");
		
		Double dbl1 = application.getBean("no1",Double.class);
		System.out.println(dbl1);
		
		Double dbl2 = application.getBean("no2",Double.class);
		System.out.println(dbl2);
		
		Double dbl3 = application.getBean("no3",Double.class);
		System.out.println(dbl3);
		
		Double dbl4 = application.getBean("no1",Double.class);
		System.out.println(dbl4);
		
		Double dbl5 = application.getBean("no1",Double.class);
		System.out.println(dbl5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Float flp1 =  application.getBean("fl1",Float.class);
		System.out.println(flp1);
		
		Float flp2 =  application.getBean("fl2",Float.class);
		System.out.println(flp2);
		
		Float flp3 =  application.getBean("fl3",Float.class);
		System.out.println(flp3);
		
		Float flp4 =  application.getBean("fl4",Float.class);
		System.out.println(flp4);
		
		Float flp5 =  application.getBean("fl5",Float.class);
		System.out.println(flp5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Short shr1 = application.getBean("shrt1",Short.class);
		System.out.println(shr1);
		
		Short shr2 = application.getBean("shrt2",Short.class);
		System.out.println(shr2);
		
		Short shr3 = application.getBean("shrt3",Short.class);
		System.out.println(shr3);
		
		Short shr4 = application.getBean("shrt4",Short.class);
		System.out.println(shr4);
		
		Short shr5 = application.getBean("shrt5",Short.class);
		System.out.println(shr5);
		
		System.out.println("----------------------------------------------------------------------");
		
		Scanner scc = application.getBean(Scanner.class);
		System.out.println(scc);
		
	}
	
}
