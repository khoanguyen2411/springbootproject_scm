package com.khoa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.springboot.entity.TruckInformation;
import com.khoa.springboot.repository.TruckInformationRepository;


@Service("truckInformationService")
public class TruckInformationService {
    @Autowired
    private TruckInformationRepository truckInformationRepository;

    public TruckInformation getById(Long id) {
        return truckInformationRepository.findById(id).orElse(null);
    }


    public List<TruckInformation> getAll() {
        return truckInformationRepository.findAll();
    }

    public TruckInformation save(TruckInformation data) {
        return truckInformationRepository.save(data);
    }

    public TruckInformation update(Long id, TruckInformation data) {
    	TruckInformation old  = truckInformationRepository.findById(id).orElse(null);
        return truckInformationRepository.save(data);
    }

    public Boolean delete (Long id) {
    	TruckInformation del = truckInformationRepository.findById(id).orElse(null);
        if(del != null) {
        	truckInformationRepository.delete(del);
            return true;
        }
        return false;
    }
}