module com.example.farmingdale_trend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.farmingdale_trend to javafx.fxml;
    exports com.example.farmingdale_trend;
}