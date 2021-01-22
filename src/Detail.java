public class Detail extends Employee {
    public void detailEmployee(){
        System.out.println("Detail of Employee");
        System.out.println("Employee ID\t: " + getEmployeeID());
        System.out.println("Name\t\t: " + getName());
        System.out.println("Alamat\t\t: " + getAddress());
    }
}
