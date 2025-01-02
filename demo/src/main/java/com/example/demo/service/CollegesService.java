package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Colleges;
import com.example.demo.repo.CollegesRepository;

@Service

public class CollegesService {

	@Autowired
	CollegesRepository crepo;

	public Colleges postcolleges(Colleges colleges) {
		
		return crepo.save(colleges);
	}

	public List<Colleges> getcollegs() {
		//List<Colleges> coll = new ArrayList<Colleges>();
		return crepo.findAll();//.forEach(college -> coll.add(college));
		// coll;
	}

	public Colleges getById(long collegeId) {
		return crepo.findByCollegeId(collegeId);
	}

	public Colleges putcolleges( Colleges colleges ,long collegeId) {
		Colleges x = crepo.findByCollegeId(collegeId);
		if ( x!= null) {
			x.setRanking(colleges.getRanking());
			x.setUniversity(colleges.getUniversity());
			return crepo.save(x);
		}
		return null;
	}

	public String  deleteColleges( long collegeId) {
		Colleges y = crepo.findByCollegeId(collegeId);
		if( y!=null) {
			crepo.delete(y);
			return "Deleted";
		}
		else {
			return "cant delete";
		}
	}

	
}
