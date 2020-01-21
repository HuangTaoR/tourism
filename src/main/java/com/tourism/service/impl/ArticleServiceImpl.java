package com.tourism.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourism.common.BaseLogger;
import com.tourism.dao.ArticleDao;
import com.tourism.entity.Article;
import com.tourism.service.ArticleService;

@Service
@Transactional
public class ArticleServiceImpl extends BaseLogger implements ArticleService {

    @Resource
    ArticleDao articleDao;

    public List<Article> getAllList() {
        return articleDao.findAll();
    }

    public List<Article> getList(String userId) {
        return articleDao.findByUserId(userId);
    }


}
