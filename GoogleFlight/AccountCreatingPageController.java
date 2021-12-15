
package GoogleFlight;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AccountCreatingPageController implements Initializable {
    @FXML
    private TextField NameField;
    @FXML
    private TextField EmailField;
    @FXML
    private TextField NIDnoField;
    @FXML
    private TextField passwordField;
    @FXML
    private RadioButton MaleRadioButton;
    @FXML
    private RadioButton FemaleRadioButton;
    @FXML
    private Button NextButton;
    @FXML
    private Label genderLabel;
    
    private ToggleGroup tg;
    
    @FXML
    private TextField ageTextField;
    @FXML
    private Button CreatAccountButton;
    @FXML
    private Button ConfirmCreationButton;
    @FXML
    private Label userTypeLabel;
    @FXML
    private Button PreviousButton;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         tg = new ToggleGroup();
        MaleRadioButton.setToggleGroup(tg);
        FemaleRadioButton.setToggleGroup(tg);
       
    }    

    

    @FXML
    private void NextButtonOnClick(ActionEvent event) throws IOException {
       
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("SignInFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void RadioButtonOnClick(ActionEvent event) {
         if(MaleRadioButton.isSelected()) genderLabel.setText("Selected Gender is : Male");
        else if(FemaleRadioButton.isSelected()) genderLabel.setText("Selected Gender is : Female");
       
    }

    @FXML
    private void CreatAccountButtonOnClick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        try {
            f = new File("Customers.txt");
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
                ageTextField.getText()+","
            	+NameField.getText()+","
                +EmailField.getText()+","	
                +NIDnoField.getText()+","
                +genderLabel.getText()+","
                +userTypeLabel.getText()+
                "\n"	
            );           
  
        } catch (IOException ex) {
            Logger.getLogger(AccountCreatingPageController.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if(fw != null) fw.close();
              
            } catch (IOException ex) {
                Logger.getLogger(AccountCreatingPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    } 
    }

    @FXML
    private void ConfirmCreationButtonOnClick(ActionEvent event) {
          File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Customer.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Customer e = new Customer(
                Integer.parseInt(ageTextField.getText()),
                NameField.getText(),
                NIDnoField.getText(),
                genderLabel.getText(),
                EmailField.getText(),
                passwordField.getText() );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(AccountCreatingPageController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(AccountCreatingPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}

    @FXML
    private void PreviousButtonOnClick(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
}