package com.club.subject.domain.convert;

import com.club.subject.domain.entity.SubjectLabelBO;
import com.club.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectLabelConverter {

    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO);
}
