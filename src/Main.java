import static java.lang.Math.abs;

public class Main {

    public static void printDataOfAllEmployees(Employee[] employee ) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static int sumTotalSalary(Employee[] employee) {
        int totalSalary = 0;
        for (Employee value : employee) {
            totalSalary += value.getSalary();
        }
        return totalSalary;
    }

    public static int identifyEmployeeWithMinZP(Employee[] employee) {
        int absoluteMinimum = 1_000_000;
        int idEmployeeMinZP = 0;
        for (Employee value : employee) {
            if (value.getSalary() < absoluteMinimum) {
                absoluteMinimum = value.getSalary();
                idEmployeeMinZP = value.getId();
            }
        }
        return idEmployeeMinZP;
    }

    public static int identifyEmployeeWithMaxZP(Employee[] employee) {
        int absoluteMax = 1_000;
        int idEmployeeMaxZP = 0;
        for (Employee value : employee) {
            if (value.getSalary() > absoluteMax) {
                absoluteMax = value.getSalary();
                idEmployeeMaxZP = value.getId();
            }
        }
        return idEmployeeMaxZP;
    }

    public static void printFullNameEmployees(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value.getFullName());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        FillingArray.fillingArray(employees);
        System.out.println();
        printDataOfAllEmployees(employees);
        System.out.println();
        System.out.println("Сумму затрат на ЗП в месяц равна: " + sumTotalSalary(employees));
        System.out.println();

        int id = identifyEmployeeWithMinZP(employees);
        System.out.println("Сотрудника с минимальной ЗП: " + employees[id]);
        System.out.println();

        id = identifyEmployeeWithMaxZP(employees);
        System.out.println("Cотрудника с максимальной ЗП: " + employees[id]);
        System.out.println();

        int averageMonthlySalary = sumTotalSalary(employees) / employees.length;
        System.out.println("среднее значение зарплат: " + averageMonthlySalary);
        System.out.println();

        printFullNameEmployees(employees);
    }
}
