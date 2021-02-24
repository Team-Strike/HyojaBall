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

import hyoja.server.board.domain.PitchermainVO;
import hyoja.server.board.service.PitchermainService;

@Controller
public class PitchermainController {

  @Resource(name = "hyoja.server.board.service.PitchermainService")
  PitchermainService mPitchermainService;

  @RequestMapping(value = "/pitchermain", method = RequestMethod.GET)
  @ResponseBody
  private List<PitchermainVO> pitchermainList(Model model) throws Exception {

    List<PitchermainVO> pitchermainList = mPitchermainService.pitchermainListService();

    return pitchermainList;
  }

  @RequestMapping(value = "/pitchermain/{pmno}", method = RequestMethod.GET)
  @ResponseBody
  private PitchermainVO pitchermainDetail(@PathVariable int pmno, Model model) throws Exception {

    PitchermainVO pitchermainDetail = mPitchermainService.pitchermainDetailService(pmno);

    return pitchermainDetail;
  }

}
