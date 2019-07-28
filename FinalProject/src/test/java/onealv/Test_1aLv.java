package onealv;

import onealv.helpers.Common;
import onealv.models.Customer;
import onealv.models.Product;
import onealv.pages.CartPage;
import onealv.pages.HomePage;
import onealv.pages.OrderPage;
import onealv.pages.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test_1aLv {

    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();
    private OrderPage orderPage = new OrderPage();
    private CartPage cartPage = new CartPage();
    private Common common = new Common();

    Product product;
    Customer customer;

    @Before

    public void setUpProduct(){
        product = new Product();
        product.setProductName("Blenderi");
        product.setProductBrand("Bosch");
    }
    @Before
    public void setUpCustomer(){

        customer = new Customer();
        customer.setFirstName("Svetlana");
        customer.setLastName("Karpik");
        customer.seteMail("sveta@gmail.com");
        customer.setPhoneNumber("23456456");
        customer.setReceiveNews("Uz e-pastu");
    }

    @Test
    public void Test_One_A_Lv() {
        openBrowser();
        searchProduct();
        orderProduct();
        compareData();
    }

    @After
    public void CloseBrowser(){
        orderPage.stopBrowser();
    }

        private void openBrowser () {
            homePage.startBrowser();
            homePage.CloseBanner();
        }

        private void searchProduct () {
            searchPage.closeBanner();
            searchPage.SearchProduct(product.getProductName());
            searchPage.setRatio();
            searchPage.SearchBrand(product.getProductBrand());
            searchPage.selectProduct();
        }

        private void orderProduct () {
            cartPage.NavigateToCart();
            orderPage.addCustomerName(customer.getFirstName(), customer.getLastName());
            orderPage.addCustomerContacts(customer.geteMail(), customer.getPhoneNumber());
            orderPage.addCustomerAddInfo(customer.getReceiveNews());
            orderPage.selectDelivery();
            orderPage.selectPaymentType();
            orderPage.getProductData();
        }

        private void compareData () {
            Assert.assertEquals(orderPage.prodcutPrice, cartPage.firstProductPrice);
            Assert.assertEquals(orderPage.productName, cartPage.firstProductName);
        }


}
