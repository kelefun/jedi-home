import { container, title } from "assets/jss/material-kit-react.jsx";

const articleStyle = {
  sections: {
    padding: "10px 15px"
  },
  container,
  title: {
    ...title,
    marginTop: "15px",
    minHeight: "30px",
    textDecoration: "none"
  },
  space50: {
    height: "50px",
    display: "block"
  },
  space70: {
    height: "70px",
    display: "block"
  },
  icons: {
    width: "17px",
    height: "17px",
    color: "#FFFFFF"
  },
};

export default articleStyle;
