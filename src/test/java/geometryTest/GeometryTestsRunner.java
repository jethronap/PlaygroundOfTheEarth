package geometryTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class GeometryTestsRunner {

    public Result run(String[] args){

        System.out.println("=====================================================");
        System.out.println("Running: "+ GeometryTests.class.getName()+ " tests");

        Result result = JUnitCore.runClasses(GeometryTests.class);

        if( !result.wasSuccessful()) {
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        else{
            System.out.println("All tests passed: "+ result.getRunCount());
        }

        System.out.println("Test run time: "+ result.getRunTime()+" secs");
        System.out.println("Done...");
        System.out.println("=====================================================");
        return result;
    }

    public static void main(String[] args) {

        GeometryTestsRunner runner = new GeometryTestsRunner();
        runner.run(args);
    }
}
