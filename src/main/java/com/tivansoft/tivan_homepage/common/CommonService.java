package com.tivansoft.tivan_homepage.common;

import com.tivansoft.tivan_homepage.common.vo.CommonVO;
import com.tivansoft.tivan_homepage.common.vo.MailVO;
import com.tivansoft.tivan_homepage.utils.MailUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommonService {
    @Autowired
    private CommonMapper mapper;

    public Map<String, Object> selectHisList() throws Exception {
        Map<String, Object> list = new HashMap<>();
        List<CommonVO> selectHisList = mapper.selectHisList();
        list.put("selectHisList",selectHisList);
        return list;
    }


}
