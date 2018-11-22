package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.Location;
import edu.mum.waa.tmattendanceservice.repository.LocationRepository;
import edu.mum.waa.tmattendanceservice.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location createLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location readLocation(String locationId) {
		return locationRepository.findById(locationId).get();
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location deleteLocation(String locationId) {
		Location location = readLocation(locationId);
		locationRepository.delete(location);
		return location;
	}

}
