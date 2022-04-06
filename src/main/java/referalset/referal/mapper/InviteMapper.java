package referalset.referal.mapper;

import referalset.referal.models.dtos.InviteRequestDto;
import referalset.referal.models.entites.Invite;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public interface InviteMapper {
    InviteMapper INSTANCE = Mappers.getMapper(InviteMapper.class);

}
