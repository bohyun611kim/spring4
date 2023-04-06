package net.madvirus.spring4.chap07.event;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by kim 04/04/23
 */

@RequestMapping("/event")
@Controller
public class EventController {


    private final EventService eventService;

    public EventController(@Qualifier("eventService") EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping("/list")
    public String list(SearchOption option, Model model) {
        List<Event> eventList = eventService.getOpenedEventList();
        model.addAttribute("eventList", eventList);
        model.addAttribute("eventTypes", EventType.values());
        return "event/list";
    }

}
