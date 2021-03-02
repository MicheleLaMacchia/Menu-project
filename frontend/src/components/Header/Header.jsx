import colonneGreche from "../../images/colonne-greche.jpg";
import "./Header.css";

const Header = () => {
  return (
    <div className="header">
      <img className="header-pic" src={colonneGreche} alt="colonne-greche" />
      <img className="header-pic" src={colonneGreche} alt="colonne-greche" />
      RISTORANTE AL PORTICO
      <img className="header-pic" src={colonneGreche} alt="colonne-greche" />
      <img className="header-pic" src={colonneGreche} alt="colonne-greche" />
    </div>
  );
};

export default Header;
