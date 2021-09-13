package com.cpu_makes.folder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpu_makes.folder.Entity.CustomizeCpuDetails;


@Repository
public interface CustomizeCpuDetailsRepo extends JpaRepository<CustomizeCpuDetails, Integer>{

}
