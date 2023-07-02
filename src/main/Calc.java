package main;

public class Calc {
  private static Calc instance;
  private CalcOperator calcOperator;

  private Calc(){}

  public static Calc getInstance(){
    if(instance == null){
      instance = new Calc();
    }

    return instance;
  }

  public void setCalc(CalcOperator calcOperator){
    this.calcOperator = calcOperator;
  }

  public double operate(double num1, double num2){
    return calcOperator.execute(num1, num2);
  }

}
