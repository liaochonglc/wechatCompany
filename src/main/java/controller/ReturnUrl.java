package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import util.UrlUtil;
//https://blog.csdn.net/u010486495/article/details/73287470

@RequestMapping("/auth")
public class ReturnUrl {
    @RequestMapping("/auth")
    public String auth() throws Exception {
        String message = UrlUtil.getMessage("https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + "&redirect_uri=" + "&response_type=code&scope=");
        //如果返回的是json的话
        JSONObject jsonObject = new JSONObject(message);
        return null;
    }
}
