import React from "react";
import "./Header.css";

const Header = () => {
  return (
    <div className="header">
      <h1 href="/">Hyoja Ball</h1>
      <div className="nav">
        <div className="team_name">
          <a>Home &nbsp;</a>
          <a> 두산 &nbsp;</a>
          <a> 삼성 &nbsp;</a>
          <a> 롯데 &nbsp;</a>
          <a> 키움 &nbsp;</a>
          <a> 기아 &nbsp;</a>
          <a> KT &nbsp;</a>
          <a> LG &nbsp;</a>
          <a> NC &nbsp;</a>
          <a> SK &nbsp;</a>
        </div>
      </div>
    </div>
  );
};

export default Header;
