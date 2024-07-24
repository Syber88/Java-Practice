import StringManipulation.*;


public class MainApplication {
    private HelloWorld hello;
    private WordReversal reverse;
    private Anagram anagram;


    public MainApplication(){
        this.hello = new HelloWorld();
        this.reverse = new WordReversal();
        this.anagram = new Anagram();
    }

    public static void main(String[] args) {
        String reversal = "hello there how are you ";
        MainApplication mainApplication = new MainApplication();
        System.out.println(mainApplication.hello.Hello());
        System.out.println(mainApplication.reverse.reverse(reversal));
        System.out.println(mainApplication.anagram.anagramChecker( "silent",  "listens"));


    }
}