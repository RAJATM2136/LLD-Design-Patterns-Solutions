package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, Employee obj) {
        System.out.println("Create Employee");
    }

    @Override
    public void delete(String client, int EmployeeID) {
        System.out.println("Delete Employee");
    }

    @Override
    public void get(String client, int EmployeeID) {
        System.out.println("Get Employee");
    }
}
