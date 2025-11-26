import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> names = List.of("Sakthi", "Suguna","Karna","Shahisnu","Abi","Anand");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("The students whose name begins wth A : " + namesWithA);
    }
}