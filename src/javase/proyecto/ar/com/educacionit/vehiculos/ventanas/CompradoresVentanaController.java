package javase.proyecto.ar.com.educacionit.vehiculos.ventanas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javase.proyecto.ar.com.educacionit.vehiculos.entidades.Comprador;

import java.net.URL;
import java.util.ResourceBundle;

public class CompradoresVentanaController implements Initializable {
    @FXML
    TableView<Comprador> tblCompradores;
    @FXML
    TableColumn<Comprador, String> colNombre;
    @FXML
    TableColumn<Comprador, String> colApellido;
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
