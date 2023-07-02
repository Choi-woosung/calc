package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
  @Test
  void calcTest(){
    // 계산기 세팅
    Calc instance = Calc.getInstance();
    instance.setCalc(new PlusOperator());

    // 계산
    double result = instance.operate(1, 1);

    // 검증
    Assertions.assertEquals(3, result);
  }
}
