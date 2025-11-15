package one.group.models.people;
/** A Class for admin users*/
public class Admin extends Person {
    
    public Admin(String id, String name){
        super(id, name);
        setIsAdmin(true);
    }
}
