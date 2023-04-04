package net.madvirus.spring4.chap07.event;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    public EventServiceImpl() {
        System.out.println("--- 서비스 생성");
    }

    @Override
    public Event getEvent(Long id) {
        return null;
    }

    @Override
    public List<Event> getOpenedEventList() {
        return null;
    }
}
