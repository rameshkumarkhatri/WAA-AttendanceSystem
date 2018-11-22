package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Block;

public interface BlockService {
	Block createBlock(Block block);

	Block readBlock(String blockId);

	Block updateBlock(Block block);

	Block deleteBlock(String blockId);
}
