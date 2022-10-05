package com.selin.formapp.repos;

import com.selin.formapp.createWindow.entities.Create;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateRepository extends JpaRepository<Create, Long> {
}
