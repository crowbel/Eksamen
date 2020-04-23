package org.example.Gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.example.App;

public class AdminController {
    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("user");
    }
}