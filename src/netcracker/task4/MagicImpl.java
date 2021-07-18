package netcracker.task4;

public class MagicImpl implements Magic{
    private int x;

    /**
     * set attribute x
     * @param x
     */
    public void setNumber(int x){
        this.x = x;
    }

    /**
     * @return attribute x
     */
    public int getNumber(){
        return x;
    }

    /**
     * Reverse attribute x.
     * The resulting number will be positive, if current x is positive;
     * it will be negative, if current x is negative
     */
    public void doMagic(){
        int cloneX = x;
        x = 0;
        while (cloneX != 0) {
            x = (x * 10 + cloneX % 10);
            cloneX /= 10;
        }
    }
}
