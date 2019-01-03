import java.util.ArrayList;

public class OwnerRegister {
	private ArrayList<Owner> owners = new ArrayList<Owner>();

	public ArrayList<Owner> getOwners() {
		return owners;
	}

	public void setOwners(ArrayList<Owner> owners) {
		this.owners = owners;
	}

	public void add(Owner k) {
		owners.add(k);
	}

	public Car findOwner(String nr) {
		for (Owner o : owners) {
			if (getNbr().equals(nr)) {
				return o;
			}
		}
		return null;
	}

	public void printCars(String ownerNbr) {
		Owner tmp = find(ownerNbr);
		if (tmp != null) {
			for (Car c : tmp.getCars()) {
				System.out.println(c.getRegNbr() + " " + c.getBrand());
			}
		}
	}

	private Owner find(String ownerNbr) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getOwnerCarBrand(String ownerNbr, String regNbr) {
		Owner o = this.find(ownerNbr);
		if (o != null) { // om o har ett värde har vi hittat en ägare
			Car c = o.find(regNbr);
			if (c != null) { // om c har ett värde har vi hittat en bil
				return c.getBrand();
			}
		}
		return null;
	}

}
