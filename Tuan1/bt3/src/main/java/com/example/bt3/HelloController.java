package com.example.bt3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField so1;
//    @FXML
//    TextField tru;
//    @FXML
//    TextField nhan;
//    @FXML
//    TextField chia;
    @FXML
    TextField so2;

    @FXML
    protected void cong() {
        int ketQua = Integer.parseInt(so1.getText()) + Integer.parseInt(so2.getText());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Kết quả là:" + ketQua);
        alert.show();
    }

    @FXML
    protected void tru() {
        int ketQua = Integer.parseInt(so1.getText()) - Integer.parseInt(so2.getText());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Kết quả là:" + ketQua);
        alert.show();
    }

    @FXML
    protected void nhan() {
        int ketQua = Integer.parseInt(so1.getText()) * Integer.parseInt(so2.getText());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Kết quả là:" + ketQua);
        alert.show();
    }

    @FXML
    protected void chia() {
        int ketQua = Integer.parseInt(so1.getText()) / Integer.parseInt(so2.getText());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Kết quả là:" + ketQua);
        alert.show();
    }
}