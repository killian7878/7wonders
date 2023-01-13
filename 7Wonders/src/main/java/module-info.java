module com.example.__7wonders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.__7wonders to javafx.fxml;
    exports com.example.__7wonders;
    exports HHHHH;
    opens HHHHH to javafx.fxml;
}