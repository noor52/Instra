//package com.ewsd.config;
//
//
//import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.file.Paths;
//
//import javax.servlet.ServletContext;
//import com.ewsd.service.AttachmentService;
//import org.apache.commons.io.IOUtils;
//import org.slf4j.ILoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Utils {
//
//    @Autowired
//     AttachmentService attachmentService;
//
//
//    @Autowired
//     ServletContext servletContext;
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
////           ILoggerFactory.info("File writing successful.");
//            bufferedOutputStream.close();
//            fileOutputStream.close();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//        return content;
//    }
//}
//
