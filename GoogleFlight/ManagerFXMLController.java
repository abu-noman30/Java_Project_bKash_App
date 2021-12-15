
package GoogleFlight;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ManagerFXMLController implements Initializable {
    @FXML
    private Color x1;
    @FXML
    private Button CustomerDetailButton;
    @FXML
    private TextArea TextArea;
    @FXML
    private Button CheckDataAnalysisReport;
    @FXML
    private Button LogOut;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void CustomerDetailButtonOnClick(ActionEvent event) {
        try {
             Customer s;
             ObjectInputStream in = new ObjectInputStream(
                 new FileInputStream("Customer.bin")
             );
            TextArea.setText(null);
            while(true){
                s = (Customer) in.readObject();
                TextArea.appendText(s.toString()+"\n");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManagerFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void CheckDataAnalysisReportOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DataAnalysis.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
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
