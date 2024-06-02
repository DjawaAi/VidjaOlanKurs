public class FillingArray {
    public void fillInArray(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee(new FIO("Z"+i, "A"+i, "F"+i), 1+i, 50000 *(10+i)/10);
        }
    }
}
