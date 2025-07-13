public class Car {

    // private
    // if you don't wanna an attribute to be WRITEABLE when declare it you can add (final)

    private String model;
    private final String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // GETTER

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

    // SETTER

    void SetModel(String model){
        this.model = model;
    }

    void setPrice(int price){
        if (price < 0){
            System.out.println("Price can't be less than zero");
        }
        else {
            this.price = price;
        }

    }



}
