package sprint3;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Interfaces {
    public static void main(String[] args) {
        CalendarApp calendarApp = new CalendarApp();
        System.out.println(calendarApp.notes);
        calendarApp.addNote("hahaha");
        System.out.println(calendarApp.notes);
    }
}

interface NoteBook {
    void addNote(String note);
}


class CalendarApp implements NoteBook{
    ArrayList<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note) {
        notes.add(note);
    }
}