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

  @RequestMapping(value = "/pitcherbasic/{team}/{season}", method = RequestMethod.GET)
  @ResponseBody
  private List<PitcherbasicVO> pitcherbasicList_team_season(@PathVariable String team, @PathVariable String season,
      Model model) throws Exception {

    List<PitcherbasicVO> pitcherbasicList_team_season = mPitcherbasicService.pitcherbasicList_team_seasonService(team,
        season);

    return pitcherbasicList_team_season;
  }

  @RequestMapping(value = "/pitcherbasic/{team}/{season}/{pbid}", method = RequestMethod.GET)
  @ResponseBody
  private PitcherbasicVO pitcherbasic_team_season_pbid(@PathVariable String team, @PathVariable String season,
      @PathVariable int pbid, Model model) throws Exception {

    PitcherbasicVO pitcherbasic_team_season_pbid = mPitcherbasicService.pitcherbasic_team_season_pbidService(team,
        season, pbid);

    return pitcherbasic_team_season_pbid;
  }

}
