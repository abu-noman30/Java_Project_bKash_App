
package GoogleFlight;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DataAnalysisController implements Initializable {
    @FXML
    private Button PieChartButton;
    @FXML
    private Button ClearButton;
    @FXML
    private BorderPane borderPane;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    private void loadPieChart(String pi) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(pi+".fxml"));
            borderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DataAnalysisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void PieChartButtonOnMouseClick(MouseEvent event) {
         loadPieChart("pieChartFXML");
    }

    @FXML
    private void ClearButtonOnClick(ActionEvent event) {
        borderPane.setCenter(null);  
    }
    
}
