package com.cs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.User;


@Repository
public interface BlockRepository extends JpaRepository< Block, Long> {

	@Query(value = "SELECT att FROM Block att WHERE name = ?1")
	public Block findBlockByName(String name);
	
}
