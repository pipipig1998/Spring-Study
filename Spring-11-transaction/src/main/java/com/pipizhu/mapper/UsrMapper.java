package com.pipizhu.mapper;

import com.pipizhu.pojo.Usr;

import java.util.List;

public interface UsrMapper {
    public List<Usr> selectUsr();
    public int addUsr(Usr usr);
    public int deleteUsr(String id);
}
