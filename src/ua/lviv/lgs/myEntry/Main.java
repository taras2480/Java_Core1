package ua.lviv.lgs.myEntry;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new Map<>();
		
		map.addElement(new MyEntry<>("Cost 1", 27));
		map.addElement(new MyEntry<>("Cost 2", 13));
		map.addElement(new MyEntry<>("Cost 3", 17));
		map.addElement(new MyEntry<>("Cost 4", 47));
		map.addElement(new MyEntry<>("Cost 5", 24));
		map.addElement(new MyEntry<>("Cost 6", 22));
		
		System.out.println();
		map.showMap();
		System.out.println();
		
		map.removeKey("Cost 6");
		
		System.out.println();
		map.showMap();
		System.out.println();
		
		map.removeValue(24);
		
		System.out.println();
		map.showMap();
		System.out.println();
		
		map.showKeys();
		
		System.out.println();
		map.showMap();
		System.out.println();
		
		map.showValue();
		
		System.out.println();
		map.showMap();
		
		
		
		
		
		
		
		
		
	}

}
