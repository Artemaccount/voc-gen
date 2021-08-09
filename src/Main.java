import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /**
         *  1 - детерминированный, 2 - без побочных эффектов.
         */
        Vocabulary vocabulary = x-> Arrays.stream(x.split(" ")).sorted().toList();
        System.out.println(vocabulary.getVoc("a g f e c d b i h"));
    }
}
