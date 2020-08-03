public class HelloWorld {

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        String firstLetter = name.substring(0, 1).toUpperCase();
        String remainLetters = name.substring(1);
        return "Hello " + firstLetter + remainLetters;
    }
}
