package referalset.referal.models.entites;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.web.bind.annotation.RequestMapping;
import referalset.referal.models.enums.InviteStatus;

import javax.persistence.*;
import java.util.Date;
@Data

@Entity
@FieldDefaults (level =  AccessLevel.PRIVATE)
@Table (name = "invite")
public class Invite extends AbstractPersistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    @ManyToOne
    @JoinColumn (name = "subscriber_sender_id")
    Subscriber sender;

    @ManyToOne
    @JoinColumn (name = "subscriber_receiver_id")
    Subscriber receiver;

    @CreationTimestamp
    Date start_date;
    Date end_date;
    @Column (name = "status")
@Enumerated (EnumType.STRING)
    InviteStatus inviteStatus;

}
