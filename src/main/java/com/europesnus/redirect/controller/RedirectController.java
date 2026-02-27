package com.europesnus.redirect.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    private static final String TARGET_AFFILIATE_LINK = "https://europesnus.com/?ref=dqwoljsv";

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        if (request.getParameter("gclid") != null) {
            return "redirect:" + TARGET_AFFILIATE_LINK;
        }
        return "index";
    }

    @GetMapping({ "/plugin", "/plugin/" })
    public String plugin(HttpServletRequest request) {
        if (request.getParameter("gclid") != null) {
            return "redirect:" + TARGET_AFFILIATE_LINK;
        }
        return "plugin";
    }
}
