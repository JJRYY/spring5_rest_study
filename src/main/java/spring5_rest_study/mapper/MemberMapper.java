package spring5_rest_study.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import spring5_rest_study.dto.Member;

@Component
public interface MemberMapper {
	
	List<Member> selectMemberAll();
	Member selectById(Long id);
	int insertMember(Member member);
	int updateMember(Member member);
	int deleteMember(Long id);
}
