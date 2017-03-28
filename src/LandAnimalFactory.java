
public class LandAnimalFactory extends AnimalFactory {

	@Override
	public Animal getanimal(String animalType) {
		Animal animal=null;
		if("dog".equals(animalType))
		{
			animal=new Dog();
		}
		else 
		{
			animal=new Cat();
		}
		return animal;
	}

}
