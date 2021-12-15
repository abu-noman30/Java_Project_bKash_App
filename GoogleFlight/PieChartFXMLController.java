/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleFlight;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author mch
 */
public class PieChartFXMLController implements Initializable {
    @FXML
    private PieChart PieChart;
    @FXML
    private Button LoadPieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoadPieChartOnClick(ActionEvent event) {
         ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Chittagong",50),
            new PieChart.Data("Sylhet",20),
            new PieChart.Data("Joshor",30),
            new PieChart.Data("Cox's Bazar",10),
            new PieChart.Data("Kolkata",15)
        );
        PieChart.setData(list);
        
        for(PieChart.Data data: PieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

                @Override
                public void handle(MouseEvent t) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
               
            }
            );
        }
    }
    
}
