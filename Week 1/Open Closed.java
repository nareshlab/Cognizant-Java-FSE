// basically it means that the class should be open for extension and closed for modification
//  consider i have a class named juice. the juice may have inputs like name of the juice, fruits, color and etc. Now if i wish to change the juice by adding salt , 
// it might affect the juice badly. so in that cases we should create a new class by extending it from the juice class and modify in that. 

public class Guitar {
    private String make;
    private String model;
    private int volume;

    // constructors, getters, and setters
}

//correct approach

public class SuperCoolGuitarWithFlames extends Guitar {
    private String flameColor;

    // constructor, getters, setters
}
