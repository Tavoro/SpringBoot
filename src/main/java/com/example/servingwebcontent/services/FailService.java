package com.example.servingwebcontent.services;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface FailService {

    void getFile(HttpSession session, HttpServletResponse response, String dir, String name) throws Exception;
    //ZAEBAL
}
