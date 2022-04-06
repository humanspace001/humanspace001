package referalset.referal.srevice;

import org.springframework.http.ResponseEntity;
import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Subscriber;


public interface SubscriberService {
    SubscriberDto findByPhone(InviteRequestDto inviteRequestDto);

    SubscriberDto createNewUser(String senderPhone);
    Subscriber permision(Long id);
}
