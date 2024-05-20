package Q4;

public class test {

	public static Employee linearSearchByID(Employee [] earr, int n, int key) {
		for(int i = 0; i<earr.length; i++) {
			if(key == earr[i].empid) {
				return earr[i];
			}
		}
		return null;
	}
	
	public static Employee linearSearchByName(Employee [] earr, int n, String key) {
		for(int i = 0; i<earr.length; i++) {
			if(key == earr[i].name) {
				return earr[i];
			}
		}
		return null;
	}
	
	public static Employee linearSearchBySal(Employee [] earr, int n, double key) {
		for(int i = 0; i<earr.length; i++) {
			if(key == earr[i].salary) {
				return earr[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {

		Employee earr[] = { 
				new Employee(1, "Sanky", 90000), 
				new Employee(2, "Amit", 80000),
				new Employee(3, "Abhi", 70000), 
				new Employee(4, "Suraj", 60000), 
				new Employee(5, "Rohit", 50000), 
		};
		
		Employee searchByID = linearSearchByID(earr, earr.length, 4);
		System.out.println("Searching By Id - 4 : "+searchByID.toString());
		
		Employee searchByName = linearSearchByName(earr, earr.length, "Sanky");	
		System.out.println("Searching By Name - Sanky : "+searchByName.toString());
		
		Employee searchBySal = linearSearchBySal(earr, earr.length, 50000);	
		System.out.println("Searching By Salary - 50000 : "+searchBySal.toString());

	}
	
};



