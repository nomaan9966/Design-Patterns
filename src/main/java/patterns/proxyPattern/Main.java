package patterns.proxyPattern;

public class Main {

    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());

            employeeDao.create("ADMIN",new Employee(1,"John"));
            employeeDao.get("USER",1);
            employeeDao.delete("USER",1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
