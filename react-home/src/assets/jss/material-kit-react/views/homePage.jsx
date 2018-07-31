import {container} from "assets/jss/material-kit-react.jsx";

const componentsStyle = {
    container,
    brand: {
        color: "#FFFFFF",
        textAlign: "left"
    },
    title: {
        fontSize: "4.2rem",
        fontWeight: "600",
        display: "inline-block",
        position: "relative"
    },
    subtitle: {
        fontSize: "1.313rem",
        maxWidth: "500px",
        margin: "10px 0 0"
    },
    main: {
        background: "#FFFFFF",
        position: "relative",
        // textAlign: "center",
        zIndex: "3"
    },
    mainRaised: {
        margin: "66px auto",//auto 居中显示
        maxWidth: "1140px",
        borderRadius: "4px",
        boxShadow:
            "0 1px 10px 0px rgba(0, 0, 0, 0.1)"
    },
    link: {
        textDecoration: "none"
    },
    textCenter: {
        textAlign: "center"
    }
};

export default componentsStyle;
