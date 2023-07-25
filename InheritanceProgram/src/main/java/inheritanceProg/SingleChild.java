package inheritanceProg;

public class SingleChild extends SingleParant {
	public void dog(){
		System.out.println("Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.dog();
		obj.animal();
	}

}
