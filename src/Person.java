//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	private Education education;
	public Person(){
		this.job=new Job();
		job.setSalary(1000L);
		education=new Education();
	}
	public long getSalary() {
		return job.getSalary();
	}
	
	public Job getJob()
	{
		return job;
	}
	
	public Education getEducation()
	{
		return education;
	}
	
	
	public String toString()
	{
		String returnString = job.toString() + education.toString();
		return returnString;
	}
}