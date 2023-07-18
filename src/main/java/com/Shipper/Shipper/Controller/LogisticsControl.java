package com.LiveasyLogistic.LiveasyLogistic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LiveasyLogistic.LiveasyLogistic.LogisticInterface.LogisticFunction;
import com.LiveasyLogistic.LiveasyLogistic.loadData.load;

@RestController
public class LogisticsControl {
	
	@Autowired
	private LogisticFunction lfunc;
	
	@GetMapping("/load")
	public List<load> getAllLoad(){
		return this.lfunc.fetchAllLoads();
	}
	
	@GetMapping(value = "/load" , params = "shipperId")
	public String getALoadByShipperId(@RequestParam("shipperId") String shipperId) {
	        return "list of loads with this shipperId : \n"+ this.lfunc.fetchALoadByShipperId(shipperId);
	    }
	
	@GetMapping("/load/{loadId}")
	public load getALoad(@PathVariable String loadId) {
		return this.lfunc.fetchALoad(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public String postALoad(@RequestBody load l) {
		boolean x =this.lfunc.addALoad(l);
		if(x==true) {return "Load Details Added Succesfully";}
		return "Error";
	}
	
	@PutMapping("/load/{loadId}")
	public load putALoad(@PathVariable Long loadId, @RequestBody load l) {
		return this.lfunc.updateALoad(loadId, l);
	}
	
	@DeleteMapping("/load/{loadId}")
	public String removeALoad(@PathVariable Long loadId) {
		boolean x = this.lfunc.deleteALoad(loadId);
		if(x==true) {return "Load Deleted Succesfully";}
		return "Error";
	}
}
