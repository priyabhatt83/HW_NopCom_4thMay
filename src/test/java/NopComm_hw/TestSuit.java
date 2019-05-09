package NopComm_hw;

import org.junit.Test;

public class TestSuit extends BaseTest{
    Registration_page_1 Registration_page_1 = new Registration_page_1();
    ChangeCurrencyPage changeCurrenyPage = new ChangeCurrencyPage();
    SortItemsHighToLow sortItemsHighToLow = new SortItemsHighToLow();
@Test
    public void Registration() {
    Registration_page_1.registration();
    }
@Test
    public void PriceCurrency(){

    //error nonstatic method priceCurrency
      //  ChangeCurrencyPage.priceCurrency();

    }
@Test
    public void priceHighToLow(){

    //error nomstatic method priceHighToLow
    //SortItemsHighToLow.priceHighToLow();



    }
    }

