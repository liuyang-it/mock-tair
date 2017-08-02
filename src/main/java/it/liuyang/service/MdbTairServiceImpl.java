package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * MdbTairServiceImpl:
 *
 * @author LiuYang
 * @date 2017��08��02�� 23:20
 */
@Service("mdbTairServiceImpl")
public class MdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke mdb tair service.");
        return "Hello Mdb Tair Service.";
    }

}
