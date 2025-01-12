package com.dao;

import com.entity.JingpaidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingpaidingdanVO;
import com.entity.view.JingpaidingdanView;


/**
 * 竞拍订单
 * 
 * @author 
 * @email 
 * @date 2022-05-22 11:53:03
 */
public interface JingpaidingdanDao extends BaseMapper<JingpaidingdanEntity> {
	
	List<JingpaidingdanVO> selectListVO(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
	
	JingpaidingdanVO selectVO(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
	
	List<JingpaidingdanView> selectListView(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);

	List<JingpaidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
	
	JingpaidingdanView selectView(@Param("ew") Wrapper<JingpaidingdanEntity> wrapper);
	

}
