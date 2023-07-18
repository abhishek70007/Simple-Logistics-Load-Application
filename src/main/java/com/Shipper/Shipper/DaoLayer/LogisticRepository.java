package com.LiveasyLogistic.LiveasyLogistic.DaoLayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LiveasyLogistic.LiveasyLogistic.loadData.load;
@Repository
public interface LogisticRepository extends JpaRepository<load, Long>{
	List<load> findAllByShipperId(String shipperId);
}
