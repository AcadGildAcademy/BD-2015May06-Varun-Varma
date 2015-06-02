
/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class EmployeeInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee varun = new Employee("Varun Verma", 'M', "CEO", "MicroSoft",
				"10/20/1989");
		varun.SetOrganisation("Microsoft", 101200);
		varun.GetDetails();
	}

}

class Employee {
	String empName;
	char empSex;
	String empJobTitle;
	String empOrg;
	String empDob; // should be Date DataType just to keep things simple

	String orgName; // Should be declared in another class
	int orgNumEmpl;

	public Employee(String empName, char empSex, String empJobTitle,
			String empOrg, String empDob) {
		this.empName = empName;
		this.empSex = empSex;
		this.empJobTitle = empJobTitle;
		this.empOrg = empOrg;
		this.empDob = empDob;
	}

	public void SetOrganisation(String orgName, int orgNumEmpl) {
		this.orgName = orgName;
		this.orgNumEmpl = orgNumEmpl;
	}

	public void GetDetails() {
		System.out.println("Details are: "+ "\n" + this.empName + "\n"
				+ this.empJobTitle + "\n" + this.empDob + "\n" + this.empOrg
				+ "\n" + this.empSex + "\n" + this.orgNumEmpl + "\n");
	}
}
