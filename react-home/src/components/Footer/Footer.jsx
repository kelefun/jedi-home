/*eslint-disable*/
import React from "react";
// nodejs library to set properties for components
import PropTypes from "prop-types";
// nodejs library that concatenates classes
import classNames from "classnames";
import { List, ListItem, withStyles } from "@material-ui/core";

// @material-ui/icons
import Favorite from "@material-ui/icons/Favorite";

import footerStyle from "assets/jss/material-kit-react/components/footerStyle.jsx";

function Footer({ ...props }) {
  const { classes, whiteFont } = props;
  const footerClasses = classNames({
    [classes.footer]: true,
    [classes.footerWhiteFont]: whiteFont
  });
  const aClasses = classNames({
    [classes.a]: true,
    [classes.footerWhiteFont]: whiteFont
  });
  return (
    <footer className={footerClasses}>
      <div className={classes.container}>
        <div className={classes.left}>
          <List className={classes.list}>
            <ListItem className={classes.inlineBlock}>
              <a
                href="/home/aboutus"
                className={classes.block}
                target="_blank"
              >
                关于
              </a>
            </ListItem>
            <ListItem className={classes.inlineBlock}>
              <a
                href="/home/help"
                className={classes.block}
                target="_blank"
              >
              帮助
              </a>
            </ListItem>
            <ListItem className={classes.inlineBlock}>
              <a
                href="/home/license"
                className={classes.block}
                target="_blank"
              >条款
              </a>
            </ListItem>
          </List>
        </div>
        <div className={classes.right}>
          &copy; { new Date().getFullYear()} Create by{" "}
          <a
            href="https://www.github.com/kelefun"
            className={aClasses}
            target="_blank"
          >kelefun
          </a>{" "}
          for a better JAVA world.
        </div>
      </div>
    </footer>
  );
}

Footer.propTypes = {
  classes: PropTypes.object.isRequired,
  whiteFont: PropTypes.bool
};

export default withStyles(footerStyle)(Footer);
