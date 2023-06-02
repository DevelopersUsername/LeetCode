import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private final String[] arr;
    private int ptr = 0;

    public OrderedStream(int n) {
        arr = new String[n];;
    }

    public List<String> insert(int idKey, String value) {

        arr[idKey - 1] = value;

        List<String> stream = new ArrayList<>();

        for (int i = ptr; i < arr.length; i++) {
            if (arr[i] != null) {
                stream.add(arr[i]);
                ptr++;
            } else
                break;
        }

        return stream;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */