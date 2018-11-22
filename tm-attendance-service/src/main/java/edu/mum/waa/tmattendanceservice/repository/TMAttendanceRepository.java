package edu.mum.waa.tmattendanceservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;


@Repository
public interface TMAttendanceRepository extends CrudRepository<TMAttendance, Long> {

	TMAttendance findByStudent(Student student);


}
