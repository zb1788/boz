package com.boz.web;

import com.boz.common.utils.Vcom_3DES;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boz
 * @date 2019/7/8
 */
@RestController
public class StartController {

    @GetMapping("/test")
    public String test(){
        Vcom_3DES vcom3DES = new Vcom_3DES("vcommenhutuwenandotheros");
        vcom3DES.setIsEncrypt(1);
        vcom3DES.setMessage("ssotest.yjt361.com");
        String outStr = vcom3DES.Vcom3DESChiper();
        System.out.println("outStr = " + outStr);
        return outStr;
    }
}
