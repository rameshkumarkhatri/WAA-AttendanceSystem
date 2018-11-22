package edu.mum.waa.tmattendanceservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.mum.waa.tmattendanceservice.domain.AcademicCalendar;

@Repository
public interface AcademicCalendarRepository extends MongoRepository<AcademicCalendar, String> {

}
