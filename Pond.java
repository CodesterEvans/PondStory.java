
public class Pond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Spawning Frogs and Flies into the pond.
		
		Frog Peepo = new Frog("Peepo");
		
		//Frog.setSpecies("Dog");
		Frog Pepe = new Frog("Pepe",10,15);
		
		Frog Peepaw = new Frog("Peepaw",4.6,5);
		
		Frog Mimi = new Frog("Mimi",85.0,5);
		//System.out.println(Mimi.getSpecies());
		
		Fly buzz = new Fly();
		Fly light = new Fly(6);
		Fly year = new Fly(1,3);
		
		// Operations 
		
		Mimi.setSpecies("1331 Frogs");
		//System.out.println(Mimi.getSpecies());
		
		//Peepo the frog's attributes.
		System.out.println(Peepo.toString());
		
		//Peepo attempts to eat the fly named light.
		Peepo.eat(light);
		
		// The fly is too speedy and the frog too small! Fly wins!
		System.out.println(light.toString());
		
		// Peepo the frog trains hard
		Peepo.grow(8);
		
		/*Peepo the frog is stronger and attempts to eat the
		fly named Light again. */
		Peepo.eat(light);
		
		/* The fly was eaten, look at what he says now!
		Peepo won and got stronger! */
		
		System.out.println(light.toString());
		System.out.println(Peepo.toString());
		
		// Mimi the frog speaks
		System.out.println(Mimi.toString());
		
		// Peepaw the frog grows and speaks.
		Peepaw.grow(4);
		System.out.println(Peepaw.toString());
		
		//Pepe the frog speaks
		System.out.println(Pepe.toString());
		
		
	}

}
