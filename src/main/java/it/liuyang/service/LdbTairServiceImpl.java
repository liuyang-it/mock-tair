package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * @author Victor
 * @date 2017年08月02日 23:24
 */
@Service("ldbTairServiceImpl")
public class LdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke ldb tair service.");
        return "Hello Ldb Tair Service.";
    }

}
