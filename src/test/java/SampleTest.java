import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void test1(){
        int a = 4;
        int b = 6;
        assert a + b == 10;
    }

    @Test
    void test2(){
        int x = 8;
        assert x / 2 != 4;
    }

    @Test
    void test3(){
        Calculator cal = new Calculator();
        int result = cal.add(3, 7);
        assert result == 10;
    }

    @Test
    void test4(){
        Calculator cal = new Calculator();
        boolean result = cal.isEven(6);
        assert result == true;
    }
}
