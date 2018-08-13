import React from "react";
import withStyles from "@material-ui/core/styles/withStyles";
import classNames from "classnames";

import Header from "components/Header/Header.jsx";
import Footer from "components/Footer/Footer.jsx";
import GridContainer from "components/Grid/GridContainer.jsx";
import GridItem from "components/Grid/GridItem.jsx";
import SectionCarousel from "./section/Carousel.jsx";
import SectionArticle from "./section/Article";
import Divider from '@material-ui/core/Divider';
import Button from 'components/CustomButtons/Button.jsx';
// sections for this page
import HeaderLinks from "components/Header/HeaderLinks.jsx";

import homeStyle from "assets/jss/material-kit-react/views/homePage.jsx";

class HomePage extends React.Component {
    render() {
        const {classes} = this.props;
        return (
            <div>
                <Header
                    brand="JEDI"
                    rightLinks={<HeaderLinks/>}
                    fixed={true}
                />
                <div className={classNames(classes.main, classes.mainRaised)}>
                    <GridContainer justify="center">
                        <GridItem xs={8} sm={8} md={8}>
                            <SectionCarousel/>
                            <Divider/>
                        </GridItem>
                        <GridItem xs={4} sm={4} md={4}>
                            <Button color="primary">支持 联系</Button>
                        </GridItem>
                    </GridContainer>
                    <SectionArticle/>
                </div>
                {/*main结束*/}
                <Footer/>

            </div>
        );
    }
}

export default withStyles(homeStyle)(HomePage);
