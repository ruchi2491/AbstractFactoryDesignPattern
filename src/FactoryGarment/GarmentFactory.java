package FactoryGarment;

public abstract class GarmentFactory {

	public abstract Garment getgarment(String garmentType);
	
	public static GarmentFactory getGarmentFactory(String factoryType)
	{
		GarmentFactory garmentfactory=null;
		if("ladies".equals(factoryType))
		{
			garmentfactory=new LadiesGarmentFactory();
		}
		else
		{
			garmentfactory=new GentsGarmentFactory();
		}
		return garmentfactory;
		
	}
	
}
