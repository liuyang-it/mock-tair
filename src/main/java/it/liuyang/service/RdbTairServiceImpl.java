package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * RdbTairServiceImpl:
 *
 * @author LiuYang
 * @date 2017��08��02�� 23:21
 */
@Service("rdbTairServiceImpl")
public class RdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke rdb tair service.");
        return "Hello Rdb Tair Service.";
    }

}