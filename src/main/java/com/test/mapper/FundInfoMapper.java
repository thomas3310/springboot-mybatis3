package com.test.mapper;

import com.test.model.FundInfo;
import com.test.model.FundInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundInfoMapper {
    int countByExample(FundInfoExample example);

    int deleteByExample(FundInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FundInfo record);

    int insertSelective(FundInfo record);

    List<FundInfo> selectByExample(FundInfoExample example);

    FundInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FundInfo record, @Param("example") FundInfoExample example);

    int updateByExample(@Param("record") FundInfo record, @Param("example") FundInfoExample example);

    int updateByPrimaryKeySelective(FundInfo record);

    int updateByPrimaryKey(FundInfo record);
}