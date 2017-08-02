package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * @author Victor
 * @date 2017年08月02日 23:24
 */
@Service("rdbTairServiceImpl")
public class RdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke rdb tair service.");
        return "Hello Rdb Tair Service.";
    }

}
