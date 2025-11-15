package one.group.models.people;
/** A Class for admin users*/
public class Admin extends Person {
    
    /** A constructor for the Admin user class.
     * Takes the id and name of the user as parameters.
     */
    public Admin(String id, String name){
        super(id, name);
        setIsAdmin(true);
    }
}
