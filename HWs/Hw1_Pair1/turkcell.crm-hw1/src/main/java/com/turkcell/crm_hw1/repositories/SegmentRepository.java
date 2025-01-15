package com.turkcell.crm_hw1.repositories;

import com.turkcell.crm_hw1.entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SegmentRepository extends JpaRepository<Segment, String> {
}
