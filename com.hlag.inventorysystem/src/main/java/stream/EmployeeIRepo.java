package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeIRepo {
	private List<Employee> employees = new ArrayList<>();

	Map<String, Double> filteredEmployes() {
		return employees.stream().filter(e -> e.getSalary() > 50000)
				.collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));

	}

	public void totalSalry() {
		employees.stream().filter(e -> e.getSalary() > 50000).map(Employee::getSalary).reduce(0.0, Double::sum);
	}

}
