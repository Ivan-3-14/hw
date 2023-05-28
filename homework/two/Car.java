package homework.two;

public class Car {
    private Brand brand;
    private COLOR color;

    public Car (String brand, String color) {
        this.brand = Brand.valueOf(brand);
        this.color = COLOR.valueOf(color);
    }

    public String changeColor () {
        if (this.brand.equals("AUDI")){
            if ( this.color.equals("RED")){
                return this.color + " " + this.brand;
            }
        }
        return null;
    }

    public Brand getBrand() {
        return brand;
    }

    public COLOR getColor() {
        return color;
    }

    public void print () {
        System.out.println(changeColor ());
    }
}
