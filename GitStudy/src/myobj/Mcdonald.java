package myobj;

public class Mcdonald {
		
		int calorie =700;
		int size = 5;
		String material;
		String[] menu = new String[] {"bigMac" , "1955", "shanghai", "mcChiken"};
		
		void single() {
			size--;
			calorie -= 50;
		}	
		void setUp() {
			size++;
			calorie += 70;
		}		
		
		public Mcdonald(String[] menu) {
			this.menu = menu;
		}
		public Mcdonald(int size) {
			this.size = size;
		}
}




