package main.java;

/**
 * Created by Suli on 2016.12.08..
 */

// http://www.javaworld.com/article/2077333/core-java/mr-happy-object-teaches-custom-events.html
// http://www.theorphys.elte.hu/fizinf/HaloAdat/tananyag/java/8_ESEMENYEK/index.html

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MrHappyObject {
    private Mood _mood = State.HAPPY;
    private List _listeners = new ArrayList();

    public synchronized void receivePinch() {
        if (_mood == State.HAPPY) {
            _mood = State.ANNOYED;
            _fireMoodEvent();
        } else {
            _mood = State.ANGRY;
            _fireMoodEvent();
        }
    }

    public synchronized void receiveHug() {
        if (_mood == State.ANGRY) {
            _mood = State.ANNOYED;
            _fireMoodEvent();
        } else {
            _mood = State.HAPPY;
            _fireMoodEvent();
        }
    }

    public synchronized void addMoodListener(MoodListener l) {
        _listeners.add(l);
    }

    public synchronized void removeMoodListener(MoodListener l) {
        _listeners.remove(l);
    }

    private synchronized void _fireMoodEvent() {
        MoodEvent mood = new MoodEvent(this, _mood);
        Iterator listeners = _listeners.iterator();
        while (listeners.hasNext()) {
            ((MoodListener) listeners.next()).moodReceived(mood);
        }
    }
}
