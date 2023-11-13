public class This {
    //Fields Declared

    String name;
    int age;

    //Constructor

    This(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter for name

    public String get_name(){
        return name;
    }

    //Setter for name
    public void change_name(String name){
        this.name = name;
    }

    //Method to Print the Details of the Person

    public void printDetails(){
        System.out.println("Name:");
    }
  }
