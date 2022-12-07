package prak15_egy;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OutputController {

    @FXML
    private Text lblNpm;

    @FXML
    private Text lblNama;

    @FXML
    private Text lblAlamat;

    @FXML
    private Button btnNew;

    @FXML
    void openForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage = (Stage) btnNew.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    void showValue(Mahasiswa mhs){
        lblNpm.setText(mhs.getNpm());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
    }

}
