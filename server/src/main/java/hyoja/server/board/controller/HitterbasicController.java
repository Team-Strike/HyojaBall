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

  @RequestMapping(value = "/hitterbasic/{team}/{season}", method = RequestMethod.GET)
  @ResponseBody
  private List<HitterbasicVO> hitterbasicList_team_season(@PathVariable String team, @PathVariable String season,
      Model model) throws Exception {

    List<HitterbasicVO> hitterbasicList_team_season = mHitterbasicService.hitterbasicList_team_seasonService(team,
        season);

    return hitterbasicList_team_season;
  }

  @RequestMapping(value = "/hitterbasic/{team}/{season}/{hbid}", method = RequestMethod.GET)
  @ResponseBody
  private HitterbasicVO hitterbasic_team_season_hbid(@PathVariable String team, @PathVariable String season,
      @PathVariable int hbid, Model model) throws Exception {

    HitterbasicVO hitterbasic_team_season_hbid = mHitterbasicService.hitterbasic_team_season_hbidService(team, season,
        hbid);

    return hitterbasic_team_season_hbid;
  }
}
