package com.test.mapper;

import com.test.model.EstimateInfo;
import com.test.model.EstimateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstimateInfoMapper {
    int countByExample(EstimateInfoExample example);

    int deleteByExample(EstimateInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EstimateInfo record);

    int insertSelective(EstimateInfo record);

    List<EstimateInfo> selectByExample(EstimateInfoExample example);

    EstimateInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EstimateInfo record, @Param("example") EstimateInfoExample example);

    int updateByExample(@Param("record") EstimateInfo record, @Param("example") EstimateInfoExample example);

    int updateByPrimaryKeySelective(EstimateInfo record);

    int updateByPrimaryKey(EstimateInfo record);
}