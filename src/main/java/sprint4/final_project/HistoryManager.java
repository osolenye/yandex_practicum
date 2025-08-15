package sprint4.final_project;

import java.util.ArrayList;
import java.util.List;

public interface HistoryManager {
    List<AbstractTask> history = new ArrayList<>();

    List<AbstractTask> getHistory();
    void addTask(AbstractTask task);
    void remove(int id);
}
