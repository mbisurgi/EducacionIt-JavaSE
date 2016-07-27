package javase.proyecto.ar.com.educacionit.vehiculos.ventanas;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VentanaMaestraController implements Initializable {
    @FXML
    MenuItem menuAutos;
    @FXML
    MenuItem menuVendedores;
    @FXML
    MenuItem menuCompradores;
    @FXML
    MenuItem menuSalir;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void menuAutosOnMouseClicked(Event event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AutosVentana.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Autos");
            stage.setScene(new Scene(parent, 770, 400));
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {

        }
    }
}
