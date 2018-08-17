import React from "react";
import withStyles from "@material-ui/core/styles/withStyles";
// core components
import Typography from '@material-ui/core/Typography';
import GridContainer from "components/Grid/GridContainer.jsx";
import GridItem from "components/Grid/GridItem.jsx";

import articleStyle from "assets/jss/material-kit-react/views/homeSections/articleStyle.jsx";

class SectionCarousel extends React.Component {
    render() {
        const {classes} = this.props;
        return (
                <GridContainer justify="center" className={classes.sections}>
                    <GridItem xs={8} sm={8} md={8}>
                        <Typography variant="title" component="h4" className={classes.title}>
                            GitHub 十年，感谢有你
                        </Typography>
                        <Typography component="p">
                            十年前，GitHub 正式上线。初衷何其简单：连接开发者，通过 Git 更好开展项目。过去十年，我们已经成为一家公司、一个平台，慢慢壮大，但是初衷从未变过。并不是一个好点子或者什么大事件 ...
                        </Typography>
                    </GridItem>
                    <GridItem xs={4} sm={4} md={4}>
                    </GridItem>
                </GridContainer>
        );
    }
}

export default withStyles(articleStyle)(SectionCarousel);
