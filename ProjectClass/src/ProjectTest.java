
public class ProjectTest {
	public static void main(String[] args) {
		
		Project myProject = new Project("Real Estate", "A Python and Django based project to post and view property listings...");
		
//		project.setName("Akshay");
		System.out.print(myProject.getName());
		System.out.print(myProject.getDescription());
		
		System.out.print(myProject.elevatorPitch("Real Estate", "A Python and Django based project to post and view property listings..."));
		
		myProject.setInitialCost(9.3);
		System.out.print(myProject.getInitialCost());
		
		System.out.print("\n\n");
		System.out.print(myProject.getName()  + "(" + myProject.getInitialCost() + ")" + " : " + myProject.getDescription());
	}
}
