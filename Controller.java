package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class Controller implements Initializable {
    @FXML
    TextField txt;
    @FXML
    Label msg;
    @FXML
    Button start;
    @FXML
    Label msg2;
    int i = (int) (Math.random() * 100);

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void what(ActionEvent event) throws IOException {
        for(int s =0;s<10;s++) {

                if (event.getSource().equals(txt)) {
                    if (Integer.parseInt(txt.getText()) == i)
                        msg.setText("You've found your number ");

                      else
                    if (Integer.parseInt(txt.getText()) < i){
                        msg.setText("i am too huge ");
                        txt.setText("");}
                            else
                    msg.setText("i am too small");
                    txt.setText("");
                    if (s>10) {
                          msg.setText("You've depassed the limits  \n if you wanna replay click  " + start);
                    }

                }
        }


    }



}