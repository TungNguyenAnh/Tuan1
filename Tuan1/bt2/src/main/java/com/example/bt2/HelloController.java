package com.example.bt2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField dollar;

    @FXML
    protected void convertMoney() {
        double vietnamdong = 23000;
        double convert = Double.parseDouble(dollar.getText()) * vietnamdong;
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("so tien sau chuyen doi la: " + convert);
        alert.show();
    }
}

