package com.example.servingwebcontent.Interfase;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface FailInterface {

    void getFile(HttpSession session, HttpServletResponse response, String dir, String name)throws Exception;
    
}
