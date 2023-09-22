package com.example.lesson02.Mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.domain.UsedGoods;

@Repository
public interface UsedGoodsMapper {
	// input(BO) 서비스가 요청하는 것 : X
	// output(Bo-service 결과 돌려줌) : List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
	// mybatis가 이어줌 최종적으로 list에 담아줌
	
	
}
