package main;

public class PlusOperator implements CalcOperator {
  @Override
  public double execute(double num1, double num2) {
    return num1 + num2;
  }
}
