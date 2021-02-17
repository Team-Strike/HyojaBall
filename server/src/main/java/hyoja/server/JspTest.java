package hyoja.server;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hyoja.server.board.mapper.HiterMapper;

@Controller
public class JspTest {

	@Resource(name="hyoja.server.board.mapper.HiterMapper")
  HiterMapper mHiterMapper;


	@RequestMapping("/test")
	private String jspTest() throws Exception{

		//System.out.println(mHiterMapper.hiterCount()); //DB연동 테스트

		return "test"; //생성한 jsp명(test.jsp)
	}
}