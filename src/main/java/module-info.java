module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens application to javafx.fxml;
    exports application;
    exports gui;
    exports model.entities;
    opens gui to javafx.fxml;
}