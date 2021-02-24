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

import hyoja.server.board.domain.PitcherbasicVO;
import hyoja.server.board.service.PitcherbasicService;

@Controller
public class PitcherbasicController {

  @Resource(name = "hyoja.server.board.service.PitcherbasicService")
  PitcherbasicService mPitcherbasicService;

  @RequestMapping(value = "/pitcherbasic", method = RequestMethod.GET)
  @ResponseBody
  private List<PitcherbasicVO> pitcherbasicList(Model model) throws Exception {

    List<PitcherbasicVO> pitcherbasicList = mPitcherbasicService.pitcherbasicListService();

    return pitcherbasicList;
  }

  @RequestMapping(value = "/pitcherbasic/{pbno}", method = RequestMethod.GET)
  @ResponseBody
  private PitcherbasicVO pitcherbasicDetail(@PathVariable int pbno, Model model) throws Exception {

    PitcherbasicVO pitcherbasicDetail = mPitcherbasicService.pitcherbasicDetailService(pbno);

    return pitcherbasicDetail;
  }

}
