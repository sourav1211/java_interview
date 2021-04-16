package Polimorphism.CompileTime;

public class Customer {
    private String name;
    private String fatherName;
    private String customerCode;

    public Customer(String customerCode){
        this.customerCode=customerCode;
    }
    public Customer(String name,String fatherName){
        this.name=name;
        this.fatherName=fatherName;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getCustomerCode() {
        return customerCode;
    }
}
