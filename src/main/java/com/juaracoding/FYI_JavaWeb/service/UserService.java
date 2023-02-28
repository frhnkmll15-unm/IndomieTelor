package com.juaracoding.FYI_JavaWeb.service;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/27/2023 10:35 PM
@Last Modified 2/27/2023 10:35 PM
Version 1.0
*/

import com.juaracoding.FYI_JavaWeb.configuration.OtherConfig;
import com.juaracoding.FYI_JavaWeb.core.BcryptImpl;
import com.juaracoding.FYI_JavaWeb.model.User;
import com.juaracoding.FYI_JavaWeb.repo.UserRepo;
import com.juaracoding.FYI_JavaWeb.utils.LoggingFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional
public class UserService {

    private UserRepo userRepo;

    private String [] strExceptionArr = new String[2];

    @Autowired
    public UserService(UserRepo userService) {
        strExceptionArr[0] = "UserService";
        this.userRepo = userService;
    }

    public String checkRegis(User userz) throws Exception {
        int intVerification = new Random().nextInt(100000,999999);
        List<User> listUserResult = userRepo.findByEmail(userz.getEmail());
//        User listUserResult = userRepo.findByEmail(userz.getEmail()).orElseThrow(
//                ()->null
//        );
        try
        {
            if(listUserResult.size()!=0)//kondisi mengecek apakah user terdaftar
//            if(listUserResult!=null)//kondisi mengecek apakah user terdaftar
            {
                if(listUserResult.get(0).getIsDelete()!=0)//sudah terdaftar dan aktif
//                if(listUserResult.getIsDelete()!=0)//sudah terdaftar dan aktif
                {
                    return "";
                }
            }
            else//belum terdaftar
            {
                userz.setPassword(BcryptImpl.hash(userz.getPassword()));
                userz.setToken(BcryptImpl.hash(String.valueOf(intVerification)));
                userRepo.save(userz);
            }
//            String [] strEmail = {userz.getEmail()};
//            SMTPCore sc = new SMTPCore();
//            ConfigProperties.getEmailPassword();
//            System.out.println(sc.sendMailWithAttachment(strEmail,
//                    "DEMO REGISTRATION -- TOKEN : "+intVerification,
//                    new ReadTextFileSB("\\data\\template-BCAF.html").getContentFile(),
//                    "SSL",
//                    new String[] {ResourceUtils.getFile("classpath:\\data\\sample.docx").getAbsolutePath()}));
            System.out.println("VERIFIKASI -> "+intVerification);
        }catch (Exception e)
        {
            System.out.println(e.getMessage()+" ---- "+e.getLocalizedMessage()+" ---- "+e.getCause());
            strExceptionArr[1]="checkRegis(User userz) --- LINE 62";
            LoggingFile.exceptionStringz(strExceptionArr,e, OtherConfig.getFlagLogging());
        }

        return userz.getEmail();//belum terdaftar ataupun sudah terdaftar namun belum aktif
    }
}