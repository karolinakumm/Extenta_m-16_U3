
public class Testmetod {

	public static void main(String[] args) {
		OwnerRegister reg = new OwnerRegister();
		Owner o = new Owner();
		o.setNbr("Owner1");
		o.setName("Adam Behn");

		Car c = new Car();
		c.setRegNbr("ABC123");
		c.setBrand("Volvo");
		
		o.add(c);
		c.setOwner(o); 
// variabeln c kan användas igen då Car har tilldelats Owner och refererar till det istället.

		c = new Car();
		c.setRegNbr("XER066");
		c.setBrand("SAAB");
		o.add(c);
		c.setOwner(o);

		reg.add(o);

		reg.printCars(o.getNbr());

		System.out.println(reg.getOwnerCarBrand(o.getNbr(), "SAAB"));
		for (Owner oTmp : reg.getOwners()) {
			System.out.println(oTmp.getName());
// man kan skriva
//			reg.printCars(oTmp.getNbr()); 
// eller.... 
			
			for(Car c1:oTmp.getCars()) {
				System.out.println(c1.getRegNbr());
				System.out.println(c1.getBrand());
			}
		}

	}

}
