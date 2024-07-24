import StringManipulation.*;


public class MainApplication {
    private HelloWorld hello;
    private WordReversal reverse;


    public MainApplication(){
        this.hello = new HelloWorld();
        this.reverse = new WordReversal();
    }

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.hello.Hello();
        mainApplication.reverse.reverse("hello there how are you");


    }
}