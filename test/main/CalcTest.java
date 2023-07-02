package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
  @Test
  void calcTest(){
    // given
    // 빈 설정
    Calc instance = Calc.getInstance();
    instance.setCalc(new PlusOperator());

    // when
    // 검증 로직 작성
    double result = instance.operate(1, 1);

    // then
    Assertions.assertEquals(3, result);
  }
}
