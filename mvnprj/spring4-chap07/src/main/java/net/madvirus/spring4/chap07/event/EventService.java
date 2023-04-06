package net.madvirus.spring4.chap07.event;

import java.util.List;

/**
 * created by kim 04/04/23
 */
public interface EventService {

    Event getEvent(Long eventId);

    List<Event> getRecommendedEventService();

    List<Event> getOpenedEventList();


}
