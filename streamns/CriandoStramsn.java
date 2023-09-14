package streamns;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStramsn {
    public static void main(String[] args) {

        Consumer<String> print = System.out ::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> lang = Stream.of("Java ", "PHP ", "JS");
        lang.forEach(print);

        String [] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};

        Stream.of(maisLangs).forEach(print);



    }
}
