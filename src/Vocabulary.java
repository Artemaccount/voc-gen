import java.util.List;

@FunctionalInterface
public interface Vocabulary {
    List<String> getVoc(String text);
}
