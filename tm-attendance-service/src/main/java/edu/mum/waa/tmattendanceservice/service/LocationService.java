package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Location;

public interface LocationService {
	Location createLocation(Location location);

	Location readLocation(String locationId);

	Location updateLocation(Location location);

	Location deleteLocation(String locationId);
}
