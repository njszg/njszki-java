package main.java;

/**
 * Created by Suli on 2016.12.08..
 */
import java.util.EventObject;

public class MoodEvent extends EventObject {
    private Mood _mood;

    public MoodEvent( Object source, Mood mood ) {
        super( source );
        _mood = mood;
    }
    public Mood mood() {
        return _mood;
    }

}

