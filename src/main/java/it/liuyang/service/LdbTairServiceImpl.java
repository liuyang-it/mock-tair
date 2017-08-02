package it.liuyang.service;

import org.springframework.stereotype.Service;

/**
 * LdbTairServiceImpl:
 *
 * @author LiuYang
 * @date 2017��08��02�� 23:22
 */
@Service("ldbTairServiceImpl")
public class LdbTairServiceImpl implements TairService {

    @Override
    public String invoke() {
        System.out.println("invoke ldb tair service.");
        return "Hello Ldb Tair Service.";
    }

}
