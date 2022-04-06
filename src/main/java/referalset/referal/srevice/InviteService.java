package referalset.referal.srevice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Invite;
import referalset.referal.models.entites.Subscriber;

@Service
public interface InviteService {
    //find by phone
    SubscriberDto findByPhone(InviteRequestDto phone);

    ResponseEntity<?> sendInvite(InviteRequestDto inviteRequestDto);

    ResponseEntity<?> getInvite(Long id);

    Invite invite(InviteRequestDto inviteRequestDto);
    //ResponseEntity<?> getInvite(String inviteCode);
    //ListOff

}
