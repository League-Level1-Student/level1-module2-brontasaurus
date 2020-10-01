package _03_smurf;

public class Smur {

	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy Smurf");
		Smurf papa = new Smurf("Papa Smurf");
		Smurf ette = new Smurf("Smurfette");
		
		handy.eat();
		System.out.println(handy.getName());
		//System.out.println(handy.getHatColor());
		//System.out.println(handy.isGirlOrBoy());
		
		papa.eat();
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		//System.out.println(papa.isGirlOrBoy());
		
		ette.eat();
		System.out.println(ette.getName());
		System.out.println(ette.isGirlOrBoy());
		
		
	}
	
	
}
