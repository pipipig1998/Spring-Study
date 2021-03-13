package com.pipizhu.dao;

import com.pipizhu.pojo.Usr;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UsrMapperImpl implements UsrMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Usr> selectUsr() {
        UsrMapper mapper = sqlSession.getMapper(UsrMapper.class);
        List<Usr> usrs = mapper.selectUsr();
        return usrs;
    }
}
