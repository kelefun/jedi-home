import React from "react";
import withStyles from "@material-ui/core/styles/withStyles";
// core components
import GridContainer from "components/Grid/GridContainer.jsx";
import GridItem from "components/Grid/GridItem.jsx";
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';

import articleStyle from "assets/jss/material-kit-react/views/componentsSections/articleStyle.jsx";

class SectionCarousel extends React.Component {
    render() {
        const { classes } = this.props;
        return (
            <div className={classes.section}>
                <div className={classes.container}>
                    <GridContainer justify="center">
                        <GridItem xs={12} sm={12} md={8} >
                            <Paper elevation={1}>
                                <Typography variant="headline" component="h3">
                                    This is a sheet of paper.
                                </Typography>
                                <Typography component="p">
                                    Paper can be used to build surface or other elements for your application.
                                </Typography>
                            </Paper>
                        </GridItem>
                    </GridContainer>
                </div>
            </div>
        );
    }
}

export default withStyles(articleStyle)(SectionCarousel);
