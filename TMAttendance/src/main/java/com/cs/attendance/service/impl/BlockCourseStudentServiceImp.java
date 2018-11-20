package com.cs.attendance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.StudentCourseBlock;
import com.cs.attendance.domain.User;
import com.cs.attendance.repository.BlockCourseStudentRepository;
import com.cs.attendance.repository.BlockRepository;
import com.cs.attendance.service.BlockCourseStudentService;

@Service
public class BlockCourseStudentServiceImp implements BlockCourseStudentService  {
	
	@Autowired
	BlockCourseStudentRepository bCSRepo;

	@Autowired
	BlockRepository blockRepo;
	
	public StudentCourseBlock findModelByStdBlockIdUserId(String blockName, long studentID) {
		Block block = blockRepo.findBlockByName(blockName);
		
		if(block != null) {
			System.out.println("BLOCK "+block.getName()+" "+block.getId());
			StudentCourseBlock stdCourseBlock  = bCSRepo.get(block.getId(),studentID);
			return stdCourseBlock;
		}
		
		return null;
		
	}

	@Override
	public List<StudentCourseBlock> findModelsByBlockIDAndCourseID(long blockId, long courseID) {
		
		return bCSRepo.getStudentsByBlockIDAndCourseID(blockId, courseID);
	}
	
}
