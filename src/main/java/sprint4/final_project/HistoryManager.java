package sprint4.final_project;

import java.util.ArrayList;
import java.util.List;

public interface HistoryManager {

    List<Node> getHistory();
    void addTask(AbstractTask task);
    void remove(Node node);
}
