class Stationery{

			public int id;
			public String name;
			public String noteBooks[];
			public String pens[];
			public String charts[];
			
			
			public Stationery(int id, String name, String noteBooks[], String pens[],String charts[]){
				
				this.id=id;
				this.name=name;
				this.noteBooks=noteBooks;
				this.pens=pens;
				this.charts=charts;
				
				
			}
				
			public void displayingDetails(){
			
				System.out.println("Displaying the detais of stationery");
				
				System.out.println("The stationery id "+this.id);
				
				System.out.println("The stationery Shope name is "+this.name);
				
				System.out.println("NoteBooks available stationery Shope");
				for(int index=0; index<noteBooks.length;index++){
				System.out.println(noteBooks[index]);
				}
			
				System.out.println("Pens available in Stationery shope");
				for(int index1=0; index1<pens.length;index1++){
				System.out.println(pens[index1]);
				}
			
				System.out.println("Charts available in stationery Shope");
				for(int index2=0; index2<charts.length;index2++){
				System.out.println(charts[index2]);
				}
			
			}


}