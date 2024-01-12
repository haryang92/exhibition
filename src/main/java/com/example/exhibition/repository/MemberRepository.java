package com.example.exhibition.repository;

import com.example.exhibition.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
		Optional<Member> findByEmail(String email);
}

