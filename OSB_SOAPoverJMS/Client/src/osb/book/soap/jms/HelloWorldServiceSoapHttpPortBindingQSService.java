package osb.book.soap.jms;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Sat Jun 11 22:38:08 CEST 2011  
 */

public interface HelloWorldServiceSoapHttpPortBindingQSService extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: HelloWorldServiceSoapHttpPortBindingQSPort  
     // Port Type: HelloWorldService   
     //***********************************
     
  /**
   * returns HelloWorldServiceSoapHttpPortBindingQSPort port in this service 
   */
  osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password);
   */
  osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(String username, String password) throws javax.xml.rpc.ServiceException;

  osb.book.soap.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }