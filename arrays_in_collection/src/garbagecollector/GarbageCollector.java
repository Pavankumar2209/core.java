package garbagecollector;

public class GarbageCollector {
	
	// garbage collector is method in java , it is available in System class
	
	
	
	 @Override
	protected void finalize() throws Throwable {
		
		 System.out.println("Calling finalized method to clean the object from the memory");
	}
	
	 public static void main(String[] args) {
		
		 GarbageCollector garbage =  new GarbageCollector()	;
		 
		 garbage = null;  //1st way of making object to garbage collector
		 
		 GarbageCollector garbage1 = new GarbageCollector();
		 
		 System.out.println("After making object is to  ready  for garbage collector in 2nd way");
		 garbage = garbage1;
		 
		 System.gc(); //gc method will call the  finalize method when object is ready for garbage collector only.
	}

}
