package com.example.bt1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField kg;

    @FXML
    TextField meter;

    @FXML
    protected void caculateBMI() {
        double nang;
        double cao;
        String ketQua;

        double bmi = Double.parseDouble(kg.getText()) / (Double.parseDouble(meter.getText()) * Double.parseDouble(meter.getText()));

            if (bmi < 18) {
            ketQua = "Bạn là người gầy!";
        } else if (bmi <= 24.9) {
            ketQua = "Bạn là người bình thường";
        } else if (bmi <= 29.9) {
            ketQua = "Bạn bị béo phì độ I";
        } else if (bmi <= 34.9) {
            ketQua = "Bạn bị béo phì độ II";
        } else {
            ketQua = "Bạn bị béo phì độ III";
        }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("bmi la: " + bmi + ketQua);
        alert.show();
    }

}