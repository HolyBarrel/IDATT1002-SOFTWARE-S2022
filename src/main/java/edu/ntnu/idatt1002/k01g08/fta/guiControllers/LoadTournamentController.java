package edu.ntnu.idatt1002.k01g08.fta.guiControllers;

import edu.ntnu.idatt1002.k01g08.fta.SceneManager;
import edu.ntnu.idatt1002.k01g08.fta.controllers.Admin;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Controller for the load tournament page
 *
 * @author jfben
 */
public class LoadTournamentController {
    @FXML
    private Label errorLabel;
    @FXML
    private Button loadTournamentButton;
    @FXML
    private ComboBox tournamentSelectionBox;

    @Deprecated
    public void initialize() {
        tournamentSelectionBox.getItems().addAll(
                Admin.getTournamentNames()
        );
    }

    @FXML
    public void settingsButtonClick(Event event) throws IOException {
        SceneManager.setView("settings");
    }

    @FXML
    public void reportButtonClick(Event event) throws IOException {
        SceneManager.setView("errorForm");
    }

    @FXML
    public void exitButtonClick(Event event) throws IOException {
        SceneManager.setView("main");
    }

    @FXML
    public void backButtonClick(Event event) throws IOException {
        SceneManager.goToLastScene();
    }

    @FXML
    public void loadTournament(ActionEvent actionEvent) {
        if (tournamentSelectionBox.getValue() == null) {
            errorLabel.setText("You must select a tournament to load");
            return;
        }

        String selectedTournamentName = tournamentSelectionBox.getValue().toString();
        int n = Admin.getTournamentNames().indexOf(selectedTournamentName);
        try {
            Admin.selectActiveTournament(n);
            SceneManager.setView("tournamentOverview");
        } catch (IllegalArgumentException | IOException e) {
            errorLabel.setText("Was not able to load the selected tournament");
            e.printStackTrace();
        }
    }

    @FXML
    public void tournamentSelected(ActionEvent actionEvent) {
        loadTournamentButton.setDisable(tournamentSelectionBox.getValue() == null);
    }
}