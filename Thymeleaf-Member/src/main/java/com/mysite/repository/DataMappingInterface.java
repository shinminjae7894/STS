package com.mysite.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mysite.domain.Member;

@Mapper
public interface DataMappingInterface {
	@Select("select * from boot_mem") //select 태그대신 어노테이션 사용, mapper 필요없음
	List<Member> getSelectAll();
	
	@Insert("INSERT INTO boot_mem(num, name, addr) VALUES (#{num}, #{name}, #{addr})")
	int insertMember(Member mem); 
			
	@Delete("DELETE FROM boot_mem WHERE num = #{num}")
	int deleteMember(int num);
	
	@Update("UPDATE boot_mem SET name = #{name}, addr = #{addr} WHERE num = #{num}")
	int updateData(Member member);
}
