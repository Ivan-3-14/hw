package homework.two;

public class Box {
    private int x;
    private int y;
    private int z;

    public Box (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getBoxVolume(){
        return this.x * this.y * this.z;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    public String typeOfBox () {
        if (this.x < 0 | this.y < 0 | this.z < 0 | this.x + this.y + this.x == 0) {
            return "this box no exist ";
        } else {
            if (this.x + this.y == 0 | this.y + this.z == 0 | this.x + this.z == 0) {
                return "this is point";
            }
            else {
                if (this.x == 0 | this.y == 0 | this.z == 0) {
                    return "this is envelope";
                }
                else {
                    if (this.x == this.y & this.y == this.z) {
                        return "this box is a cube";
                    }
                    else {
                        return "normal box";
                    }
                }
            }
        }
    }

    public Box (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Box (int x) {
        this.x = x;
    }


}


