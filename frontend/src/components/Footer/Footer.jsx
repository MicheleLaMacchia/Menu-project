import insalata from "../../images/insalata.jpg";
import pizzaMargherita from "../../images/pizza-margherita.jpg";
import spaghettiPomodoro from "../../images/spaghetti-pomodoro.jpg";
import carneGriglia from "../../images/carne-griglia.jpg";
import "./Footer.css";

const Footer = () => {
  return (
    <div className="footer-pics-line">
      <img className="footer-pic" src={insalata} alt="insalata" />
      <img className="footer-pic" src={carneGriglia} alt="carne alla griglia" />
      <img
        className="footer-pic"
        src={pizzaMargherita}
        alt="pizza margherita"
      />
      <img
        className="footer-pic"
        src={spaghettiPomodoro}
        alt="spaghetti al pomodoro"
      />
      <img className="footer-pic" src={insalata} alt="insalata" />
      <img className="footer-pic" src={carneGriglia} alt="carne alla griglia" />
      <img
        className="footer-pic"
        src={pizzaMargherita}
        alt="pizza margherita"
      />
      <img
        className="footer-pic"
        src={spaghettiPomodoro}
        alt="spaghetti al pomodoro"
      />
    </div>
  );
};

export default Footer;
