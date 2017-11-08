package kr.or.dgit.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserPicDao;
import kr.or.dgit.mybatis_dev.dao.UserPicDaoImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class UserPicService {
    private static final UserPicService instance = new UserPicService();

    private UserPicService(){}

    public static UserPicService getInstance() {
        return instance;
    }

    public int createUserPic(UserPic userPic) {
        int res = -1;
        try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
        	UserPicDao usePicDao = new UserPicDaoImpl(sqlSession);
            res = usePicDao.insertUserPic(userPic);
            sqlSession.commit();
        } 
        return res;
    }

    public UserPic getUserPic(int id) {
        try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            UserPicDao usePicDao = new UserPicDaoImpl(sqlSession);
            return usePicDao.getUserPic(id);
        }
    }

}
