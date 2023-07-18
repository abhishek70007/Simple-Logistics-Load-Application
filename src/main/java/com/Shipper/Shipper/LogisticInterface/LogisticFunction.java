package com.LiveasyLogistic.LiveasyLogistic.LogisticInterface;

import java.util.List;
//import java.util.UUID;

import com.LiveasyLogistic.LiveasyLogistic.loadData.load;

public interface LogisticFunction {
	
	public List<load> fetchAllLoads();
	public load fetchALoad(long loadId);
	public List<load> fetchALoadByShipperId(String shipperID);
	public boolean addALoad(load l);
	public load updateALoad(long id , load l);
	public boolean deleteALoad(long loadId);
	
}
