package Package1;

public class AnotherChange {

	public static void main(String[] args) {
		System.out.println("this is a new change");

	}
	
	//This change should not be present in master branch
	public String NewFunctionFromDevelopBranch() {
		return "This is a new function from Develop branch";
		
	}
	

}
