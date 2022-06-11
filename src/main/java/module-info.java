module com.example.assignmm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.example.assignmm to javafx.fxml;
    exports com.example.assignmm;
}