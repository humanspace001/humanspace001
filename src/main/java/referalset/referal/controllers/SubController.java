package referalset.referal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Subscriber;

import javax.persistence.Entity;

@RestController
@RequestMapping ("/invite")
public class SubController {
    @GetMapping ("/sender")
public Subscriber save (@RequestBody Subscriber subscriber) {
        return subscriber;
    }
    @GetMapping ("/permision")
    public  Subscriber permision (@RequestBody Subscriber subscriber) {
    return subscriber;
    }
}
