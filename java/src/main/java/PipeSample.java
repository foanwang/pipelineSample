
public class PipeSample {

    public static void main(String[] args) throws Exception {
        Pipe pi = new Pipe();
        int result = pi.pipe(5, "increment", "increment");
        int result2 = pi.pipe(4);
        System.out.println("result:"+result);
        System.out.println("result2:"+result2);
    }

}
