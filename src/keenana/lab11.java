/*
 * Course: CSC 1120 121
 * Term: Spring 2024
 * Assignment: Lab 11
 * Name: Andrew Keenan
 * Created: 4-3-2024
 */
package keenana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class lab11 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Auto Completer");
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("fxml.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
