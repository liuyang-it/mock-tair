package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * @author Victor
 * @date 2017年08月02日 23:24
 */
@Service("mdbTairServiceImpl")
public class MdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke mdb tair service.");
        return "Hello Mdb Tair Service.";
    }

}
