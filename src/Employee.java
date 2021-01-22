class Employee{
    private String employeeID;
    private String name;
    private String address;

    public void setEmployeeID(String EmployeeID){
        this.employeeID = EmployeeID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}