package variables;

public class VariablesChecking {
	static int vishwanath = 1;
	int nagnath = 2;
	static int somnath = 3;
	int di = 4;
	static int x = vishwanath+somnath;
	
	public static void vish() {
		System.out.println("hello=" +vishwanath);
		VariablesChecking hh = new VariablesChecking();
		System.out.println("hii=" +hh.nagnath);
		System.out.println("hmmm=" +somnath);
		System.out.println("ho ka=" +hh.di);
		System.out.println(x);
		VariablesChecking aaaa = new VariablesChecking();
		aaaa.hello();
		
	}
	
	public void hello() {
		System.out.println(vishwanath);
		System.out.println(nagnath);
		System.out.println(somnath);
		System.out.println(di);
		System.out.println(x);
		vish();
	}
	
	public static void main(String [] args) {
		
		vish();
		
		VariablesChecking form = new VariablesChecking();
		form.hello();
		
	}
}
