package com.example.demo.repository;

import com.example.demo.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {

}
