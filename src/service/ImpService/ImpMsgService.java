package service.ImpService;

import dao.DaoFatory;
import dao.IDao.IMsgDao;
import dao.pojo.Message;
import service.IService.IMsgService;

import java.util.List;

/**
 * Created by yuzhiyun on 2016-10-10.
 */
public class ImpMsgService implements IMsgService {

    IMsgDao iMsgDao;
    @Override
    public void save(Message msg) {
        iMsgDao= DaoFatory.getMsgDao();
        iMsgDao.save(msg);
    }

    @Override
    public List findAll() {
        iMsgDao= DaoFatory.getMsgDao();
        List list=iMsgDao.findAll();
        return list;
    }
}
