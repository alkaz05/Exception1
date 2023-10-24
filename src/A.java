public class A {
    public static void printNum(int num) throws Exception {
        if(num == 13)
            throw new Exception("ужас-ужас");
        System.out.println(num);
    }
}
