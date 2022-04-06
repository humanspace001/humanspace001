package referalset.referal.models.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@FieldDefaults (level = AccessLevel.PRIVATE)
public class SubscriberDto extends InviteDto {
    Long subId;
    String phone;
    boolean active;
    Date addDate;
    Date editDate;

}
