package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.Block;
import edu.mum.waa.tmattendanceservice.repository.BlockRepository;
import edu.mum.waa.tmattendanceservice.service.BlockService;

@Service
public class BlockServiceImpl implements BlockService {

	@Autowired
	BlockRepository blockRepository;

	@Override
	public Block createBlock(Block block) {
		return blockRepository.save(block);
	}

	@Override
	public Block readBlock(String blockId) {
		return blockRepository.findById(blockId).get();
	}

	@Override
	public Block updateBlock(Block block) {
		return blockRepository.save(block);
	}

	@Override
	public Block deleteBlock(String blockId) {
		Block block = readBlock(blockId);
		blockRepository.delete(block);
		return block;
	}

}
