package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleTest {
   static Logger logger = LoggerFactory.getLogger(TriangleTest.class);


    @Test
  void firstTest() throws MyException {

        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()->triangle.square(-8,5,6));

 }


    @Test
    void secondTest() throws MyException{
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()->triangle.square(100,5,6));

 }

    @Test
    void thirdTest()throws MyException{
        Triangle triangle = new Triangle();
        Assertions.assertEquals(10,triangle.square(5,5,5));
    }

    @ParameterizedTest
    @CsvSource({"4,5,6,9","10,20,25,94"})
    void fourthTest(int a,int b,int c,int res)throws MyException{
        Triangle triangle = new Triangle();
        Assertions.assertEquals(res,triangle.square(a, b, c));
    }
}


