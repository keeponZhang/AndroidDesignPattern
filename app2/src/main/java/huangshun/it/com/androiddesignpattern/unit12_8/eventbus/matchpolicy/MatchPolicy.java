package huangshun.it.com.androiddesignpattern.unit12_8.eventbus.matchpolicy;


import java.util.List;

import huangshun.it.com.androiddesignpattern.unit12_8.eventbus.EventType;

public interface MatchPolicy {
    List<EventType> findMatchEventTypes(EventType type, Object aEvent);
}
