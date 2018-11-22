package com.cs.attendance.service;

import java.util.List;

import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.User;

public interface BlockService {
	
	public List<Block> getAll();
	public Block save(Block user);
}
