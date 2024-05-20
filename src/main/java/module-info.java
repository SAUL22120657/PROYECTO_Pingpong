module com.singleton.pingpong2_0 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.singleton.pingpong2_0 to javafx.fxml;
    exports com.singleton.pingpong2_0;
}