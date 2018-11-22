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

import edu.mum.waa.tmattendanceservice.domain.Entry;
import edu.mum.waa.tmattendanceservice.service.EntryService;

@RestController
@RequestMapping("/entry")
public class EntryController {
	@Autowired
	EntryService entryService;

	@PostMapping("/create")
	public ResponseEntity<Entry> createEntry(@RequestBody Entry entry) {
		return new ResponseEntity<Entry>(entryService.createEntry(entry), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Entry> getEntry(@PathVariable("sid") String entryId) {
		return new ResponseEntity<Entry>(entryService.readEntry(entryId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Entry> updateEntry(@RequestBody Entry entry) {
		return new ResponseEntity<Entry>(entryService.updateEntry(entry), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Entry> deleteEntry(@PathVariable("sid") String entryId) {
		return new ResponseEntity<Entry>(entryService.deleteEntry(entryId), HttpStatus.OK);
	}
}
