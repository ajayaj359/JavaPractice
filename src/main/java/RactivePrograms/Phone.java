package RactivePrograms;

public class Phone {
	
	private String mode;
	private long price;
	
	
	
	
	public Phone(String mode, long price) {
		super();
		this.mode = mode;
		this.price = price;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [mode=" + mode + ", price=" + price + "]";
	}
	
	

}
