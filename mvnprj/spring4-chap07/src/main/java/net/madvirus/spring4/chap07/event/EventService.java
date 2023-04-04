package net.madvirus.spring4.chap07.event;

import java.util.List;

/**
 * created by kim 04/04/23
 */
public interface EventService {

    Event getEvent(Long id);

    List<Event> getOpenedEventList();
}
