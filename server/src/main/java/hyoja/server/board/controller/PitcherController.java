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

import hyoja.server.board.domain.PitcherVO;
import hyoja.server.board.service.PitcherService;

@Controller
public class PitcherController {

  @Resource(name = "hyoja.server.board.service.PitcherService")
  PitcherService mPitcherService;

  @RequestMapping(value = "/pitcher", method = RequestMethod.GET)
  @ResponseBody
  private List<PitcherVO> pitcherList(Model model) throws Exception {

    List<PitcherVO> pitcherList = mPitcherService.pitcherListService();

    return pitcherList;
  }

  @RequestMapping(value = "/pitcher/{pno}", method = RequestMethod.GET)
  @ResponseBody
  private PitcherVO pitcherDetail(@PathVariable int pno, Model model) throws Exception {

    PitcherVO pitcherDetail = mPitcherService.pitcherDetailService(pno);

    return pitcherDetail;
  }

}
