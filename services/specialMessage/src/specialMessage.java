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
public class specialMessage extends JavaServiceSuperClass {
   public String enviarNotificacionAlmuerzo(String motivo, String alumno, String correopadre, String correomadre, String fechahora){
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
                  Message.RecipientType.TO, new InternetAddress(correopadre));
               message.addRecipient(
                  Message.RecipientType.TO, new InternetAddress(correomadre));
               message.addRecipient(
                  Message.RecipientType.TO, new InternetAddress("eventualidades@rochester.edu.co"));                    
            
            message.setSubject("No Reply - Segumiento de toma de almuerzos");
            message.setText(
              "<img src=\"http://www.rochester.edu.co/images/logo.png\">"+"<br/><br/>"+
              "NOTIFICACIÓN - COLEGIO ROCHESTER<br/><br/>"+
              "<b>Respetado padre de familia</b><br/>"+
              "Queremos notificarle que su hijo(a) "+alumno+" solicitó el día de hoy "+fechahora+" una manilla / carné por lo cual se le cargará a la mensualidad del siguiente mes el valor de dicho elemento:<br><br>"+
              "<br/><br/>"+
              "Motivo : "+motivo+"<br/><br/>"+
              "El procedimiento de reemplazo de manilla o carné va de acuerdo al comunicado enviado por rectoría el 31 de Enero de 2014. Cualquier inquietud por favor comunicarse con el coordinador de grupo o la dirección de nivel.<br/>"+
              "<br/>"+
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
