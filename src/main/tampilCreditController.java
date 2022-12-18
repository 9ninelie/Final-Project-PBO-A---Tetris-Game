package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class tampilCreditController {
    @FXML
    private StackPane rootPane;

    @FXML
    void back(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/resources/tampilMenu.fxml"));
            Scene scene = new Scene(root);
            Main.getStage().setScene(scene);
            Main.getStage().setTitle("MENU ONG TETRIS");
        } catch (IOException e) {
            System.out.println("tidak bisa memuat halaman");
        }
    }

}


