package ProxyDesignPattern;

import java.util.Objects;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;
    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client==EmployeeDao.ADMIN){
            employeeDao.create("ADMIN",obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void delete(String client, int EmployeeID) throws Exception {
        if(client==EmployeeDao.ADMIN){
            employeeDao.delete("ADMIN",12);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void get(String client, int EmployeeID) throws Exception {
        if(client==EmployeeDao.ADMIN||client==EmployeeDao.USER){
            employeeDao.get("ADMIN",12);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

}
