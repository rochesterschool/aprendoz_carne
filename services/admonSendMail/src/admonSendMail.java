import com.wavemaker.runtime.javaservice.JavaServiceSuperClass;
import com.wavemaker.runtime.service.annotations.ExposeToClient;

import javax.mail.MessagingException;
import javax.mail.Message;
import javax.mail.Message.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.net.*;

@ExposeToClient
public class admonSendMail extends JavaServiceSuperClass {
     public String enviarNotificacionAlmuerzoDocentes(String motivo, String admon, String fechahora){
     try{
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "eventualidades@rochester.edu.co");
            props.setProperty("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("eventualidades@rochester.edu.co"));   
               message.addRecipient(
                  Message.RecipientType.TO, new InternetAddress("eventualidades@rochester.edu.co")); 
               message.addRecipient(
                  Message.RecipientType.TO, new InternetAddress("dmalba@rochester.edu.co"));      
            
            message.setSubject("No Reply - Registro y control de acceso.");
            message.setText(
              "<img src=\"http://www.rochester.edu.co/images/logo.png\">"+"<br/><br/>"+
              "REGISTRO Y CONTROL DE ACCESO - COLEGIO ROCHESTER<br/><br/>"+
              "<b>Apreciado Director Administrativo: </b><br/>"+
              "Queremos notificarle que "+admon+" no presentó el carné en el ingreso/salida de las instalaciones del colegio en la fecha "+fechahora+".<br><br>"+
              "Motivo : "+motivo+"<br/><br/>"+
              "Agradecemos su atención,<br><br>"+           
              "Aprendoz Colegio Rochester","ISO-8859-1","html");          
            Transport t = session.getTransport("smtp");
            t.connect("eventualidades@rochester.edu.co", "Rochester1959+");
            t.sendMessage(message, message.getAllRecipients());
            t.close();      
        }catch (Exception e){
        e.printStackTrace();
     }
     return "ok";
   }     
}
