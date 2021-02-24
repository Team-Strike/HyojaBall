package hyoja.server.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hyoja.server.board.domain.HitterbasicVO;
import hyoja.server.board.service.HitterbasicService;

@Controller
public class HitterbasicController {

  @Resource(name = "hyoja.server.board.service.HitterbasicService")
  HitterbasicService mHitterbasicService;

  @RequestMapping(value = "/hitterbasic", method = RequestMethod.GET)
  @ResponseBody
  private List<HitterbasicVO> hitterbasicList(Model model) throws Exception {

    List<HitterbasicVO> hitterbasicList = mHitterbasicService.hitterbasicListService();

    return hitterbasicList;
  }

  @RequestMapping(value = "/hitterbasic/{hbno}", method = RequestMethod.GET)
  @ResponseBody
  private HitterbasicVO hitterbasicDetail(@PathVariable int hbno, Model model) throws Exception {

    HitterbasicVO hitterbasicDetail = mHitterbasicService.hitterbasicDetailService(hbno);

    return hitterbasicDetail;
  }

}
