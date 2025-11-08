package timetable.models.people;

 public abstract class Person{
    
    private String name;
    private String id;
    private String type = "person";
    private String typeOfPerson;

    public Person(String name, String id, String typeOfPerson){
        this.name = name;
        this.id = id;
        this.typeOfPerson = typeOfPerson;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return id;
    }

    public String getType(){
        return type;
    }

    public String getTypeOfPerson(){
        return typeOfPerson;
    }
}