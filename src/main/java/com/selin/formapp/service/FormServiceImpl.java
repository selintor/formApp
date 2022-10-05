package com.selin.formapp.service;

import com.selin.formapp.createWindow.entities.Create;
import com.selin.formapp.repos.CreateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService{
    @Autowired
    private  CreateRepository createRepository;
    @Override
    public Create saveForm(Create create) {
        return createRepository.save(create);
    }
    @Override
    public List<Create> getAllForms() {
        return createRepository.findAll();
    }
}
