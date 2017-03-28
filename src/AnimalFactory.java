
public abstract class AnimalFactory {

	public abstract Animal getanimal(String animalType);
	
	public static AnimalFactory getanimalfactory(String factoryType)
	{
		AnimalFactory animalFactory=null;
		if("sea".equals(factoryType))
		{
			animalFactory=new SeaAnimalFactory();
		}
		else
		{
			animalFactory=new LandAnimalFactory();
		}
		return animalFactory;
		
	}
}
