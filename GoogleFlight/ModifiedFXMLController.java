
package GoogleFlight;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class ModifiedFXMLController implements Initializable {
    @FXML
    private Label displayInfosheetLabel;
    @FXML
    private TextField originTextField;
    @FXML
    private TextField destinationTextField;
    @FXML
    private Button displayButton;
    @FXML
    private TextField priceTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void displayButtonOnClick(ActionEvent event) throws IOException {
        try {   
       File f = new File("InfoSheet.txt");
  Scanner s = new Scanner(f);
       // Scanner sc=new Scanner(read);
        String str; String[] fields;int calculate=0;
  while(s.hasNextLine()){
     str = s.nextLine();
     fields = str.split(";");}
     
        
        
       for(int i=0; i<=(fields.length); i++){          
           if((fields[i]).equals(originTextField.getText()) && (fields[i+1]).equals(destinationTextField.getText()) && (fields[i+2]).equals(priceTextField.getText())  )
           {
              calculate++; 
           }  
           
    }
       
       displayInfosheetLabel.setValue(calculate);

    
}catch (FileNotFoundException ex) {
            Logger.getLogger(ModifiedFXMLController.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
}