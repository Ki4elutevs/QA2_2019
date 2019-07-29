package onealv;

import onealv.helpers.Common;
import onealv.helpers.SetUp;
import onealv.pages.CartPage;
import onealv.pages.HomePage;
import onealv.pages.OrderPage;
import onealv.pages.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test_1aLv extends SetUp {

    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();
    private OrderPage orderPage = new OrderPage();
    private CartPage cartPage = new CartPage();
    private Common common = new Common();
    private SetUp setup = new SetUp();

    @Before
    public void setUpData(){
        setup.setUpProduct();
        setup.setUpCustomer();

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
        common.stopBrowser();
    }

        private void openBrowser () {
            homePage.startBrowser();
            homePage.closeBanner();
        }

        private void searchProduct () {
            searchPage.searchProduct(setup.product.getProductName());
            homePage.closeBanner();
            searchPage.setRatio();
            searchPage.searchBrand(setup.product.getProductBrand());
            searchPage.selectProduct();
        }

        private void orderProduct () {
            cartPage.navigateToCart();
            orderPage.addCustomerName(setup.customer.getFirstName(), setup.customer.getLastName());
            orderPage.addCustomerContacts(setup.customer.geteMail(), setup.customer.getPhoneNumber());
            orderPage.addCustomerAddInfo(setup.customer.getReceiveNews());
            orderPage.selectDelivery();
            orderPage.selectPaymentType();
            orderPage.getProductData();
        }

        private void compareData () {
            Assert.assertEquals(orderPage.prodcutPrice, cartPage.firstProductPrice);
            Assert.assertEquals(orderPage.productName, cartPage.firstProductName);
        }


}
