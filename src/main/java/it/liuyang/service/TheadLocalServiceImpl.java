package it.liuyang.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Victor
 * @date 2017年08月02日 23:24
 */
@Service
public class TheadLocalServiceImpl implements TheadLocalService {

    private final static ThreadLocal<TairService> currentThread = new ThreadLocal<>();

    @Resource(name = "mdbTairServiceImpl")
    private TairService mdbTairService;

    @Resource(name = "rdbTairServiceImpl")
    private TairService rdbTairService;

    @Resource(name = "ldbTairServiceImpl")
    private TairService ldbTairService;

    @Override
    public void setTairService(String node) {
        if ("mdb".equals(node)) {
            currentThread.set(mdbTairService);
        } else if ("rdb".equals(node)) {
            currentThread.set(rdbTairService);
        } else {
            currentThread.set(ldbTairService);
        }
    }

    @Override
    public TairService getTairService() {
        return currentThread.get();
    }


}
