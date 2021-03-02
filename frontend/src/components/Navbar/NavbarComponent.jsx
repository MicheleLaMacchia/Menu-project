import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";
import "./NavbarComponent.css";

const NavbarComponent = () => {
  return (
    <Navbar bg="info" expand="md">
      <Navbar.Brand href="home">MENU</Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
          <Nav.Link href="antipasti">Antipasti</Nav.Link>
          <Nav.Link href="primi">Primi</Nav.Link>
          <Nav.Link href="secondi">Secondi</Nav.Link>
          <Nav.Link href="contorni">Contorni</Nav.Link>
          <Nav.Link href="dolci">Dolci</Nav.Link>
          <Nav.Link href="bevande">Bevande</Nav.Link>
        </Nav>
      </Navbar.Collapse>
    </Navbar>
  );
};

export default NavbarComponent;
