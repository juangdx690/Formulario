module com.example.pruebagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebagit to javafx.fxml;
    exports com.example.pruebagit;
}