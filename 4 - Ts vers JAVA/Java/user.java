import java.util.Date;
import java.util.List;


public class User{
    private Date birthdate;
    private int size;
    private List<Photo> photo;
    private Address address;

    public User(Date birthdate, double size, List<Photo> photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photo = photo;
        this.address = address;
    }

    public Date getBirthdate(){return birthdate;}
    public int getSize(){return size;}
    public List<Photo> getPhoto(){return photo;}
    public Address getAdress(){return address;}

    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}
    public void setSize(int size) {this.size = size;}
    public void setPhoto(List<Photo> photo) {this.photo = photo;}
    public void setAddress(Address address) {this.address = address;}

}