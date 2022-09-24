package com.mindtree.orchard.voterinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.orchard.voterentity.VoterData;


@Service
public interface VoterInterface {
	
	public List<VoterData> getAllVehicleData();
	public VoterData getVehicle(Integer id);
	public void addVehicle(VoterData v);
	public void updateVehicle(VoterData v);
	public void deleteVehicle(Integer id);
}
