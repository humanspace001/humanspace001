package referalset.referal.srevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import referalset.referal.dao.InviteRepo;
import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Invite;
import referalset.referal.models.entites.Subscriber;
import referalset.referal.srevice.InviteService;
import referalset.referal.srevice.SubscriberService;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Objects;

@Service
public class ServiceInterImpl implements InviteService {

    private final InviteRepo inviteRepo;
    @Autowired
    private  SubscriberService subscriberService;
    public ServiceInterImpl(InviteRepo inviteRepo, SubscriberService subscriberService) { //
        this.inviteRepo = inviteRepo;
    }

//find by phone
    @Override
    public SubscriberDto findByPhone(InviteRequestDto phone) {

        return subscriberService.findByPhone(phone);//
    }

    @Override
    public ResponseEntity<?> sendInvite(InviteRequestDto inviteRequestDto) {
return  ResponseEntity.ok(inviteRepo.save(new Invite()).getId());//
    }

    @Override
    public ResponseEntity<?> getInvite(Long id) {
 Invite invite=inviteRepo.findById(id).orElse(null);
         if (Objects.isNull(invite)) {
             return ResponseEntity.notFound().build();

         }
         return ResponseEntity.ok(invite);
    }



    @Override
    public Invite invite(InviteRequestDto inviteRequestDto) {
        return new Invite();
    }

}

