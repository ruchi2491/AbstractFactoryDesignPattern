
public class Client {

	public static void main(String[] args) {
		
		Animal animal=null;
		AnimalFactory animalfactory=null;
		String speaksound=null;
		
		//get factory object by passing the factory type
		animalfactory=AnimalFactory.getanimalfactory("sea");
		
		System.out.println("animal factory type is----"+animalfactory.getClass().getName());
		 
		
		animal=animalfactory.getanimal("shark");
		speaksound=animal.speak();
		System.out.println(speaksound);
		
		animal=animalfactory.getanimal("octopus");
		//System.out.println(animal.getClass().getName());
		speaksound=animal.speak();
		System.out.println(speaksound);
		
		System.out.println("...........................................LandAnimals................................");
		
		animalfactory=AnimalFactory.getanimalfactory("land");
		System.out.println("animal factory type is----"+animalfactory.getClass().getName());
		animal=animalfactory.getanimal("cat");
		speaksound=animal.speak();
		System.out.println(speaksound);
		
		animal=animalfactory.getanimal("dog");
		speaksound=animal.speak();
		System.out.println(speaksound);
	}
}
