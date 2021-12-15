
package GoogleFlight;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignInFXMLController implements Initializable {
    @FXML
    private Button NextButton;
    @FXML
    private Label LabelForWrongInfo;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox userTypeComboBox;
    @FXML
    private Label userTypeLabel;
    @FXML
    private Button VisitorScene;
    @FXML
    private Button AdminScene;
    @FXML
    private Button ManagerScene;
    @FXML
    private Button AirlinesCompanyButton;
    private Object stage;
    @FXML
    private Button PreviousButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // userTypeComboBox.getItems().addAll("Admin", "Manager", "Visitor", "Airlines Company");
       
    }    

    @FXML
    private void NextButtonOnClick(ActionEvent event) throws IOException {
        try {   
        FileInputStream check;
        
            check = new FileInputStream("Customer.bin");
       
        DataInputStream read = new DataInputStream(check);
       // Scanner sc=new Scanner(read);
        String str = read.readUTF();
        String[] userArray;
        userArray = str.split(",");
        String group = String.valueOf(userTypeComboBox.getValue().toString());
         
        
        
       for(int i=0; i<= (userArray.length); i++){          
           if((userArray[i]).equals(NameTextField.getText()) && (userArray[i+4]).equals(passwordTextField.getText()) ){
                     Parent scene2Parent ;
                    if(group.equals("Admin") ){
                        
                        scene2Parent = FXMLLoader.load(getClass().getResource("AdminFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                       
                   }
                   else if(group.equals("Manager")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("ManagerFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   else if (group.equals("Visitor")){
                        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("VisitorFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
                   }
                   else if(group.equals("Airlines Company")){
                        scene2Parent = FXMLLoader.load(getClass().getResource("AirlinesCompanyFXML.fxml"));
                            Scene scene2 = new Scene(scene2Parent);
                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                            window.setScene(scene2);
                            window.show();
                   }
                   
               
           }
          
           
       
        }
       LabelForWrongInfo.setText("Login FAILED");
        
         } catch (FileNotFoundException ex) {
            Logger.getLogger(SignInFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignInFXMLController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    @FXML
    private void VisitorSceneButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("VisitorFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void AdminSceneButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void ManagerSceneButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ManagerFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void AirlinesCompanyButtonOnClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AirlinesCompanyFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void PreviousButtonOnClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}
        
