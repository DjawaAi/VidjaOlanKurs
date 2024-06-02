public class Main {
    public static void main(String[] args) {
        FIO[] fio = new FIO[10];
        fio[0] = new FIO("ff", "dd", "gff");
        fio[1] = new FIO("ee", "aa", "rg");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee(fio[0],3, 100000);
        employees[1] = new Employee(fio[1], 1,120000);
        employees[2] = new Employee(new FIO("as", "wq", "er"), 4, 140000);
        System.out.println(employees[0].getId());
        System.out.println(employees[2].getFullName());
        System.out.println(employees[1].getId());
        System.out.println(employees[2].getId());
        System.out.println(employees[0]);

    }
}