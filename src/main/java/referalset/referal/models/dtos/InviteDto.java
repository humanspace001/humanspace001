package referalset.referal.models.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import referalset.referal.models.enums.InviteStatus;

import java.time.LocalDate;

@Data
@FieldDefaults (level = AccessLevel.PRIVATE)
public class InviteDto {

    Long id;
    String sender ;
    String receiver;
    LocalDate start_date;

    LocalDate end_date;

    InviteStatus inviteStatus;
}
