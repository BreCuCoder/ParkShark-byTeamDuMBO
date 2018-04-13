package be.dumbo.switchfully.parkshark.api.division;

import be.dumbo.switchfully.parkshark.domain.division.Division;
import be.dumbo.switchfully.parkshark.infrastructure.dto.Mapper;

import static be.dumbo.switchfully.parkshark.api.division.DivisionDto.divisionDto;

public class DivisionMapper extends Mapper<DivisionDto,Division> {


    @Override
    public DivisionDto toDto(Division division) {
        return divisionDto()
                .withId(division.getId())
                .withOriginalName(division.getOriginalName())
                .withName(division.getName())
                .withDirector(division.getDirector())
                .withParentDivision(division.getParentDivision());
    }

    @Override
    public Division toDomain(DivisionDto divisionDto) {
        return null;
    }
}