package org.example.Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.Exceptions.InvalidLoginException;
import org.example.Gui.Dialogs;
import org.example.User.SuperUser;
import org.example.User.VerifyUser;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField brukernavn;

    @FXML
    private PasswordField passord;

    @FXML
    void avbrytInnlogging(ActionEvent event) throws IOException {
        App.setRoot("user");

    }

    @FXML
    void loggInn(ActionEvent event) throws IOException, InvalidLoginException {
        SuperUser su = new SuperUser("admin", "admin");

        //TODO flytte dette til egen klasse - VerifyUser
        try {
            VerifyUser.verifyUser(brukernavn.getText(), passord.getText());
        } catch (InvalidLoginException e) {
            Dialogs.showErrorDialog(e.getMessage());
            return;
        }
        if (passord.getText().equals(su.getPassord())) {
            App.setRoot("admin");
        } else {
            Dialogs.showErrorDialog("Feil passord");
        }
    }

}
