import java.util.*;

public class HeadDepartment implements Department {
    private List<Department> childDepartment = new ArrayList<>(); // Initialize the list

    @Override
    public void printDepartmentName() {
        System.out.println("Head Department:");
        childDepartment.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartment.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartment.remove(department);
    }
}
