module com.example.logikundberechenbarkeitpraktika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logikundberechenbarkeitpraktika to javafx.fxml;
    exports com.example.logikundberechenbarkeitpraktika;
}