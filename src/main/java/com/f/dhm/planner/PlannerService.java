package com.f.dhm.planner;


import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlannerService {


	@Autowired
	private PlannerRepository repository;

	public List<PlannerVO> plannerSelect(PlannerVO plannerVO) throws Exception {

		return repository.findById("a@a.com");
	}

	
	public void bakTotal(PlannerVO plannerVO) throws Exception{
	  
	  
	
	}
	 
	public void typeUpdate(String type, PlannerVO plannerVO) throws Exception{
		
		//plannerVO.setType(type);	
		
		//@Query(value = "update planner set type=#{type} where id=a@a.com",nativeQuery = true)
		repository.typeUpdate(type);
		
	}
	public int getPlnum() throws Exception{
		List<PlannerVO> list = repository.findAllByOrderByPlStepDesc();
		return	list.get(0).getPlNum()+1;
	}
	
	public int saveList(List<PlannerVO> list) throws Exception{
		list = repository.saveAll(list);
		return list.get(0).getPlNum();
	}
	
	public PlannerVO saveOne(PlannerVO plannerVO) throws Exception{
		return repository.save(plannerVO);
	}

}
