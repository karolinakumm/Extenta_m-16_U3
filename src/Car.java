
public class Car {
	private String regNbr;
	private String brand;
	private Owner owner; // denna definieras f�r att 
	
	public void setRegNbr(String nr) {
		regNbr = nr;
	}
	public String getRegNbr() {
		return regNbr;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setOwner(Owner o) {
		owner = o;
	}
	public String getOwner() {
		return owner;
	}
}
