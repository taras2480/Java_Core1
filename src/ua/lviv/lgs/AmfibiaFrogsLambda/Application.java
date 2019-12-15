package ua.lviv.lgs.AmfibiaFrogsLambda;

public class Application {

	public static void main(String[] args) {
		
		Amphibia eatFrog = ()->System.out.println("Frog eating");
		Amphibia sleepFrog = ()->System.out.println("Frog sleeping");
		Amphibia swimFrog = ()->System.out.println("Frog swimming");
		Amphibia goForWalkFrog = ()->System.out.println("Frog walking");
		
		eatFrog.doSmth();
		sleepFrog.doSmth();
		swimFrog.doSmth();
		goForWalkFrog.doSmth();
		
		
		

	}

}
