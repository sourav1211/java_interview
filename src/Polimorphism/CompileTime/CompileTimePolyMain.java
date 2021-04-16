package Polimorphism.CompileTime;

public class CompileTimePolyMain {

    public static void main(String[] args) {
        Customer customer=new Customer("1122-ABC");
        System.out.println(customer.getCustomerCode());

        Customer customer1=new Customer("Sourav","Mr.Abc");
        System.out.println("Customer Name: "+customer1.getName()+", Fathers Name: "+customer1.getFatherName());
    }
}
