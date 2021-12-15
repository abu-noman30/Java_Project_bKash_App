
package GoogleFlight;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author mch
 */
public class Tickets {
    private SimpleStringProperty from, to,secondfrom,secondTo;
    public Tickets(String from, String to,String secondfrom,String secondTo) {
        this.from = new SimpleStringProperty(from);
        this.to = new SimpleStringProperty(to);
        this.secondfrom = new SimpleStringProperty(secondfrom);
        this.secondTo = new SimpleStringProperty(secondTo);  
    }

    public void setFrom(String from) {
        this.from = new SimpleStringProperty(from);
    }

    public void setto(String to) {
        this.to = new SimpleStringProperty(to);
    }

    
    public String getFrom() {
        return from.get();
    }

    public String getLastName() {
        return to.get();
    }
    
    public void setsecondFrom(String secondfrom) {
        this.secondfrom = new SimpleStringProperty(secondfrom);
    }

    /*public void setto(String to) {
        this.secondTo = new SimpleStringProperty(secondTo);
    }

    
    public String getsecondFrom() {
        return secondfrom.get();
    }

    public String getLastName() {
        return secondTo.get();
    }
*/
    
    
    
    
}
