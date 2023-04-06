package net.madvirus.spring4.chap07.event;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("eventService")
public class EventServiceImpl implements EventService {

    private SortedMap<Long, Event> eventMap = new TreeMap<>();

    private List<Event> result;

    public EventServiceImpl() {
        result = new ArrayList<>();
        result.add(Event.create(1L, "LUSH 01", EventType.CONFERENCE));
        result.add(Event.create(1L, "LUSH 02", EventType.FLASHMOB));
        result.add(Event.create(1L, "LUSH 03", EventType.CIRCUS));
    }

    @Override
    public Event getEvent(Long eventId) {
        return eventMap.get(eventId);
    }

    @Override
    public List<Event> getRecommendedEventService() {

        List<Event> recommendList = new ArrayList<>();

        recommendList.add(eventMap.get(1L));

        return recommendList;
    }

    @Override
    public List<Event> getOpenedEventList() {
        return result;
    }
}
