package main;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class Main {
  public static void main(String[] args) {
    // 숫자 2개를 받는다
    double num1 = 1;
    double num2 = 1;

    // 계산기 인스턴스를 생성한다.
    Calc instance = Calc.getInstance();
    instance.setCalc(new PlusOperator());
    System.out.println(instance.operate(num1, num2));

    instance.setCalc(new MinusOperator());
    System.out.println(instance.operate(num1, num2));
  }
}