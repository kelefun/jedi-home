import React from "react";
import withStyles from "@material-ui/core/styles/withStyles";
import Header from "components/Header/Header.jsx";
import Footer from "components/Footer/Footer.jsx";
// import GridContainer from "components/Grid/GridContainer.jsx";
// import GridItem from "components/Grid/GridItem.jsx";
import SectionCarousel from "./section/Carousel.jsx";
import SectionArticle from "./section/Article";
import Divider from '@material-ui/core/Divider';

// sections for this page
import HeaderLinks from "components/Header/HeaderLinks.jsx";

import componentsStyle from "assets/jss/material-kit-react/views/components.jsx";

class HomePage extends React.Component {
    render() {
        const { classes } = this.props;
        return (
            <div>
                <Header
                    brand="JEDI"
                    rightLinks={<HeaderLinks />}
                    fixed={true}
                />
                <SectionCarousel />
                <Divider/>
                {/*<SectionArticle/>*/}
                <Footer />
            </div>
        );
    }
}

export default withStyles(componentsStyle)(HomePage);
