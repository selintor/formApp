package com.selin.formapp.service;

import com.selin.formapp.createWindow.entities.Create;

import java.util.List;

public interface FormService {
    public Create saveForm(Create create);
    public List<Create> getAllForms();
}
