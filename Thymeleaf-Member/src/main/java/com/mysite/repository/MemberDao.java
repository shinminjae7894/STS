//package com.mysite.repository;
//
//import java.util.List;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.mysite.domain.Member;
//
//@Repository
//public class MemberDao {
//	//@Autowired //자동으로 setter매서드를 만들어서 주입 해줌
//	//private SqlSessionTemplate sqlSession;
//	
//	@Autowired
//	private DataMappingInterface dataInterface;
//	
//	public List<Member> getSelectAll(){
//		//return sqlSession.selectList("com.mysite.memberMapper.selectAll");
//		return dataInterface.getSelectAll();
//	}
//	
//	
//	public boolean insert(Member member) {
//		/*
//		try {
//			int result = sqlSession.insert("com.mysite.memberMapper.insert", member);
//			if (result > 0) {
//				return true;
//			} else {
//				return false;
//			}
//		} catch (Exception err) {
//			return false;
//		}
//		*/
//		try {
//			int result = dataInterface.insertMember(member);
//			if (result > 0) {
//				return true;
//			} else {
//				return false;
//			}
//		} catch (Exception err) {
//			return false;
//		}
//
//	}
//	
//	
//	public int deleteData(3) {
//		
//		return sqlSession.delete("com.mysite.memberMapper.delete", 3);
//		
//		
////		int result  = dataInterface.deleteMember(num);
//	}
//	
//	/*
//	public void updateData(Member member) {
//		sqlSession.update("com.mysite.memberMapper.update", member);
//	}
//	*/
//	
//	//반환값 LiST<MEMBER>
//	// <select id="selectAll" resultType="Member">
////		SELECT * FROM boot_mem
////		</select>
//	//
//	//BOOT_MEM에 있는 테이블들이 호출되겠지?
//	//
//}
