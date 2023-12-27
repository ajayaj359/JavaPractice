package RactivePrograms;

public class Address implements Comparable<Address> {
	
	private String pleacName;
	private int pinCode;
	
	public Address(String pleacName, int pinCode) {
		super();
		this.pleacName = pleacName;
		this.pinCode = pinCode;
	}
	public String getPleacName() {
		return pleacName;
	}
	public void setPleacName(String pleacName) {
		this.pleacName = pleacName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [pleacName=" + pleacName + ", pinCode=" + pinCode + "]";
	}
	
	
	@Override
	public int compareTo(Address o) {
		
		return this.getPinCode()-o.getPinCode();
	}
	

}
