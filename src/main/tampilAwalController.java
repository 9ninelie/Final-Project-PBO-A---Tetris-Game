package main;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class tampilAwalController implements Initializable {
    
    @FXML
    private StackPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new loadingAwal().start();
    }

    class loadingAwal extends Thread {
        @Override
        public void run()
        {
            try {
                Thread.sleep(3000);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("/resources/tampilMenu.fxml"));
                        Scene scene = new Scene(root);
                        Main.getStage().setScene(scene);
                        Main.getStage().setTitle("MENU ONG TETRIS");
                    } catch (IOException e) {
                        System.out.println("tidak bisa memuat halaman");
                    }

                    }
                });
            } catch (InterruptedException ex) {
                System.out.println("tidak bisa memuat halaman");
            }
        }
    }
}
