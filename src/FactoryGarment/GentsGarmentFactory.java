package FactoryGarment;

public class GentsGarmentFactory extends GarmentFactory{

	@Override
	public Garment getgarment(String garmentType) {
		// TODO Auto-generated method stub
		Garment garments=null;
		if("shirt".equals(garmentType))
		{
			garments=new Shirt();
		}
		else if("jeans".equals(garmentType))
		{
			garments=new Jeans();
		}
		else
		{
			garments=new Trouser();
		}
		
		return garments;
	}

}
