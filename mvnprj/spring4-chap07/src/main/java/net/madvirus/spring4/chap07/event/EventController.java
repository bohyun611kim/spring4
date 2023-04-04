package net.madvirus.spring4.chap07.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by kim 04/04/23
 */

@RequestMapping("/event")
@Controller
public class EventController {


    private  EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping("/list")
    public String list(Model model) {



        return "event/list";
    }
}
