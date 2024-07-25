import StringManipulation.*;


public class MainApplication {
    private final HelloWorld hello;
    private final WordReversal reverse;
    private final Anagram anagram;
    private Pangram pangram;


    public MainApplication(){
        this.hello = new HelloWorld();
        this.reverse = new WordReversal();
        this.anagram = new Anagram();
        this.pangram = new Pangram();
    }

    public static void main(String[] args) {
        String reversal = "hello there how are you ";
        String pangramCheck = "The quick brown fox jumps over the lazy dog";
        MainApplication mainApplication = new MainApplication();
        System.out.println(mainApplication.hello.Hello());
        System.out.println(mainApplication.reverse.reverse(reversal));
        System.out.println(mainApplication.anagram.anagramChecker( "dormitory",  "dirty room"));
        System.out.println(mainApplication.pangram.PangramChecker(pangramCheck));


    }
}