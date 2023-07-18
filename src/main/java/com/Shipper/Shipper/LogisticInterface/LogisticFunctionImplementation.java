package com.LiveasyLogistic.LiveasyLogistic.LogisticInterface;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveasyLogistic.LiveasyLogistic.DaoLayer.LogisticRepository;
import com.LiveasyLogistic.LiveasyLogistic.loadData.load;

@Service
public class LogisticFunctionImplementation implements LogisticFunction{

	@Autowired
	private LogisticRepository lRepo;
	
	//private LogisticRepository r ;

	@Override
	public List<load> fetchAllLoads() {
		// TODO Auto-generated method stub
		return lRepo.findAll();
	}

	@Override
	public load fetchALoad(long loadId) {
		// TODO Auto-generated method stub
		return lRepo.findById(loadId).get();
	}

	@Override
	public List<load> fetchALoadByShipperId(String shipperID) {
		// TODO Auto-generated method stub
		return lRepo.findAllByShipperId(shipperID);
	}

	@Override
	public boolean addALoad(load l) {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
        String shipperId = "shipper:" + uuid.toString();
        l.setShipperId(shipperId);
        lRepo.save(l);
		return true;
	}

	@Override
	public load updateALoad(long id, load l) {
		// TODO Auto-generated method stub
		load entity =lRepo.findById(id).get();
		l.setLoadId(entity.getLoadId());
		l.setShipperId(entity.getShipperId());
		return lRepo.save(l);
	}

	@Override
	public boolean deleteALoad(long loadId) {
		// TODO Auto-generated method stub
		load entity = lRepo.findById(loadId).get();
		lRepo.delete(entity);
		return true;
	}


}
