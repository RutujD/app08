package app08.com.test;

public class InputEmployee03 {

	public static void main(String[] args) {
		
	        Employee employee = InputEmployee2.getInput();
	        displayEmployeeInfo(employee);
	    }

	    public static void displayEmployeeInfo(Employee employee) {
	        System.out.println("社員情報:");
	        System.out.println("社員番号: " + employee.getEmployeeNumber());
	        System.out.println("名前: " + employee.getLastName() + " " + employee.getFirstName());
	        System.out.println("性別: " + (employee.getGender().equals("1") ? "男性" : "女性"));
	    
	}
}


