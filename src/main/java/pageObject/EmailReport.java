//package pageObject;
//import base.BaseClass;
//
//import javax.mail.BodyPart;
//import javax.mail.Session; import javax.mail.Transport; import java.util.Properties; import javax.activation.DataHandler; import javax.mail.Message; import javax.mail.MessagingException; import javax.mail.Multipart; import javax.mail.PasswordAuthentication; import javax.activation.DataSource; import javax.activation.FileDataSource;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
//import static java.net.HttpCookie.parse;
//
//
//public class EmailReport extends BaseClass {
//        public static void main(String[] args) {
//            // instance of Properties class
//            Properties p = new Properties();
//            // configure host server
//            p.put("mail.smtp.host", "smtp.yahoo.com");
//            // configure socket port p.put("mail.smtp.socketFactory.port", "529");
//            // configure socket factory
//            p.put ("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//            // configure true authentication p.put("mail.smtp.auth", "true");
//            // configure smtp port
//            p.put("mail.smtp.port", "465");
//            // authentication with Session class
//            Session s= Session.getDefaultInstance(p, new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication("mail id", "password");
//                }
//            });
//            try {
//                // instance of MimeMessage
//                Message m = new MimeMessage(s);
//                // address of Form
//
//                m.setFrom(new ("test12@yahoo.com"));
//                //address of recipient m.setRecipients(Message.RecipientType.TO,InternetAddress.
//                parse("test13@yahoo.com"));
//                // email subject text
//                m.setSubject("Email Report");
//                // configure multi-media email
//                BodyPart b = new MimeBodyPart();
//                // email body text
//                b.setText("Overall Selenium Test Report");
//                // configure multi-media email for another text BodyPart b1 = new MimeBodyPart();
//                // name of file to be attached to email
//                String s = "C:\TestResults.xlsx";
//                // pass filename
//                DataSource sr= new FileDataSource(s);
//                // set the handler
//                b2.setDataHandler(new DataHandler(sr));
//                // configure file
//                b2.setFileName(s);
//                // instance of class MimeMultipart
//                Multipart mm = new MimeMultipart();
//                // adding body texts
//                mm.addBodyPart(b1);
//                mm.addBodyPart(b);
//                // add email content
//                m.setContent(mm);
//                // email sending
//                Transport.send(m);
//                System.out.println("MAIL TRIGGERED");
//            } catch (MessagingException ex) {
//                throw new RuntimeException(ex);
//            }
//        }
//    }
//
//
//
//
//}
