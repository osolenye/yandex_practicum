package sprint5.final_project;

import java.util.List;

public interface HistoryManager {

    List<Node> getHistory();
    void addTask(AbstractTask task);
    void remove(Node node);
}
