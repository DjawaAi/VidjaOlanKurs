import static java.lang.Math.abs;

public class Main {

    public static void printDataOfAllEmployees(Employee[] employee ) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static int totalSalary(Employee[] employee) {
        int totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            totalSalary += employee[i].getSalary();
        }
        return totalSalary;
    }

    public static int idEmployeeWithMinZP(Employee[] employee) {
        int absoluteMinimum = 1_000_000;
        int idEmployeeWithMinZP = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < absoluteMinimum) {
                absoluteMinimum = employee[i].getSalary();
                idEmployeeWithMinZP = employee[i].getId();
            }
        }
        return idEmployeeWithMinZP;
    }

    public static int idEmployeeWithMaxZP(Employee[] employee) {
        int absoluteMax = 1_000;
        int idEmployeeWithMaxZP = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > absoluteMax) {
                absoluteMax = employee[i].getSalary();
                idEmployeeWithMaxZP = employee[i].getId();
            }
        }
        return idEmployeeWithMaxZP;
    }



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        FillingArray.fillingArray(employees);
        printDataOfAllEmployees(employees);
        System.out.println();
        System.out.println("Сумму затрат на ЗП в месяц равна: " + totalSalary(employees));

        int id = idEmployeeWithMinZP(employees);
        System.out.println("Сотрудника с минимальной ЗП: " + employees[id]);

        id = idEmployeeWithMaxZP(employees);
        System.out.println("Cотрудника с максимальной ЗП: " + employees[id]);

        int averageMonthlySalary = totalSalary(employees) / employees.length;
        System.out.println("среднее значение зарплат: " + averageMonthlySalary);


    }
}
