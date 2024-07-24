import StringManipulation.*;


public class MainApplication {
    private HelloWorld hello;
    private WordReversal reverse;


    public MainApplication(){
        this.hello = new HelloWorld();
        this.reverse = new WordReversal();
    }

    public static void main(String[] args) {
        String reversal = "hello there how are you ";
        MainApplication mainApplication = new MainApplication();
        System.out.println(mainApplication.hello.Hello());
        System.out.println(mainApplication.reverse.reverse(reversal));


    }
}