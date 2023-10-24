public class B {
    public static int mult(int a, int b) throws UnluckyNumException {
        if(a == 13 || b== 13)
            throw new UnluckyNumException("ужас!", 13);
        return a*b;
    }
}
