package javase.proyecto.ar.com.educacionit.vehiculos.ventanas;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Auto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AutosVentanaController implements Initializable {
    @FXML
    TableView<Auto> tblAutos;
    @FXML
    TableColumn<Auto, String> colMarca;
    @FXML
    TableColumn<Auto, String> colModelo;
    @FXML
    Button btnNuevo;
    @FXML
    Button btnEditar;
    @FXML
    Button btnBorrar;
    @FXML
    Button btnCerrar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void btnNuevoOnMouseClicked(Event event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AutosEdicion.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Autos");
            stage.setScene(new Scene(parent, 500, 350));
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(btnNuevo.getScene().getWindow());
            stage.showAndWait();
        } catch (IOException ex) {

        }
    }
}
