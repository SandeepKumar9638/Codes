package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Applications;
import com.example.demo.repo.ApplicationsRepository;

@Service
public class ApplicationsService {
@Autowired
ApplicationsRepository arepo;

public Applications posting(Applications app) {
	return arepo.save(app);
}

public List<Applications> getapps() {
	List<Applications> applist = new ArrayList<Applications>();
	arepo.findAll().forEach(app -> applist.add(app));
	return applist;
}

public Applications getappsid(long id) {
	Applications apps = arepo.findById(id);
	
	return apps;
}

public Applications putapps(Applications app) {
	return arepo.save(app);
}

public Applications putappsid(Applications app, long id) {
	Applications x = arepo.findById(id);
	if (x != null) {
		x.setName(app.getName());
		return arepo.save(x);
	}
	return null;
}

public String deleteapps(long id) {
	Applications y = arepo.findById(id);
	if( y != null) {
		arepo.delete(y);
		return "deleted";
	}
	else {
	return "Cannot find the id ";
}
}


}
