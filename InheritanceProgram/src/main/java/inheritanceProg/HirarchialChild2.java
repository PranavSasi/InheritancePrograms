package inheritanceProg;

public class HirarchialChild2 extends HirarchialParant {
	public void cat(){
		System.out.println("Jumping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HirarchialChild2 obj=new HirarchialChild2();
		obj.cat();
		obj.animal();
		HirarchialChild obj2=new HirarchialChild();
		obj2.dog();
		
	}

}
