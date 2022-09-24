package com.mindtree.orchard.voterimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orchard.voterentity.VoterData;
import com.mindtree.orchard.voterinterface.VoterInterface;
import com.mindtree.orchard.voterrepository.VoterRepository;


@Service
public class VoterImplimentation implements VoterInterface{
	
	@Autowired
	private VoterRepository vehicleRepo;
	
	@Override
	public List<VoterData> getAllVehicleData() {
		// TODO Auto-generated method stub
		return vehicleRepo.findAll();
	}

	@Override
	public VoterData getVehicle(Integer id) {
		// TODO Auto-generated method stub
		return vehicleRepo.findById(id).get() ;
	}

	@Override
	public void addVehicle(VoterData v) {
		// TODO Auto-generated method stub
		vehicleRepo.save(v);
		
	}

	@Override
	public void updateVehicle(VoterData v) {
		// TODO Auto-generated method stub
		vehicleRepo.save(v);
		
	}

	@Override
	public void deleteVehicle(Integer id) {
		// TODO Auto-generated method stub
		vehicleRepo.deleteById(id);
		
	}

}
