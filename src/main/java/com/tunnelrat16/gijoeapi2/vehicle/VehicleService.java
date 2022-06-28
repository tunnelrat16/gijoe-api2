package com.tunnelrat16.gijoeapi2.vehicle;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
  @Autowired
  private VehicleRepository vehicleRepository;

  public Iterable<Vehicle> list() {
    return vehicleRepository.findAll();
  }

  public Optional<Vehicle> findById(Long id) {
    return vehicleRepository.findById(id);
  }

  public Vehicle create(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }

  public Optional<Vehicle> update(Vehicle vehicle) {
    Optional<Vehicle> foundVehicle = vehicleRepository.findById(vehicle.getId());

    if (foundVehicle.isPresent()) {
      Vehicle updatedVehicle = foundVehicle.get();
      updatedVehicle.setName(vehicle.getName());
      updatedVehicle.setYear(vehicle.getYear());
      updatedVehicle.setTeam(vehicle.getTeam());
      updatedVehicle.setImageUrl(vehicle.getImageUrl());
      updatedVehicle.setAka(vehicle.getAka());
      updatedVehicle.setWatchList(vehicle.getWatchList());
      updatedVehicle.setTotal(vehicle.getTotal());
      updatedVehicle.setNotes(vehicle.getNotes());
      updatedVehicle.setVersion(vehicle.getVersion());
      updatedVehicle.setVariant(vehicle.getVariant());

      vehicleRepository.save(updatedVehicle);
      return Optional.of(updatedVehicle);
    } else {
      return Optional.empty();
    }
  }

  public void deleteById(Long id) {
    vehicleRepository.deleteById(id);
  }
}

