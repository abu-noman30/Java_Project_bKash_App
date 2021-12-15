
package GoogleFlight;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class SearchFlightFXMLController implements Initializable {
    @FXML
    private Button oneWayButton;
    @FXML
    private Button RoundTripButton;
    @FXML private TableView<Person> tableView;
    @FXML
    private TableColumn<Tickets, String> FromColumn;
    @FXML
    private TableColumn<Tickets, String> ToColumn;
    @FXML
    private TableColumn<Tickets, String> secondFromColumn;
    @FXML
    private TableColumn<Tickets, String> SecondToColumn;
    @FXML
    private Label firstTo;
    @FXML
    private Label firstFrom;
    @FXML
    private Label secondFrom;
    @FXML
    private Label secondTo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      /*  FromColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("sylhet"));
        ToColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("dubai"));
         secondFromColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("chittagong"));
        SecondToColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("dhaka"));
        
        //load dummy data
        tableView.setItems(getTickets());    
        
        //Allow first and last name to be edittable
        tableView.setEditable(true);
        FromColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        ToColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        secondFromColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        SecondToColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        //allow the table to select multiple rows at once
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
       */
    }    

    @FXML
    private void oneWayButtonOnClick(ActionEvent event) {
        
    }
    
         @FXML
    private void RoundTripButtonOnClick(ActionEvent event) {
       /*  Tickets newTickets = new Tickets(FromColumn.getText(),
                                        ToColumn.getText(),
                                        secondFromColumn.getText(),
                                        SecondToColumn.getText()
                                       
                                    );
        tableView.getItems().add(newTickets);
        */
    }

   
        
        
    

   
    

    @FXML
    private void ChangeFromColumnCellEvent(TableColumn.CellEditEvent<Tickets, String> event) {
    }

    @FXML
    private void ChangeToColumnCellEvent(TableColumn.CellEditEvent<Tickets,String > event) {
    }

    @FXML
    private void ChangeSecondFromColumnEventCell(TableColumn.CellEditEvent<Tickets, String> event) {
    }

    @FXML
    private void ChangeSecondToColumnEventCell(TableColumn.CellEditEvent<Tickets, String> event) {
    }

   /* private ObservableList<Tickets> getTickets() {
        ObservableList<Tickets> ticket = FXCollections.observableArrayList();
        ticket.add(new Tickets("dhaka", "Barisal","chttagong", "khulna"));
        ticket.add(new Tickets("chttagong", "khulna","dhaka", "Barisal"));
        ticket.add(new Tickets("Gajipur", "Bogura","dhaka", "Barisal"));
        return ticket;
         //To change body of generated methods, choose Tools | Templates.
    }
    */
}
