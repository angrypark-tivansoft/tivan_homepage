package com.tivansoft.tivan_homepage.common;

import com.tivansoft.tivan_homepage.common.vo.CommonVO;
import com.tivansoft.tivan_homepage.common.vo.MailVO;
import com.tivansoft.tivan_homepage.utils.MailUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class CommonController {
    @Autowired
    JavaMailSender javaMailSender;
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    private CommonService commonService;

    @PostMapping("/vue/sendmail")
    public String sendmail(@RequestBody MailVO mailVo){

      try {
              MailUtil mailHandler = new MailUtil(javaMailSender);
              // 받는 사람
              mailHandler.setTo("cs@tivansoft.com");
              // 보내는 사람
              mailHandler.setFrom("cs@tivansoft.com");
              // 제목

              mailHandler.setSubject("문의사항");
              // HTML Layout
              String htmlContent = "<p>"+mailVo.getTo()+"<p><br/><p>문의내역:"+mailVo.getMsgType()+"</p><br/><p>"+mailVo.getMsg()+"</p>";
              mailHandler.setText(htmlContent, true);
              // 첨부 파일
              // 이미지 삽입

              mailHandler.send();

      }catch(Exception error){

      }

        return "OK";
    }


    @GetMapping("/vue/selectHisList")
    public Map<String,Object> selectHisList(){
        try {
            return commonService.selectHisList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
