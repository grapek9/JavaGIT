package sample;

import java.io.IOException;

public class Controller extends Tester{
    public void runTest()throws IOException {
        System.out.println("It's working");
        Tester run=new Tester();
        run.RunTests();
    }
}
