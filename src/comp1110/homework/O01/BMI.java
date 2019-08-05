package comp1110.homework.O01;

public class BMI {
    String name;
    double height;
    double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI(){
        return (weight / (height * height));
    }

    @Override
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + getBMI() + "Kg/m^2";
    }

    //s BMI (Body Mass Index = weight (kg) / height2 (m2) ).
    //* The class should have a public `toString()` method that returns a `String` like `Fred is 1.9m tall and is 87.0Kg and has a BMI of 24.099722991689752Kg/m^2` (just print the `double`s without special formatting).
    //* Implement this class (if you wish you may implement a main method that demonstrates its use).
}
