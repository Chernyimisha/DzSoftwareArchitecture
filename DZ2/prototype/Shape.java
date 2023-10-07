package DZ_architecture.DZ_2.prototype;

public abstract class Shape implements Cloneable {

    private String color;

    public abstract void draw();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


