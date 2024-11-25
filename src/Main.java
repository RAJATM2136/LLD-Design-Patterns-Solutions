import MainClass.GoodsVehicle;
import MainClass.OffRoadVehicle;
import MainClass.Vehicle;
import ProxyDesignPattern.Employee;
import ProxyDesignPattern.EmployeeDao;
import ProxyDesignPattern.EmployeeDaoProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Employee employee=new Employee();
        EmployeeDao employeeDao=new EmployeeDaoProxy();
        employeeDao.get("fe",employee.EmployeeID);
    }
}