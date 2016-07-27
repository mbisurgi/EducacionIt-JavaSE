package javase.proyecto.ar.com.educacionit.vehiculos.ventanas;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class AutosEdicionController implements Initializable {
    @FXML
    TextField txtAlto;
    @FXML
    TextField txtAncho;
    @FXML
    TextField txtLargo;
    @FXML
    TextField txtPrecio;
    @FXML
    ComboBox cboModelo;
    @FXML
    ComboBox cboMarca;
    @FXML
    ComboBox cboColor;
    @FXML
    Button btnOk;
    @FXML
    Button btnCancelar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void btnOkOnMouseClicked(Event event) {
        if (txtAlto.getText().isEmpty() || txtAlto.getText().trim().length() == 0) {
            Alert msg = new Alert(Alert.AlertType.WARNING);
            msg.setTitle("Campos vacios...");
            msg.setHeaderText(null);
            msg.setContentText("El campo alto no puede estar vacio.");
            msg.showAndWait();
            txtAlto.requestFocus();
            return;
        }

        if (txtAncho.getText().isEmpty() || txtAncho.getText().trim().length() == 0) {
            Alert msg = new Alert(Alert.AlertType.WARNING);
            msg.setTitle("Campos vacios...");
            msg.setHeaderText(null);
            msg.setContentText("El campo ancho no puede estar vacio.");
            msg.showAndWait();
            txtAncho.requestFocus();
            return;
        }

        if (txtLargo.getText().isEmpty() || txtLargo.getText().trim().length() == 0) {
            Alert msg = new Alert(Alert.AlertType.WARNING);
            msg.setTitle("Campos vacios...");
            msg.setHeaderText(null);
            msg.setContentText("El campo largo no puede estar vacio.");
            msg.showAndWait();
            txtLargo.requestFocus();
            return;
        }

        if (txtPrecio.getText().isEmpty() || txtPrecio.getText().trim().length() == 0) {
            Alert msg = new Alert(Alert.AlertType.WARNING);
            msg.setTitle("Campos vacios...");
            msg.setHeaderText(null);
            msg.setContentText("El campo precio no puede estar vacio.");
            msg.showAndWait();
            txtPrecio.requestFocus();
            return;
        }

        Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacion.setTitle("Confirmacion...");
        confirmacion.setHeaderText(null);
        confirmacion.setContentText("Esta a punto de guardar los datos, desea continuar?");
        Optional<ButtonType> result = confirmacion.showAndWait();

        if (confirmacion.getResult() == ButtonType.OK) {
            //Funcion para guardar los datos
            Stage stage = (Stage)btnOk.getScene().getWindow();
            stage.close();
        } else {
            confirmacion.close();
        }
    }

    @FXML
    private void btnCancelarOnMouseClicked(Event event) {
        Stage stage = (Stage)btnCancelar.getScene().getWindow();
        stage.close();
    }
}
