package Home;

public class Stock {
  private String stockId;
  private String name;
  private int amount;

  Stock(String stockId, String name, int amount) {
    this.stockId = stockId;
    this.name = name;
    this.amount = amount;
  }

  public String getStockId() {
    return stockId;
  }

  public String getName() {
    return name;
  }

  int getAmount() {
    return amount;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }
}
