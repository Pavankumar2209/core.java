class ChatAngadi{
		
		
		public int id;
		public String name;
		public String chatNames[];
		
		
		
		public ChatAngadi(int id, String name, String[] chatNames ){
		
		this.id=id;
		this.name=name;
		this.chatNames=chatNames;
		}
		

		public void displayingChatAngadi(){
		
		System.out.println("The id of the chat Angadi:"+this.id);
		
		System.out.println("The name of the chat Angadi is :"+this.name);
		
		System.out.println("Chats available in chat Angadi are :");
		for(int index=0; index<chatNames.length;index++){
		System.out.println(chatNames[index]);
		}
		
		
		}

}

