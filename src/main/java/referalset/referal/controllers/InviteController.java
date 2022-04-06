package referalset.referal.controllers;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.srevice.InviteService;

@RestController
@RequestMapping("/api/v1/invi")
public class InviteController {

    private final InviteService inviteService;
    public InviteController(InviteService inviteService) {
        this.inviteService = inviteService;
    }

    @PostMapping("/invite")
    public ResponseEntity<?> invite(@RequestBody InviteRequestDto inviteRequestDto) { // принимает данные из формы
        return ResponseEntity.ok(inviteService.invite(inviteRequestDto)); // отправляет данные в сервис
    }

    @PostMapping
    public ResponseEntity <?> sendInvite (@RequestBody InviteRequestDto inviteRequestDto){
        return inviteService.sendInvite(inviteRequestDto);
    }
    @GetMapping("/phone")
    public SubscriberDto findByPhone (@PathVariable InviteRequestDto phone){
        return inviteService.findByPhone(phone);
    }

}
