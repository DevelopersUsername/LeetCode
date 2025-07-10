import java.util.ArrayList;
import java.util.List;

class BrowserHistory {

    private int pos, capacity;
    private final List<String> history = new ArrayList<>();

    public BrowserHistory(String homepage) {
        pos = -1;
        capacity = -1;
        visit(homepage);
    }

    public void visit(String url) {
        if (++pos < history.size()) history.set(pos, url);
        else history.add(url);
        capacity = pos;
    }

    public String back(int steps) {

        pos = Math.max(0, pos - steps);
        return history.get(pos);
    }

    public String forward(int steps) {
        pos = Math.min(capacity, pos + steps);
        return history.get(pos);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */