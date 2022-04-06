package referalset.referal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import referalset.referal.models.entites.Invite;
import referalset.referal.models.entites.Subscriber;

@Repository
public interface InviteRepo extends JpaRepository <Invite, Long> {
  Invite findByPhone(String phone);
  @Query(value = "Select Count(sender_id) FROM invites where sender_id = ?1",nativeQuery = true)
  Integer countInviteBySender(Long id, Invite invite);

  @Query(value = "SELECT COUNT(sender_id) FROM invites where sender_id=?1 And receiver_id = ?2", nativeQuery = true)
  Integer countSameSendersAndReceivers(Long id, Long id2, Invite invite);

  Invite findDistinctFirstByReceiverPhone(String phone);
}
