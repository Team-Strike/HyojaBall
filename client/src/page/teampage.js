import React from "react";
import "./teampage.css";

const Teampage = () => {
  return (
    <div className="teampage">
      <br />
      <br />
      <div className="team_info">Team_info</div>
      <br />
      <br />
      <div className="team_option">
        <a>타자 |</a>
        <a> 투수</a>
        <select className="team_year" name="year">
          <option value="2020" selected="selected">
            2020
          </option>
          <option value="2019">2019</option>
          <option value="2018">2018</option>
          <option value="2017">2017</option>
          <option value="2016">2016</option>
          <option value="2015">2015</option>
          <option value="2014">2014</option>
        </select>
      </div>
      <div className="team_player">team</div>
    </div>
  );
};

export default Teampage;
