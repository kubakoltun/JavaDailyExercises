class bit_train {
	public static void main(String args[]) {
		//165 | 1  
		//82  | 0
		//41  | 1  
		//20  | 0
		//10  | 0
		//5   | 1  
		//2   | 0 
		//1   | 1  
		System.out.println(0b00010100101);

		//	  | 0    	
		//165 | 1  }-> 2
		//82  | 0

		//41  | 1  
		//20  | 0 }-> 4
		//10  | 0

		//5   | 1  
		//2   | 0 }-> 5
		//1   | 1  
		System.out.println(0245);

		//165 | 1  
		//82  | 0
		//41  | 1  }-> 10 -> A
		//20  | 0

		//10  | 0 
		//5   | 1  
		//2   | 0 }-> 5
		//1   | 1  
		System.out.println(0xA5);


		int a = 14 >> 0;
		System.out.println(a);
		int b = a << 2;
		System.out.println(b);
		int c = b >> 4;
		System.out.println(c);


		int iv = 12;
    int ivb = ~iv | 8; 
		int iveq = iv & ivb;
    System.out.println("koniunkcja " + iveq);  


		int va = 25;
		int vb = ~va & 29;
		int veq = va | vb;
		System.out.println("alternatywa " + veq);
	}
}
