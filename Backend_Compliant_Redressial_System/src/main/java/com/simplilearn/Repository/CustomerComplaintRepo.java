package com.simplilearn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.CustomerComplaint;

public interface CustomerComplaintRepo extends JpaRepository<CustomerComplaint, Integer>{

}
