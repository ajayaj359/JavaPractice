package TimePassPrograms;



class ExceptionExpl extends RuntimeException{
	
	ExceptionExpl(String msg){
		super(msg);
	}
}


public class StaticClass {

	public static void main(String[] args) {
		int i=18;
		int j=0;
		int sum=0;
		try {
			sum=i/j;
			if(j==0)
				throw new ExceptionExpl("here will get on that Exception");
			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
