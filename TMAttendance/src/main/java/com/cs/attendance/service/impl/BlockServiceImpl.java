package com.cs.attendance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.User;
import com.cs.attendance.repository.BlockRepository;
import com.cs.attendance.repository.UserRepository;
import com.cs.attendance.service.BlockService;
import com.cs.attendance.service.UserService;

@Service
//@Transactional
public class BlockServiceImpl implements BlockService{

	
	@Autowired
	BlockRepository repo;

	@Override
	public List<Block> getAll() {
		return repo.findAll();
	}

	@Override
	public Block save(Block block) {
		return repo.save(block);
	}
	

}
