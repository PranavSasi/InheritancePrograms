package inheritanceProg;

public class MultiChild1 extends MultiChild{
	public void cat(){
		System.out.println("Jumping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild1 obj=new MultiChild1();
		obj.cat();
		obj.dog();
		obj.animal();
	}

}
