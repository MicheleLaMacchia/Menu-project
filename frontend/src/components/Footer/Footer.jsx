import insalata from "../../images/insalata.jpg";
import pizzaMargherita from "../../images/pizza-margherita.jpg";
import spaghettiPomodoro from "../../images/spaghetti-pomodoro.jpg";
import "./Footer.css";

const Footer = () => {
  return (
    <div className="footer-pics-line">
      <img className="footer-pic" src={insalata} alt="insalata" />
      <img className="footer-pic" src={pizzaMargherita} alt="insalata" />
      <img className="footer-pic" src={spaghettiPomodoro} alt="insalata" />
    </div>
  );
};

export default Footer;
