import java.util.Objects;

public class Employee {
    private FIO fullName;
    private int department;
    private int salary;
    public static int count = 0;
    private int id;

    public Employee(FIO fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public FIO getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department1) {
        department = department1;
    }

    public void setSalary(int salary1) {
        salary = salary1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Полное имя: " + fullName +
                ", Отдел: " + department +
                ", Зароботная плата: " + salary +
                ", id=" + id +
                '}';
    }
}

