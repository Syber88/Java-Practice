import StringManipulation.*;


public class MainApplication {
    private HelloWorld hello;

    public MainApplication(){
        this.hello = new HelloWorld();
    }
    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.hello.Hello();

    }
}