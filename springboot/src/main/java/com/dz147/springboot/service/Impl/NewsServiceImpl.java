package com.dz147.springboot.service.Impl;


import com.dz147.springboot.dao.NewsDAO;
import com.dz147.springboot.entity.News;
import com.dz147.springboot.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;

    @Override
    @Cacheable("listAllNews")
    public List<News> listAllNews() {
        return newsDAO.findAll();
    }
}
