package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.Entry;
import edu.mum.waa.tmattendanceservice.repository.EntryRepository;
import edu.mum.waa.tmattendanceservice.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	EntryRepository entryRepository;

	@Override
	public Entry createEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry readEntry(String entryId) {
		return entryRepository.findById(entryId).get();
	}

	@Override
	public Entry updateEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry deleteEntry(String entryId) {
		Entry entry = readEntry(entryId);
		entryRepository.delete(entry);
		return entry;
	}

}
