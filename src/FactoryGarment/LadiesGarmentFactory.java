package FactoryGarment;

public class LadiesGarmentFactory extends GarmentFactory {

	@Override
	public Garment getgarment(String garmentType) {
		// TODO Auto-generated method stub
		Garment garments=null;
		if("saree".equals(garmentType))
		{
			garments=new Saree();
		}
		else if("kurti".equals(garmentType))
		{
			garments=new Kurti();
		}
		else
		{
			garments=new Dress();
		}
		return garments;
	}

}
