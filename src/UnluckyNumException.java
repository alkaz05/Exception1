public class UnluckyNumException extends Exception{
    int num;

    public UnluckyNumException(String message, int num) {
        super(message);
        this.num = num;
    }
}
