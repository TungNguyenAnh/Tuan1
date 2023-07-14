module com.example.bt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bt1 to javafx.fxml;
    exports com.example.bt1;
}