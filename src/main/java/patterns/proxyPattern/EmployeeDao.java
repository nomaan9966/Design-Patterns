package patterns.proxyPattern;

public interface EmployeeDao {

    public void create(String client, Employee employee) throws Exception;

    public void delete(String client, int id) throws Exception;

    public void get(String client, int id) throws Exception;
}
