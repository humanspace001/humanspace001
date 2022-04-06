package referalset.referal.models.entites;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.core.codec.DataBufferDecoder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "subscribers")
public class Subscriber {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    Long subId;
    String phone;
    boolean active;
    @CreationTimestamp
    LocalDate addDate;
    @UpdateTimestamp
    LocalDate editDate;

}
