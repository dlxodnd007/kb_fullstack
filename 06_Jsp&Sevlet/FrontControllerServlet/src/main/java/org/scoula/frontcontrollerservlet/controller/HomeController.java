package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://img.freepik.com/premium-vector/addressing-icon_923982-599.jpg");


        return "index";
    }
}
