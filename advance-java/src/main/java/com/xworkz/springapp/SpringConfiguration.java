package main.java.com.xworkz.springapp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SpringConfiguration {

	@Bean(name = "person1")
	 public Person getPerson1() {
		 
		 Person person =  new Person();
	 		person.setId(1);
	 		person.setAge(25);
	 		person.setName("Kiran");
	 		return person ;
	 }
	
	@Bean(name =  "person2")    // we use attributes to make  unique beans. name & value are  attributes for bean.
	 public Person getPerson2() {
		 
		 Person person =  new Person();
	 		person.setId(2);
	 		person.setAge(23);
	 		person.setName("shiva");
	 		return person ;
	 }
	
	@Bean(name = "person3")
	 public Person getPerson3() {
		 
		 Person person =  new Person();
	 		person.setId(3);
	 		person.setAge(25);
	 		person.setName("Vainhav");
	 		return person ;
	 }
	
	@Bean(name = "person4")
	 public Person getPerson4() {
		 
		 Person person =  new Person();
	 		person.setId(4);
	 		person.setAge(27);
	 		person.setName("Satish");
	 		return person ;
	 }
	
	@Bean(name = "person5")
	 public Person getPerson5() {
		 
		 Person person =  new Person();
	 		person.setId(5);
	 		person.setAge(25);
	 		person.setName("Prashanth");
	 		return person ;
	 }
	
	@Bean(name = "train1")
	public Train getTrain1() {
		
		Train train = new Train();
		train.setTrainNo(56325);
		train.setTrainName("Yeshwanthpur Express");
		train.setSource("Sedam");
		train.setDestination("ypr");
		
		return train ;
	}
	
	@Bean(name = "train2")
	public Train getTrain2() {
		
		Train train = new Train();
		train.setTrainNo(58585);
		train.setTrainName("Ksr Express");
		train.setSource("Ksr");
		train.setDestination("Kalaburagi");
		
		return train ;
	}
	
	@Bean(name = "train3")
	public Train getTrain3() {
		
		Train train = new Train();
		train.setTrainNo(74745);
		train.setTrainName("Ksr Express");
		train.setSource("kalaburagi");
		train.setDestination("Ksr");
		
		return train ;
	}
	
	@Bean(name = "train4")
	public Train getTrain4() {
		
		Train train = new Train();
		train.setTrainNo(52525);
		train.setTrainName("Udyan Express");
		train.setSource("ksr");
		train.setDestination("Yadgir");
		
		return train ;
	}
	
	@Bean(name = "train5")
	public Train getTrain5() {
		
		Train train = new Train();
		train.setTrainNo(45456);
		train.setTrainName("mysore Express");
		train.setSource("Yeshwanthpur");
		train.setDestination("Mysore");
		
		return train ;
	}
	

	@Bean(name = "food1")
	public FoodStall getFoodStall1() {
		
		FoodStall food = new FoodStall();
		food.setShopeNo(1);
		food.setPlace("Rajaji Nagara");
		food.setContactNo(9876543212l);
		
		return food;
	}
	
	@Bean(name = "food2")
	public FoodStall getFoodStall2() {
		
		FoodStall food = new FoodStall();
		food.setShopeNo(2);
		food.setPlace("RR Nagara");
		food.setContactNo(7897897894l);
		
		return food;
	}
	
	@Bean(name = "food3")
	public FoodStall getFoodStall3() {
		
		FoodStall food = new FoodStall();
		food.setShopeNo(3);
		food.setPlace("Kuvempu Nagara");
		food.setContactNo(9632587412l);
		
		return food;
	}
	
	@Bean(name = "food4")
	public FoodStall getFoodStall4() {
		
		FoodStall food = new FoodStall();
		food.setShopeNo(4);
		food.setPlace("Dasarahalli");
		food.setContactNo(9639639632l);
		
		return food;
	}
	
	@Bean(name = "food5")
	public FoodStall getFoodStall5() {
		
		FoodStall food = new FoodStall();
		food.setShopeNo(1);
		food.setPlace("Banashankari");
		food.setContactNo(8528528523l);
		
		return food;
	}
	
	
	@Bean(name = "laptop1")
	public Laptop getLaptop1() {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("Hp");
		laptop.setColour("Silver Colour");
		laptop.setPrice(58000.00);
		
		return laptop ;
		
	}
	
	@Bean(name = "laptop2")
	public Laptop getLaptop2() {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("Dell");
		laptop.setColour("Black Colour");
		laptop.setPrice(60000.00);
		
		return laptop ;
		
	}
	
	@Bean(name = "laptop3")
	public Laptop getLaptop3() {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("Acer");
		laptop.setColour("Silver Colour");
		laptop.setPrice(68000.00);
		
		return laptop ;
		
	}
	
	@Bean(name = "laptop4")
	public Laptop getLaptop4() {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("Apple");
		laptop.setColour("Black Colour");
		laptop.setPrice(80000.00);
		
		return laptop ;
	}
	
	@Bean(name = "laptop5")
	public Laptop getLaptop5() {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("HP");
		laptop.setColour("Black Colour");
		laptop.setPrice(72000.00);
		
		return laptop ;
		
	}

	@Bean(name ="wire1")
	public Wire getWire1() {
		
		Wire wir = new Wire();
		wir.setBrand("TWC");
		wir.setUse("To connect electronic devices ");
		wir.setPrice(735);
		
		return wir;
	}
	
	@Bean(name ="wire2")
	public Wire getWire2() {
		
		Wire wir = new Wire();
		wir.setBrand("Finolex");
		wir.setUse("To connect electronic devices ");
		wir.setPrice(1320);
		
		return wir;
	}
	
	@Bean(name ="wire3")
	public Wire getWire3() {
		
		Wire wir = new Wire();
		wir.setBrand("Polycab");
		wir.setUse("To connect electronic devices ");
		wir.setPrice(1048);
		
		return wir;
	}
	
	@Bean(name ="wire4")
	public Wire getWire4() {
		
		Wire wir = new Wire();
		wir.setBrand("OXCORD");
		wir.setUse("To connect electronic devices ");
		wir.setPrice(237);
		
		return wir;
	}
	
	@Bean(name ="wire5")
	public Wire getWire5() {
		
		Wire wir = new Wire();
		wir.setBrand("TWC");
		wir.setUse("To connect electronic devices ");
		wir.setPrice(950);
		
		return wir;
	}
	
	
	@Bean(name = "kitchen1")
	public Kitchen getKitchen1() {
		
		Kitchen kitchen = new Kitchen();
		kitchen.setId(1);
		kitchen.setName("Galli kitchen");
		kitchen.setPlace("Banashankari");
		
		return kitchen;
	}
	
	@Bean(name = "kitchen2")
	public Kitchen getKitchen2() {
		
		Kitchen kitchen = new Kitchen();
		kitchen.setId(2);
		kitchen.setName("Annapurna kitchen");
		kitchen.setPlace("Basavanagudi");
		
		return kitchen;
	}
	
	@Bean(name = "kitchen3")
	public Kitchen getKitchen3() {
		
		Kitchen kitchen = new Kitchen();
		kitchen.setId(3);
		kitchen.setName("Shanthi vilas");
		kitchen.setPlace("Rajajinagar");
		
		return kitchen;
	}
	
	@Bean(name = "kitchen4")
	public Kitchen getKitchen4() {
		
		Kitchen kitchen = new Kitchen();
		kitchen.setId(4);
		kitchen.setName("New Shanthi sagar");
		kitchen.setPlace("Whitfield");
		
		return kitchen;
	}
	
	@Bean(name = "kitchen5")
	public Kitchen getKitchen5() {
		
		Kitchen kitchen = new Kitchen();
		kitchen.setId(5);
		kitchen.setName("KK Tiffans");
		kitchen.setPlace("Peenya");
		
		return kitchen;
	}
	
	
	@Bean(name = "glass1")
	public Glass getGlass() {
		
		Glass glass = new Glass();
		glass.setName("");
		glass.setColour("Black");
		glass.setUse("To drink the water");
		
		return glass;
	}
	
	@Bean(name = "glass2")
	public Glass getGlass2() {
		
		Glass glass = new Glass();
		glass.setName("");
		glass.setColour("Red");
		glass.setUse("To drink the water");
		
		return glass;
	}
	
	@Bean(name = "glass3")
	public Glass getGlass3() {
		
		Glass glass = new Glass();
		glass.setName("");
		glass.setColour("White");
		glass.setUse("To drink the water");
		
		return glass;
	}
	
	@Bean(name = "glass4")
	public Glass getGlass4() {
		
		Glass glass = new Glass();
		glass.setName("");
		glass.setColour("Silver");
		glass.setUse("To drink the water");
		
		return glass;
	}
	
	@Bean(name = "glass5")
	public Glass getGlass5() {
		
		Glass glass = new Glass();
		glass.setName("");
		glass.setColour("Black");
		glass.setUse("To drink the water");
		
		return glass;
	}
	
	
	
	
	@Bean(name ="str1")
	public String getString1() {
		return "We started with spring";
		
	}
	
	@Bean(name ="str2")
	public String getString2() {
		return "We started with spring";
		
	}
	
	@Bean(name ="str3")
	public String getString3() {
		return "We started with spring";
		
	}
	
	@Bean(name ="str4")
	public String getString4() {
		return "We started with spring";
		
	}
	@Bean(name ="str5")
	public String getString5() {
		return "We started with spring";
		
	}
	
	
	@Bean(name = "inter1")
	public Integer getTnteger1() {
		return 9638522 ;
		
	}
	
	@Bean(name = "inter2")
	public Integer getTnteger2() {
		return 885522 ;
		
	}
	
	@Bean(name = "inter3")
	public Integer getTnteger3() {
		return 778899 ;
		
	}
	
	@Bean(name = "inter4")
	public Integer getTnteger4() {
		return 885522 ;
		
	}
	
	@Bean(name = "inter5")
	public Integer getTnteger5() {
		return 774411 ;
		
	}
	
	
	
	@Bean(name = "byt1")
	public Byte getByte1() {
		
		return 123 ;
	}
	
	@Bean(name = "byt2")
	public Byte getByte2() {
		
		return 25;
	}
	
	@Bean(name = "byt3")
	public Byte getByte3() {
		
		return 42 ;
	}
	
	@Bean(name = "byt4")
	public Byte getByte4() {
		
		return 122 ;
	}
	
	@Bean(name = "byt5")
	public Byte getByte5() {
		
		return 113;
	}
	
	
	@Bean(name = "chr1")
	public Character getCharacter1() {
		
		return 'P' ;
	}
	
	@Bean(name = "chr2")
	public Character getCharacter2() {
		
		return 'A' ;
	}
	
	@Bean(name = "chr3")
	public Character getCharacter3() {
		
		return 'V' ;
	}
	
	@Bean(name = "chr4")
	public Character getCharacter4() {
		
		return 'A' ;
	}
	
	@Bean(name = "chr5")
	public Character getCharacter5() {
		
		return 'N' ;
	}
	
	
	@Bean(name = "boolen1")
	public Boolean getBoolean1() {
		
		return true ;
	}
	
	@Bean(name = "boolen2")
	public Boolean getBoolean2() {
		
		return false ;
	}
	@Bean(name = "boolen3")
	public Boolean getBoolean3() {
		
		return true ;
	}
	
	@Bean(name = "boolen4")
	public Boolean getBoolean4() {
		
		return true ;
	}
	
	@Bean(name = "boolen5")
	public Boolean getBoolean5() {
		
		return false ;
	}
	
	
	@Bean(name =  "lon1")
	public Long getLong1() {
		
		return 9638527412l ;
	}
	
	@Bean(name =  "lon2")
	public Long getLong2() {
		
		return 9876543212l ;
	}
	
	@Bean(name =  "lon3")
	public Long getLong3() {
		
		return 7896541233l ;
	}
	
	@Bean(name =  "lon4")
	public Long getLong4() {
		
		return 8528528523l ;
	}
	
	@Bean(name =  "lon5")
	public Long getLong5() {
		
		return 7417417412l ;
	}
	
	
	
	@Bean(name = "no1")
	public Double getDouble1() {
		
		return 55.55 ;
	}
	
	@Bean(name = "no2")
	public Double getDouble2() {
		
		return 66.66;
	}
	
	@Bean(name = "no3")
	public Double getDouble3() {
		
		return 77.77 ;
	}
	
	@Bean(name = "no4")
	public Double getDouble4() {
		
		return 88.88;
	}
	
	@Bean(name = "no5")
	public Double getDouble5() {
		
		return 99.99 ;
	}
	
	
	
	@Bean(name = "fl1")
	public Float getFloat1() {
		
		return 11.22f ;
	}
	
	@Bean(name = "fl2")
	public Float getFloat2() {
		
		return 22.33f ;
	}
	
	@Bean(name = "fl3")
	public Float getFloat3() {
		
		return 33.44f ;
	}
	
	@Bean(name = "fl4")
	public Float getFloat4() {
		
		return 44.55f ;
	}
	
	@Bean(name = "fl5")
	public Float getFloat5() {
		
		return 55.66f ;
	}
	
	
	@Bean(name = "shrt1")
	public Short getShort1() {
		return 115;
	}
	
	@Bean(name = "shrt2")
	public Short getShort2() {
		return 225;
	}
	
	@Bean(name = "shrt3")
	public Short getShort3() {
		return 335;
	}
	
	@Bean(name = "shrt4")
	public Short getShort4() {
		return 445;
	}
	
	@Bean(name = "shrt5")
	public Short getShort5() {
		return 555;
	}
	
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
}
