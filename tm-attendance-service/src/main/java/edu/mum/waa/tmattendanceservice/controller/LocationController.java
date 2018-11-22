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

import edu.mum.waa.tmattendanceservice.domain.Location;
import edu.mum.waa.tmattendanceservice.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	@Autowired
	LocationService locationService;

	@PostMapping("/create")
	public ResponseEntity<Location> createLocation(@RequestBody Location location) {
		return new ResponseEntity<Location>(locationService.createLocation(location), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Location> getLocation(@PathVariable("sid") String locationId) {
		return new ResponseEntity<Location>(locationService.readLocation(locationId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Location> updateLocation(@RequestBody Location location) {
		return new ResponseEntity<Location>(locationService.updateLocation(location), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Location> deleteLocation(@PathVariable("sid") String locationId) {
		return new ResponseEntity<Location>(locationService.deleteLocation(locationId), HttpStatus.OK);
	}

}
