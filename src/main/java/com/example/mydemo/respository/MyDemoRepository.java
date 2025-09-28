package com.example.mydemo.respository;

import com.example.mydemo.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDemoRepository extends JpaRepository<MyEntity, Long> {
}
