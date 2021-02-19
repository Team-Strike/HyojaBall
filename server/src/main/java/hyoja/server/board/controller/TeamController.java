package hyoja.server.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
import hyoja.server.board.domain.TeamVO;
import hyoja.server.board.service.TeamService;
 
@Controller
public class TeamController {
 
    @Resource(name="hyoja.server.board.service.TeamService")
    TeamService mTeamService;
    
    @RequestMapping("/list") //팀 리스트 화면 호출  
    private String teamList(Model model) throws Exception{
        
        model.addAttribute("teamlist", mTeamService.teamListService());
        
        return "teamlist"; //생성할 jsp
    }
    
    @RequestMapping("/detail/{tno}") 
    private String teamDetail(@PathVariable int tno, Model model) throws Exception{
        
        model.addAttribute("teamdetail", mTeamService.teamDetailService(tno));
        
        return "teamdetail";
    }
    
}
