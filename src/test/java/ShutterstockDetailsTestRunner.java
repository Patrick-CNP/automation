import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class ShutterstockDetailsTestRunner {

    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(ShutterstockDetailsTest.class, ShutterstockDetailsParametrizedTest.class);

        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.print(result.wasSuccessful());
    }

}