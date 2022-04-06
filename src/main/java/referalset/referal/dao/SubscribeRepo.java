package referalset.referal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import referalset.referal.models.entites.Subscriber;

@Repository
public interface SubscribeRepo extends JpaRepository <Subscriber, Long> {
    Subscriber findByPhoneContains(String phone);
    Subscriber findByPhone(String phone);

}
