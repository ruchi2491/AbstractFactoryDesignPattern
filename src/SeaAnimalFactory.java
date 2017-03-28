
public class SeaAnimalFactory extends AnimalFactory {

	@Override
	public Animal getanimal(String animalType) {
		// TODO Auto-generated method stub
		Animal animal=null;
		if("shark".equals(animalType))
		{
			animal=new Shark();
		}
		else 
		{
			animal=new Octopus();
		}
		return animal;
	}

}
