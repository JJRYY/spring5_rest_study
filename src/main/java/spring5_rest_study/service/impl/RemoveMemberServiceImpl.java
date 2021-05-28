package spring5_rest_study.service.impl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mapper.MemberMapper;
import spring5_rest_study.service.RemoveMemberService;

@Service
public class RemoveMemberServiceImpl implements RemoveMemberService {
	static final Log log= LogFactory.getLog(ModifyMemberServiceImpl.class);

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public int removeMember(Member member) {
		log.debug("service - removeMemberByNo() > "+ member);
		return mapper.deleteMember(member);
	}

}