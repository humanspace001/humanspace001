package referalset.referal.models.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import referalset.referal.models.entites.Subscriber;

@Data
@FieldDefaults (level =  AccessLevel.PRIVATE)

public class InviteRequestDto {
    Subscriber receiver; // получатель

}
