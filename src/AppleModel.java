/**
 * The class for the apple model
 */
public class AppleModel {
    private String color;
    private String type;
    private int weight;
    private boolean ripe;
    private int juice = 10;
    private boolean rotten = false;

    public void setColor(String color) {

        if (color.toLowerCase() == "red" || color.equalsIgnoreCase("green")) {
            this.color = color;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public boolean isRipe() {
        return ripe;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Set the give weight to 0++ to 3
     * 
     * @param weight
     */
    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 3) {
            this.weight = weight;
        }
    }

    /**
     * Decrement juice by 1 if juice > 0
     * 
     * @return juice if left in apple
     */
    public int juiceApple() {
        if (this.juice > 0) {
            this.juice--;
        }
        return this.juice;
    }

}
