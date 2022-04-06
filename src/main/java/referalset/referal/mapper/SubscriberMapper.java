package referalset.referal.mapper;

import org.mapstruct.factory.Mappers;
import referalset.referal.models.dtos.SubscriberDto;
import referalset.referal.models.entites.Subscriber;

public interface SubscriberMapper {
    SubscriberMapper INSTANCE = Mappers.getMapper(SubscriberMapper.class);
Subscriber subPhoneToSubscriber(SubscriberDto subPhone);
Subscriber subscriberToSubscriber(SubscriberDto subscriber);
}
