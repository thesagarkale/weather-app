module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.openmeteo;
    opens com.example.demo.openmeteo to javafx.fxml;
}