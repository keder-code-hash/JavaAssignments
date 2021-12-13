// we can't instatiate an object of a person

abstract class Person {
    String phNo;
    String name;
    String type;
    Person(String phNo, String name,String type) {
        this.phNo = phNo;
        this.name = name;
        this.type=type;
    }
    
}