
package GoogleFlight;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AdminFXMLController implements Initializable {
    @FXML
    private Button HandOverTuskButton;
    @FXML
    private Color x1;
    @FXML
    private Button OpenIDButton;
    @FXML
    private Button DumpUpdatedTicketButton;
    @FXML
    private Button LogOut;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void HandOverTuskButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void OpenIDButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void DumpUpdatedTicketButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void LogOutOnClick(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("SignInFXML.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
