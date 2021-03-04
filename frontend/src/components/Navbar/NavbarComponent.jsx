import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";
import "./NavbarComponent.css";
import { useEffect, useState } from "react";
import { getAllCategories } from "../../API/APICategorie";

const NavbarComponent = () => {
  const [categorie, setCategorie] = useState([]);

  useEffect(() => {
    getAllCategories().then((res) => {
      setCategorie(res.data.categorie);
    });
  }, []);

  return (
    <Navbar bg="info" expand="md">
      <Navbar.Brand href="home">MENU</Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
          {categorie.map((cat) => {
            return (
              <Nav.Link key={cat.id} href={cat.link}>
                {cat.nome}
              </Nav.Link>
            );
          })}
        </Nav>
      </Navbar.Collapse>
    </Navbar>
  );
};

export default NavbarComponent;
