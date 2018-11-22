package edu.mum.waa.tmattendanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.waa.tmattendanceservice.domain.Block;
import edu.mum.waa.tmattendanceservice.domain.Course;
import edu.mum.waa.tmattendanceservice.service.BlockService;
import edu.mum.waa.tmattendanceservice.service.CourseService;

@RestController
@RequestMapping("/block")
public class BlockController {
	@Autowired
	BlockService blockService;
	@Autowired
	CourseService courseService;

	@PostMapping("/create/{courseCode}")
	public ResponseEntity<Block> createBlock(@RequestBody Block block, @PathVariable("courseCode") String courseCode) {
		Course course = courseService.readCourse(courseCode);
		block.setCourse(course);
		return new ResponseEntity<Block>(blockService.createBlock(block), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Block> getBlock(@PathVariable("sid") String blockId) {
		return new ResponseEntity<Block>(blockService.readBlock(blockId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Block> updateBlock(@RequestBody Block block) {
		return new ResponseEntity<Block>(blockService.updateBlock(block), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Block> deleteBlock(@PathVariable("sid") String blockId) {
		return new ResponseEntity<Block>(blockService.deleteBlock(blockId), HttpStatus.OK);
	}
}
