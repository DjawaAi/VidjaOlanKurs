import static java.lang.Math.abs;

public class FillingArray {
    static void fillingArray(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee(new FIO("Z" + i, "A" + i, "F" + i), abs(1 + i / 2), 50000 * (10 + i) / 5);
        }
    }
}
