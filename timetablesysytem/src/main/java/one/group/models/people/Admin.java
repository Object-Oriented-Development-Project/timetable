package one.group.models.people;

import one.group.models.term.Term;

/** A Class for admin users*/
public class Admin{
    private String id;
    private String name;
    private String password;
    /**
     * Creates an Admin user with the given id and name.
     * @param id   the admins id
     * @param name the admins name
     */
    public Admin(String id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setTerm(int n){
        Term.setTerm(n);
    }
}
