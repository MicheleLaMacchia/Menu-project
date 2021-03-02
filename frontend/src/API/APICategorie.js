import Axios from "axios";
import { API_URL } from "./Constanti";

export const getAllCategories = () => {
  return Axios.get(`${API_URL}/categorie/lista`);
};
