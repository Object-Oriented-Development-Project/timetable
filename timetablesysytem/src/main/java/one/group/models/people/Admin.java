package one.group.models.people;
/** A Class for admin users*/
public class Admin extends Person {
    
    /**
     * Creates an Admin user with the given id and name.
     * @param id   the admins id
     * @param name the admins name
     */
    public Admin(String id, String name){
        super(id, name);
        setIsAdmin(true);
    }
}
