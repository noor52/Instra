//package com.ewsd.controllers;
//
//import com.ewsd.config.Properties;
//import com.ewsd.model.User;
//import com.ewsd.service.AttachmentService;
//import com.ewsd.service.UserService;
//
//import org.apache.commons.io.IOUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.*;
//import java.nio.file.Paths;
//import java.util.logging.Logger;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class AdminController {
//
//    @Autowired
//    UserService userService;
//
//
//
//    @Autowired
//    AttachmentService attachmentService;
//
//
//    @Autowired
//    ServletContext servletContext;
//
//
//
////    @Autowired
////     Utils utils;
//
////    @GetMapping("/set-terms-and-conditions")
////    public String setTermsAndConditions_GET(Model model, /*HttpSession session,*/ Authentication auth) {
////        var username = auth.getName();
////        model.addAttribute("user", username);
//////        String tNc = utils.readFile("/TermsAndConditions.txt");
//////        model.addAttribute("tNc", tNc);
////        model.addAttribute("pageName", "terms-and-conditions");
////        return "/terms_and_conditions";
////    }
////
////
////
////    @PostMapping("/set-terms-and-conditions")
////    public String setTermsAndConditions_POST(Model model, Authentication auth, @RequestParam("editor1") String tc) {
//////        User user = (User) session.getAttribute("user");
////        var username = auth.getName();
////        model.addAttribute("user", username);
////        model.addAttribute("pageName", "terms-and-conditions");
//////        tc = utils.writeFile("/TermsAndConditions.txt", tc);
////        model.addAttribute("tNc", tc);
////        return"/terms_and_conditions";
////    }
//
////    @RequestMapping(value = "/mainul", method = RequestMethod.GET)
////    public String setTermsAndConditions_GET(Model model, HttpSession session) {
////        User user = (User) session.getAttribute("usr");
////        model.addAttribute("user", user);
////        String tNc = readFile("/TermsAndConditions.txt");
////        model.addAttribute("tNc", tNc);
////        model.addAttribute("pageName", "terms-and-conditions");
////        return "/terms_and_conditions";
////    }
////
////    @RequestMapping(value = "/mainul", method = RequestMethod.POST)
////    public String setTermsAndConditions_POST(Model model, HttpSession session, @RequestParam("editor1") String tc) {
////        User user = (User) session.getAttribute("usr");
////        model.addAttribute("user", user);
////        model.addAttribute("pageName", "terms-and-conditions");
////        tc = writeFile("/TermsAndConditions.txt", tc);
////        model.addAttribute("tNc", tc);
////        return "/terms_and_conditions";
////    }
//
//
//    @RequestMapping(value = "/set-terms-and-conditions", method = RequestMethod.GET)
//    public String setTermsAndConditions_GET(Model model, HttpSession session) {
//        UserEntity userEntity = (UserEntity) session.getAttribute("usr");
//        model.addAttribute("usr", userEntity);
//        String tNc = utils.readFile("/TermsAndConditions.txt");
//        model.addAttribute("tNc", tNc);
//        model.addAttribute("pageName", "terms-and-conditions");
//        return "/admin_template/terms_and_conditions";
//    }
//
//    @RequestMapping(value = "/set-terms-and-conditions", method = RequestMethod.POST)
//    public String setTermsAndConditions_POST(Model model, HttpSession session, @RequestParam("editor1") String tc) {
//        UserEntity userEntity = (UserEntity) session.getAttribute("usr");
//        model.addAttribute("usr", userEntity);
//        model.addAttribute("pageName", "terms-and-conditions");
//        tc = utils.writeFile("/TermsAndConditions.txt", tc);
//        model.addAttribute("tNc", tc);
//        return "/admin_template/terms_and_conditions";
//    }
//
//
//    public String readFile(String fileName) {
//        BufferedReader br = null;
//        String content = null;
//        File dir = null;
//
//        try {
//            dir = Paths.get(Properties.TEMP_PATH).toFile();
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//            dir = new File(Properties.TEMP_PATH + fileName);
//
//            if (dir.isFile()) {
//
//                br = new BufferedReader(new FileReader(dir));
//
//                StringBuilder sb = new StringBuilder();
//                String line = br.readLine();
//
//                while (line != null) {
//                    sb.append(line);
//                    sb.append(System.lineSeparator());
//                    line = br.readLine();
//                }
//
//                content = sb.toString();
//                System.out.println(content);
//                br.close();
//            } else {
//                content = "";
//            }
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return content;
//    }
//
//    public byte[] readFile(Long fileId) throws IOException {
//        String attachmentUrl = attachmentService.readAttachment(fileId).getFileURL();
//        InputStream in = null;
//        if (servletContext.getResourceAsStream(attachmentUrl) == null) {
//            in = new FileInputStream(new File(Properties.READ_FROM_PATH + attachmentUrl));
//        } else {
//            in = servletContext.getResourceAsStream(attachmentUrl);
//        }
////        if(attachmentUrl.equals(null)){
////            in = new FileInputStream(new File(Properties.READ_FROM_PATH + attachmentUrl));
////        }
//
//        return IOUtils.toByteArray(in);
//    }
//
//    public String writeFile(String fileName, String content) {
//        File file = null;
//        FileOutputStream fileOutputStream = null;
//        BufferedOutputStream bufferedOutputStream = null;
//
//        try {
//            file = new File(Properties.TEMP_PATH + fileName);
//            fileOutputStream = new FileOutputStream(file);
//            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            bufferedOutputStream.write(content.getBytes());
//
////           Logger.info("File writing successful.");
//            bufferedOutputStream.close();
//            fileOutputStream.close();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//        return content;
//    }
//
//}
