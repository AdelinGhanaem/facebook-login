package com.thecoderider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adelin_Ghanayem on 19-Apr-17.
 */
@Controller
@RequestMapping("/")
public class FacebookController {


    private static final String CLIENT_ID = "197173944127594";
    private static final String REDIRECT_URL = "";

    @RequestMapping(path = "login")
    public String login() {
        return "redirect:https://www.facebook.com/dialog/oauth?client_id=197173944127594&redirect_uri=localhost:8080/catch_code";
    }

    @RequestMapping("catch_code")
    public String catchCode(@RequestParam("code") String code) {
//        String getTokenUrl = "https://graph.facebook.com/v2.8/oauth/access_token?client_id=" +CLIENT_ID+"&redirect_uri="++"&client_secret="

        return null;

    }


}
