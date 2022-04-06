package referalset.referal.srevice.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Subscriber;
import referalset.referal.srevice.SubscriberService;

@Service
public class SubscriberServiceImpl implements SubscriberService {
Subscriber subscriber;
    @Override
    public SubscriberDto findByPhone(InviteRequestDto inviteRequestDto) {
        return
                +null ;
    }

    @Override
    public SubscriberDto createNewUser(String senderPhone) {
        return new SubscriberDto();
    }


    @Override
    public Subscriber permision(Long id) {
return null;
    }
}
