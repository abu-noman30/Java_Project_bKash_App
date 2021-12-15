
package GoogleFlight;
import java.io.Serializable;
class Customer implements Serializable {
    private int age;
    private String name, NIDno,gender,Email,password;

    Customer(int parseInt, String field, String field0, float parseFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getNIDno() {
        return NIDno;
    }

    public void setNIDno(String NIDno) {
        this.NIDno = NIDno;
    }
    
    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
    

    public Customer(int age, String name, String NIDno,String gender,String Email,String password) {
        this.age = age;
        this.name = name;
        this.NIDno = NIDno;
        this.gender = gender;
        this.Email = Email;
        this.password=password;
        
    }

    @Override
    public String toString() {
        return "Customer{" + "age=" + age + ", name=" + name + ", NIDno=" + NIDno + ",gender=" + gender + ",Email=" + Email + ", password=" + password + "}\n";
    }

    
}
