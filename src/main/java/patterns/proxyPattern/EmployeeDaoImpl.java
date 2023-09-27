package patterns.proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee employee) {
        System.out.println("Employee created");
    }

    @Override
    public void delete(String client, int id) {
        System.out.println("Employee deleted");
    }

    @Override
    public void get(String client, int id) {
        System.out.println("Employee fetched");
    }
}
