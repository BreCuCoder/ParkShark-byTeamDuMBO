package be.dumbo.switchfully.parkshark.infrastructure;

//copied from switchfully order solution

public abstract class Mapper<DTO, DOMAIN> {

    public abstract DTO toDto(DOMAIN domainObject);
    public abstract DOMAIN toDomain(DTO dtoObject);

}
