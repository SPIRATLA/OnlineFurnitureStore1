package com.Repository;
import com.Entity.*; 
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserManagementRepository extends JpaRepository<FurnitureUser, Integer> {

}
