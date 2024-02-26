package utilities;
import java.util.List;

public class GenericAppend {
    public static <E>void appendFromEnd (List<? super E> destination, List<? extends E> source) {
        int destinationIndex= destination.size();



       for (int sourceIndex = source.size() - 1; sourceIndex >= 0; sourceIndex--){
            destination.add(destinationIndex,source.get(sourceIndex));
            destinationIndex++;



        }

    }
}
