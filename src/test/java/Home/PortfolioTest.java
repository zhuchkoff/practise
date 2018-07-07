package Home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PortfolioTest {

  private Portofilo portofilo;
  private StockService stockService;
  private Stock stockGoogle;
  private Stock stockMicrosoft;

  public static void main(String[] args) {
    PortfolioTest portfolioTest = new PortfolioTest();
    portfolioTest.setUp();
    boolean testPassed = portfolioTest.testMarketValue();
    System.out.println(testPassed ? " passed" : " failed");
  }

  public void setUp() {
    portofilo = new Portofilo();
    stockGoogle = new Stock(  "1", "Google", 10);
    stockMicrosoft = new Stock(  "2", "Microsoft", 180);
    List<Stock> stockList = new ArrayList<>();
    Collections.addAll(stockList, stockGoogle, stockMicrosoft);
    portofilo.setStockList(stockList);
    stockService = mock(StockService.class);
    portofilo.setStockService(stockService);
  }

  private boolean testMarketValue() {
    double googleStockPrice = 10.0;
    double microsoftStockPrice = 234.0;

    when(stockService.getPrice(stockGoogle)).thenReturn(googleStockPrice);
    when(stockService.getPrice(stockMicrosoft)).thenReturn(microsoftStockPrice);

    double expectedMarketValue = stockGoogle.getAmount() * googleStockPrice + stockMicrosoft.getAmount() * microsoftStockPrice;

    return expectedMarketValue == portofilo.getMarketValue();
  }
}