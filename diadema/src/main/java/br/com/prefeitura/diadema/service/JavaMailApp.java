package br.com.prefeitura.diadema.service;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailApp


/*
 * 
 * mail.charset=iso-8859-1
mail.contentType=text/html
mail.failureGroup=3-1
#mail.senderemail=informativo@diadema.sp.gov.br
mail.senderemail=vre.eletronico@diadema.sp.gov.br
mail.smtp.auth=false
mail.smtp.host=10.1.2.88
#mail.smtp.password=agilespmd!32
mail.smtp.password=diadema@10
mail.smtp.port=25
mail.smtp.username=vre.eletronico@diadema.sp.gov.br
mail.suffix=<br><b>*** Mensagem enviada pelo servidor da Prefeitura de Diadema ***</b><br><br>Por favor, nÃ£o responda a este e-mail - que foi gerada a partir de uma conta que envia mensagens automaticamente e nÃ£o pode receber respostas de volta.


 * 
 * 
 * */

{
  public static void main(String[] args) {
    Properties props = new Properties();
    /** Parâmetros de conexão com servidor Gmail */
    props.put("mail.smtp.host", "10.1.2.88");
    props.put("mail.smtp.socketFactory.port", "25");
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "25");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication("vre.eletronico@diadema.sp.gov.br", "diadema@10");
           }
      });

    /** Ativa Debug para sessão */
    session.setDebug(true);

    try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("vre.eletronico@diadema.sp.gov.br"));
      //Remetente

      Address[] toUser = InternetAddress.parse("anderson.oliveira@diadema.sp.gov.br");

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject("[Teste de envio de e-mail]");//Assunto
      message.setText("Enviei este email utilizando JavaMail com   minha conta PELO JAVA!");
      /**Método para enviar a mensagem criada*/
      Transport.send(message);

      System.out.println("Feito!!!");

     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
  }
}