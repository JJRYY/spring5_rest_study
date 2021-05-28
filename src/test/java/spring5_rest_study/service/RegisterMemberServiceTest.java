package spring5_rest_study.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@WebAppConfiguration
public class RegisterMemberServiceTest {
	protected static final Log log = LogFactory.getLog(RegisterMemberServiceTest.class);
	
	@Autowired
	private RegisterMemberService service;
	
	@Autowired
	private RemoveMemberService remService;
	
	@Test
	public void testRegisterMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member newMember = new Member("test400@test.co.kr", "1111", "test400");
		
		int res = service.registerMember(newMember);
		Assert.assertEquals(1, res);
		
		log.debug("res > " + res);
		remService.removeMember(newMember.getId());
	}

}
