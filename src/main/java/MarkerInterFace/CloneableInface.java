package MarkerInterFace;

public class CloneableInface implements Cloneable{
	
	private String love;
	private int happy;
	private String understanding;
	
	public CloneableInface(String love, int happy, String understanding) {
		super();
		this.love = love;
		this.happy = happy;
		this.understanding = understanding;
	}
	
	public void printe() {
		
		System.out.println("love :"+love);
		System.out.println("happy :"+happy);
		System.out.println("understanding :"+understanding);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneableInface ci=new CloneableInface("patince", 1230, "acceptance");
		ci.printe();
		
		System.out.println("---------------------------------------------------------------");
		CloneableInface ci1=(CloneableInface) ci.clone();
		ci1.printe();
		
	}
	
	

}
