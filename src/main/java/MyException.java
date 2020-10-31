public class MyException extends NumberFormatException {

    public MyException() {
    }

    public MyException(String msg) {
        System.err.println(msg);;
    }
}
