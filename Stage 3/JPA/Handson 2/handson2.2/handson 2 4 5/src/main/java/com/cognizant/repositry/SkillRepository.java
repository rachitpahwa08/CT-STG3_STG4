package com.cognizant.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
