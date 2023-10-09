/**
 * The class for the apple model
 */
public class AppleModel extends Fruit{
  
    public AppleModel(String color, String type, int weight, boolean ripe){
        super(color);
        
        setType (type);
        setWeight(weight);
        setRipe(ripe);
    }

}
