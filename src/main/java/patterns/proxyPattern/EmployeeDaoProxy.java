package patterns.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    private final EmployeeDao employeeDao;

    public EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDao.create(client, employee);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        if (client.equalsIgnoreCase("ADMIN")) {
            employeeDao.delete(client, id);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void get(String client, int id) throws Exception {
        if (client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")) {
            employeeDao.get(client, id);
            return;
        }

        throw new Exception("Access Denied");
    }
}
