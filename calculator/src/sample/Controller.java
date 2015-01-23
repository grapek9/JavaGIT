package sample;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.fxml.FXML;

import java.io.IOException;

public class Controller{

    @FXML TextArea input;
    public void no0()throws IOException {
        input.appendText("0");
    }
    public void no1()throws IOException {
        input.appendText("1");
    }
    public void no2()throws IOException {
        input.appendText("2");
    }
    public void no3()throws IOException {
        input.appendText("3");
    }
    public void no4()throws IOException {
        input.appendText("4");
    }
    public void no5()throws IOException {
        input.appendText("5");
    }
    public void no6()throws IOException {
        input.appendText("6");
    }
    public void no7()throws IOException {
        input.appendText("7");
    }
    public void no8()throws IOException {
        input.appendText("8");
    }
    public void no9()throws IOException {
        input.appendText("9");
    }
    public void btnPlus()throws IOException {
        input.appendText("+");
    }
    public void btnMinus()throws IOException {
        input.appendText("-");
    }
    public void btnMultiply()throws IOException {
        input.appendText("*");
    }
    public void btnDivide()throws IOException {
        input.appendText("/");
    }
    public void btnDot()throws IOException {
        input.appendText(".");
    }
    public void btnResult()throws IOException {
        input.appendText("RESULT");
    }

    public void runTest()throws IOException {
        System.out.println("It's working");
        Tester run=new Tester();
        run.RunTests();
    }

}
