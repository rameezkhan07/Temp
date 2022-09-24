package com.mindtree.orchard.voterrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchard.voterentity.VoterData;
	
@Repository
public interface VoterRepository extends JpaRepository<VoterData, Integer> {

}
