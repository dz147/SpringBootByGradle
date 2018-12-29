package com.dz147.springboot.dao;

import com.dz147.springboot.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsDAO extends JpaRepository<News,Long> {

}
