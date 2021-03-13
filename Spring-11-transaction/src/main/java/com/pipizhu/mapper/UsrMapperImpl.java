package com.pipizhu.mapper;

import com.pipizhu.pojo.Usr;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UsrMapperImpl extends SqlSessionDaoSupport implements UsrMapper {
    private SqlSessionTemplate sqlSession;



    @Override
    public List<Usr> selectUsr() {
        List<Usr> usrs = getSqlSession().getMapper(UsrMapper.class).selectUsr();
        addUsr(new Usr("5","下红红","1561"));
        deleteUsr("5");
        return usrs;
    }

    @Override
    public int addUsr(Usr usr) {
        return getSqlSession().getMapper(UsrMapper.class).addUsr(usr);
    }

    @Override
    public int deleteUsr(String id) {
        return  getSqlSession().getMapper(UsrMapper.class).deleteUsr(id);
    }
}
