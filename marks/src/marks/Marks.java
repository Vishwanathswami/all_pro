package marks;

public class Marks {
	int maths;
	int physics;
	int chemistry;
	
	public static void main(String[] args) {
		Marks raju = new Marks();
		raju.maths = 75;
		raju.physics = 80;
		raju.chemistry = 65;
		
		Marks avdhut = new Marks();
		avdhut.maths = 72;
		avdhut.physics = 68;
		avdhut.chemistry = 80;
		
		Marks joy = new Marks();
		joy.maths = 55;
		joy.physics = 88;
		joy.chemistry = 48;
		
		System.out.println("marks of raju = " +raju.maths);
		System.out.println("marks of raju = " +raju.physics);
		System.out.println("marks of raju = " +raju.chemistry);
		System.out.println("marks of avdhut = " +avdhut.maths);
		System.out.println("marks of avdhut = " +avdhut.physics);
		System.out.println("marks of avdhut = " +avdhut.chemistry);
		System.out.println("marks of joy = " +joy.maths);
		System.out.println("marks of joy = " +joy.physics);
		System.out.println("marks of joy = " +joy.chemistry);
		
	}

}
