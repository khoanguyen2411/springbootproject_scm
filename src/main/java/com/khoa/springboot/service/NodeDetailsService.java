package com.khoa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.springboot.entity.NodeDetails;
import com.khoa.springboot.repository.NodeDetailsRepository;



@Service("NodeDetailsService")
public class NodeDetailsService {
    @Autowired
    private NodeDetailsRepository nodeDetailsRepository;

    public NodeDetails getById(Long id) {
        return nodeDetailsRepository.findById(id).orElse(null);
    }


    public List<NodeDetails> getAll() {
        return nodeDetailsRepository.findAll();
    }

    public NodeDetails save(NodeDetails data) {
        return nodeDetailsRepository.save(data);
    }

    public NodeDetails update(Long id, NodeDetails data) {
    	NodeDetails old  = nodeDetailsRepository.findById(id).orElse(null);
        return nodeDetailsRepository.save(data);
    }

    public Boolean delete (Long id) {
    	NodeDetails del = nodeDetailsRepository.findById(id).orElse(null);
        if(del != null) {
        	nodeDetailsRepository.delete(del);
            return true;
        }
        return false;
    }
}