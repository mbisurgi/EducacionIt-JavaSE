package javase.proyecto.ar.com.educacionit.vehiculos.ventanas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Auto;

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
}
