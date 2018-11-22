package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Entry;

public interface EntryService {
	Entry createEntry(Entry entry);

	Entry readEntry(String entryId);

	Entry updateEntry(Entry entry);

	Entry deleteEntry(String entryId);
}
