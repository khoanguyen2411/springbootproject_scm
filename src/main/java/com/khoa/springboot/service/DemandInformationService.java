package com.khoa.springboot.service;

import com.khoa.springboot.entity.DemandInformation;
import com.khoa.springboot.repository.DemandInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("demandInformationService")
public class DemandInformationService {
    @Autowired
    private DemandInformationRepository demandInformationRepository;

    public DemandInformation getById(Long id) {
        return demandInformationRepository.findById(id).orElse(null);
    }


    public List<DemandInformation> getAll() {
        return demandInformationRepository.findAll();
    }

    public DemandInformation save(DemandInformation data) {
        return demandInformationRepository.save(data);
    }

    public DemandInformation update(Long id, DemandInformation data) {
    	DemandInformation old  = demandInformationRepository.findById(id).orElse(null);
        return demandInformationRepository.save(data);
    }

    public Boolean delete (Long id) {
    	DemandInformation del = demandInformationRepository.findById(id).orElse(null);
        if(del != null) {
        	demandInformationRepository.delete(del);
            return true;
        }
        return false;
    }
}