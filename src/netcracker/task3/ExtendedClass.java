package netcracker.task3;


public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass(byte b, int i, double d, String s){
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    /**
     * Override equals for ExtendedClass.
     * @param anObject: Object
     * @return true, if this is equal to anObject, else - false
     */
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {  //this is equal to itself
            return true;
        }
        if (anObject == null || this.getClass() != anObject.getClass()) {
            return false;
        }
        ExtendedClass arg = (ExtendedClass) anObject;
        return b == arg.b && i == arg.i && d == arg.d && s.equals(arg.s);
    }

    /**
     * Override hashCode for ExtendedClass.
     * There is used the sum of hash code of string attribute
     * and (int) values of other class attributes.
     * @return hash code of this.
     */
    @Override
    public int hashCode() {
        int res = s.hashCode();
        res = res + b + i + (int)(d*100);
        return res;
    }

    /**
     * Override toString for ExtendedClass.
     * Shows this in four lines.
     * Each line is an attribute of a class.
     * String line includes "" sign to show the beginning and the end of a string.
     * @return this turned into string.
     */
    @Override
    public String toString(){
        return "byte " + b + "\nint " + i + "\ndouble " + d + "\nstring \""+ s +"\"";
    }

    public static void main(String[] args){
        ExtendedClass object = new ExtendedClass((byte) 4, 289, 23.4, "Meow!");
        ExtendedClass eqObject = new ExtendedClass((byte) 4, 289, 23.4, "Meow!");
        ExtendedClass notEqObject = new ExtendedClass((byte) 4, 289, 23.4, "Moo!");
        System.out.println(object.toString());
        System.out.println("Equations:");
        System.out.println(object.equals(eqObject));
        System.out.println(object.equals(notEqObject));
        System.out.println("Hash:");
        System.out.println(object.hashCode());
    }
}
