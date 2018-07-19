package com.nishant.firealaram.repo;

import com.nishant.firealaram.entity.Alaram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlaramRepo extends JpaRepository<Alaram,String> {
}
