package com.ewsd.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {


    public static final String DOB_DATE_FORMAT = "d/MM/yyyy";

    public static LocalDate getFormattedDate(String strDate, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.parse(strDate, formatter);
        System.out.println("Date: " + date.toString());
        return date;
    }

    public static String getStringDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }
}
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
