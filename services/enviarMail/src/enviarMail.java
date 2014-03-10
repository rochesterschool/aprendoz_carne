import java.util.Properties;

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

public class enviarMail extends com.wavemaker.runtime.javaservice.JavaServiceSuperClass {

    public String enviarNotificacionFaltaGrave(String motivo, String alumno, String correopadre, String correomadre, String fechahora){
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
            
            message.setSubject("No Reply - Segumiento de ingreso al colegio");
            message.setText(
              "<img src=\"http://www.rochester.edu.co/images/logo.png\">"+"<br/><br/>"+
              "NOTIFICACIÓN - COLEGIO ROCHESTER<br/><br/>"+
              "<b>Respetados padres de familia.</b><br/>"+
              "Queremos notificarle(s) que su hijo(a) "+alumno+" no presento el carné en el ingreso/salida de la institución:<br><br>"+
              "A continuación se detalla el evento:<br/>"+
              "Fecha y hora: "+fechahora+"<br/>"+
              "Motivo : "+motivo+"<br/>"+
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