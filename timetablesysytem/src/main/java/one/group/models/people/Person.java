package one.group.models.people;
/**
 * The base abstract class for representing a person.
 */
 public abstract class Person{
    
    private String name;
    private String id;
    private boolean  isAdmin = false;
    
    /**
     * Creates Person object with specified name, id and typeOfPerson.
     * @param name
     * @param id
     */
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    /**
     * Returns the name of the Person.
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the ID of the Person.
     * @return id
     */
    public String getID(){
        return id;
    }

    /**
     * Returns whether of not the Perosn is an Admin.
     * @return isAdmin
     */
    public boolean getIsAdmin(){
        return isAdmin;
    }

    /**
     * Sets the Admin status of a person with the boolean parameter given.
     * @param truthValue
     */
    public void setIsAdmin(boolean truthValue){
        isAdmin = truthValue;
    }
}