package onealv.helpers;

import onealv.models.Customer;
import onealv.models.Product;

public class SetUp {

    public Product product;
    public Customer customer;

    public void setUpProduct(){
        product = new Product();
        product.setProductName("Blenderi");
        product.setProductBrand("Bosch");
    }

    public void setUpCustomer(){

        customer = new Customer();
        customer.setFirstName("Svetlana");
        customer.setLastName("Karpik");
        customer.seteMail("sveta@gmail.com");
        customer.setPhoneNumber("23456456");
        customer.setReceiveNews("Uz e-pastu");
    }
}
