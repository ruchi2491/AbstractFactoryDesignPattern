package FactoryGarment;

public class Client {

	public static void main(String[] args) {
		
		 Garment garments=null;
		GarmentFactory garmentfactory=null;
		String fabric=null;
		
		//get factory object by passing the factory type
		garmentfactory=GarmentFactory.getGarmentFactory("ladies");
		
		System.out.println("Garment factory type is----"+garmentfactory.getClass().getName());
		 
		garments=garmentfactory.getgarment("saree");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
		garments=garmentfactory.getgarment("kurti");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
		
		garments=garmentfactory.getgarment("dress");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
		
		System.out.println("...............................................................................................................");
		
		garmentfactory=GarmentFactory.getGarmentFactory("gents");
		
		System.out.println("Garment factory type is----"+garmentfactory.getClass().getName());
		 
		garments=garmentfactory.getgarment("shirt");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
		
		garments=garmentfactory.getgarment("trouser");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
		
		garments=garmentfactory.getgarment("jeans");
		fabric=garments.fabrictype();
		System.out.println(fabric);
		
			}
}
