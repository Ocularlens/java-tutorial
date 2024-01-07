package user;

import provider.Logger;
import provider.sub.LoggerV2;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = new Logger();
		
		log.printLine("Lebron James");
		log.printLine("Steph Curry");
		
		LoggerV2 log2 = new LoggerV2();
		
		log2.print("Aldous");
		log2.print("Javier \n");
	}

}
