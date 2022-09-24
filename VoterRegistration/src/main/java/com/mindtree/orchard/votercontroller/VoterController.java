package com.mindtree.orchard.votercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orchard.voterentity.VoterData;
import com.mindtree.orchard.voterimplimentation.VoterImplimentation;
//import com.mindtree.orchard.voterinterface.VoterInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class VoterController {
	
	@Autowired
	VoterImplimentation vehicle;
	
	
	
	@GetMapping("/vehicle")
	public List<VoterData> getAllVehicle(){
		return vehicle.getAllVehicleData();
	}
	
	
	@GetMapping("/vehicle/{id}")
	public VoterData getVehicle(@PathVariable Integer id) {
		return vehicle.getVehicle(id);
	}
	
	@PostMapping("/vehicle")
	public void addVehicle(@RequestBody VoterData v) {
		vehicle.addVehicle(v);
	}
	
	
	@PutMapping("/vehicle/{id}")
	public void update(@RequestBody VoterData v) {
		vehicle.addVehicle(v);
	}
	
	@DeleteMapping("vehicle/{id}")
	public void delete(@PathVariable Integer id) {
		vehicle.deleteVehicle(id);
	}
}
