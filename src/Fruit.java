public class Fruit {
    private String color;
    private String shape;
    private String type;
    private int weight;
    private boolean ripe;
    private int juice = 10;
    private boolean rotten = false;

    
    public Fruit(String color){
        this.color=color;
    }
    public Fruit(String color, String shape, int weight, boolean ripe) {
        this.color = color;
        this.shape = shape;
        this.weight = weight;
        this.ripe = ripe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

    public boolean isRotten() {
        return rotten;
    }

    public void setRotten(boolean rotten) {
        this.rotten = rotten;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
