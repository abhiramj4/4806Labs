import java.security.cert.CertificateParsingException;

public class Counter{
    private static int count = 0;

    public static synchronized int getCount(){ return count; }

    public synchronized  void setCount(int count){ this.count = count; }


    public static void main(String[] args) {

        Counter c1 = new Counter();

        System.out.println( Counter.getCount());

        c1.setCount(1);
        Counter.getCount();

        System.out.println( Counter.getCount());
    }

}





