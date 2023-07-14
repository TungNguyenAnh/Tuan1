package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    protected void onHelloButtonClick() {
        RadioButton selected = (RadioButton) toggleGroup.getSelectedToggle();

        System.out.println(selected.getText());
    }
}

