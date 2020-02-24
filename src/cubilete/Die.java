package cubilete;

public class Die {

    private Integer value;

    public Die() {
        Integer randomValue = ((int) (Math.random() * 6) + 1);
        value = randomValue;
    }
    
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value){
        this.value=value;
    }
    
    @Override
    public String toString() {
        switch (value) {
            case 1:
                return "negra";
            case 2:
                return "roja";
            case 3:
                return "J";
            case 4:
                return "Q";
            case 5:
                return "K";
            case 6:
                return "A";
        }
        return "A";
    }
}
