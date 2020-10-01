package _02_sea_creature;

public class Sea_Creature_Runner {
public static void main(String[] args) {
	
	SeaCreature spongebob = new SeaCreature("hnurg");
	SeaCreature patrick = new SeaCreature("eurgh");
	SeaCreature squidward = new SeaCreature("beulh");
	
	System.out.println(spongebob.getName());
	System.out.println(patrick.getName());
	System.out.println(squidward.getName());
	
	spongebob.eat();
	patrick.eat();
	squidward.eat();
	
	spongebob.laugh();
	patrick.laugh();
	squidward.laugh();
	
	
	
}

}
	