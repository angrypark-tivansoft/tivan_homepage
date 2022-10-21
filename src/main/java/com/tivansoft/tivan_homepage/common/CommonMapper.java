package com.tivansoft.tivan_homepage.common;

import com.tivansoft.tivan_homepage.common.vo.CommonVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonMapper {

    List<CommonVO> selectHisList() throws Exception;

}


