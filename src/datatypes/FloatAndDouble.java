package datatypes;

public class FloatAndDouble {
    public static void main(String[] args) {
        System.out.println("float");
        float a = .7f;
        System.out.println(a);
        System.out.println((double)(a));
        System.out.println("How Float and Double values are stored in the memory");
        /*
        Float :- 32 bit IEEE 754
        in 32 bits
        one bit for sign(+ or -)
        eight bits for exponent
        23 bits for mondissa/significant

         */
    }
}
