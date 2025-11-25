package com.example.newCrud;


import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffReposiry extends JpaRepository<Staff,Integer> {
}
