package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student> map;

	public UniversityDatabase() {
		this.map = new HashMap<String, Student>();
	}
	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
	}

	public int getStudentCount() {
		return map.size();
	}

	public String lookupFullName(String accountName) {
		if (map.get(accountName)==null) {
			return null;
		}
		else {
		Student s = map.get(accountName);
		return s.getFullName();
		}
	}

	public double getTotalBearBucks() {
		double sum = 0;
		for (String accountName: map.keySet()) { 
			Student s = map.get(accountName);
			sum+=s.getBearBucksBalance();
		}
		return sum;
	}
}
