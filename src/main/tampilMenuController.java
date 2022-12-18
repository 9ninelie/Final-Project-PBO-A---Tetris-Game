package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class tampilMenuController implements Initializable {
    @FXML
    private StackPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void gameMulai(ActionEvent event) throws IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/layoutTetris.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 410, 510);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            guiController c = fxmlLoader.getController();
            Image icon = new Image(getClass().getResourceAsStream("/resources/image/onglogo.png"));
            stage.getIcons().add(icon);
            stage.setTitle("ONG TETRIS GAME");
            stage.setScene(scene);
            stage.show();

            new gameController(c);
        } catch (Exception e){
            System.out.println("tidak bisa memuat halaman");
        }

    }

    @FXML
    void tampilInfo(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/resources/tampilInfo.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Image icon = new Image(getClass().getResourceAsStream("/resources/image/onglogo.png"));
            stage.getIcons().add(icon);
            stage.setTitle("INFO ONG TETRIS");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("tidak bisa memuat halaman");
        }

    }

    @FXML
    void Credit(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/resources/tampilCredit.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Image icon = new Image(getClass().getResourceAsStream("/resources/image/onglogo.png"));
            stage.getIcons().add(icon);
            stage.setTitle("CREDIT ONG TETRIS");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("tidak bisa memuat halaman");
        }

    }

}
