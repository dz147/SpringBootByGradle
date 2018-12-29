package com.dz147.springboot.controller;

import com.dz147.springboot.entity.News;
import com.dz147.springboot.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/news")
    public @ResponseBody
    List<News> selectNewsAll() {
        return newsService.listAllNews();
    }
}
