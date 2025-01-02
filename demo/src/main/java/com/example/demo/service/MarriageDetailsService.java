package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MarriageDetails;
import com.example.demo.repo.MarriageDetailsRepository;

@Service
public class MarriageDetailsService {

	@Autowired
	MarriageDetailsRepository mdrepo;

	public MarriageDetails mdposting(MarriageDetails mddetails) {

		return mdrepo.save(mddetails);
	}

	public List<MarriageDetails> getAllMd() {
		List<MarriageDetails> mdlist = new ArrayList<MarriageDetails>();
		mdrepo.findAll().forEach(mddetails -> mdlist.add(mddetails));

		return mdlist;
	}

	public MarriageDetails getById(long id) {
		MarriageDetails md = mdrepo.findById(id);
		return md;
	}

	public MarriageDetails putById(MarriageDetails mddetails, long id) {
		MarriageDetails mds = mdrepo.findById(id);
		if (mds != null) {
			mds.setBrideAge(mddetails.getBrideAge());
			mds.setBrideName(mddetails.getBrideName());
			return mdrepo.save(mds);
		}
		return null;
	}

	public String deleteById(long id) {
		MarriageDetails md = mdrepo.findById(id);
		if (md != null) {
			mdrepo.delete(md);
			return "deleted";
		} else {
			return "Not deleted";
		}
	}
}
