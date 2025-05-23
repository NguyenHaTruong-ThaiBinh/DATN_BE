package com.example.BE_DATN.repository;

import com.example.BE_DATN.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<Type,Long> {
    Optional<Type> findByName(String name);
}
