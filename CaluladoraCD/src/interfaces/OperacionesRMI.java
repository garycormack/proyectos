/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.rmi.RemoteException;
import java.rmi.Remote;
/**
 *
 * @author Carlos
 */
public interface OperacionesRMI extends Remote {
    
        
    public double sumar(double a, double b) throws RemoteException;
    public double restar(double a, double b) throws RemoteException;
    public double multiplicar(double a, double b) throws RemoteException;
    public double dividir(double a, double b) throws RemoteException;
    
}
