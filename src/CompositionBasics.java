//CompositionBasics.java
public class CompositionBasics {
	public static void main(String[] args) {
		Person bobby = new Person();
		System.out.println(bobby.getSalary());
		
		bobby.getJob().setRole("Gopher");
		bobby.getJob().setId(99);
		bobby.getEducation().addSchool("BES");
		bobby.getEducation().addSchool("BES");
		bobby.getEducation().addSchool("JWMS");
		bobby.getEducation().addSchool("RMHS");
		bobby.getEducation().addSchool("UMCP");
		bobby.getEducation().addSchool("MC");
		bobby.getEducation().addSchool("IPS");
		bobby.getEducation().addSchool("EX1");
		bobby.getEducation().addSchool("EX2");
		bobby.getEducation().addSchool("EX3");
		
		System.out.println(bobby.toString());
		
		//testing to make sure addSchool maintains maximum of 10 schools
		bobby.getEducation().addSchool("EX4");
		bobby.getEducation().addSchool("EX5");
		bobby.getEducation().addSchool("EX6");
		
		System.out.println(bobby.toString());
	}
}
