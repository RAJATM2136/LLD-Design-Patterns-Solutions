package ProxyDesignPattern;

public interface EmployeeDao {
    public static final String ADMIN="admin";

    public static final String USER="user";

    public void create(String client,Employee obj) throws Exception;  //only admin has access

    public void delete(String client,int EmployeeID) throws Exception;  //admin

    public void get(String client,int EmployeeID) throws Exception; //admin and user
}
