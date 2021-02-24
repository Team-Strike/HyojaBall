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

import hyoja.server.board.domain.HitterVO;
import hyoja.server.board.service.HitterService;

@Controller
public class HitterController {

  @Resource(name = "hyoja.server.board.service.HitterService")
  HitterService mHitterService;

  @RequestMapping(value = "/hitter", method = RequestMethod.GET)
  @ResponseBody
  private List<HitterVO> hitterList(Model model) throws Exception {

    List<HitterVO> hitterList = mHitterService.hitterListService();

    return hitterList;
  }

  @RequestMapping(value = "/hitter/{hno}", method = RequestMethod.GET)
  @ResponseBody
  private HitterVO hitterDetail(@PathVariable int hno, Model model) throws Exception {

    HitterVO hitterDetail = mHitterService.hitterDetailService(hno);

    return hitterDetail;
  }

}
