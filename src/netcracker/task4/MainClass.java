package netcracker.task4;

public class MainClass {

    public static void main(String[] args){
        Magic posNum = new MagicImpl(); // check positive
        posNum.setNumber(123);
        System.out.println(posNum.getNumber());
        posNum.doMagic();
        System.out.println(posNum.getNumber());
        Magic negNum = new MagicImpl(); // check negative
        negNum.setNumber(-123);
        System.out.println(negNum.getNumber());
        negNum.doMagic();
        System.out.println(negNum.getNumber());
    }
}
