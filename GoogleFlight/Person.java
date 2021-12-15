
package GoogleFlight;
import javafx.beans.property.SimpleStringProperty;
public class Person {
    private SimpleStringProperty Name, NIDno;
   

    public Person(String Name, String NIDno) {
        this.Name = new SimpleStringProperty(Name);
        this.NIDno = new SimpleStringProperty(NIDno);
      
    }

    public void setName(String Name) {
        this.Name = new SimpleStringProperty(Name);
    }

    public void setNIDno(String NIDno) {
        this.NIDno = new SimpleStringProperty(NIDno);
    }

   
    public String getName() {
        return Name.get();
    }

    public String getNIDno() {
        return NIDno.get();
    }

    
}
