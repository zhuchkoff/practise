package mathapp;

public class MathApp {

  private CalculatorService calculatorService;

  public void setCalculatorService(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  public double add(double firstValue, double secondValue) {
    return calculatorService.add(firstValue, secondValue);
  }

  public double sub(double firstValue, double secondValue) {
    return calculatorService.sub(firstValue, secondValue);
  }

  public double mul(double firstValue, double secondValue) {
    return calculatorService.mul(firstValue, secondValue);
  }

  public double div(double firstValue, double secondValue) {
    return calculatorService.div(firstValue, secondValue);
  }
}
