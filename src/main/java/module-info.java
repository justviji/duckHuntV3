module com.example.duckhuntv3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.duckhuntv3 to javafx.fxml;
    exports com.example.duckhuntv3;
}