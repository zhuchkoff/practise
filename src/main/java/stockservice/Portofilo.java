package stockservice;

import java.util.List;

public class Portofilo {
  private StockService stockService;
  private List<Stock> stockList;

  public StockService getStockService() {
    return stockService;
  }

  void setStockService(StockService stockService) {
    this.stockService = stockService;
  }

  public List<Stock> getStockList() {
    return stockList;
  }

  void setStockList(List<Stock> stockList) {
    this.stockList = stockList;
  }

  double getMarketValue() {
    double result = 0.0F;
    for (Stock stock : stockList) {
      result += stockService.getPrice(stock) * stock.getAmount();
    }
    return result;
  }
}
