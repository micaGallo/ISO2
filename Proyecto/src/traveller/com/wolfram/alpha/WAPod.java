/*
 * Created on Nov 10, 2009
 *
 */
package traveller.com.wolfram.alpha;


import traveller.com.wolfram.alpha.visitor.Visitable;



public interface WAPod extends Visitable {

    String getTitle();
    
    boolean isError();
    
    int getNumSubpods();
    
    String getScanner();
    
    int getPosition();
    
    String getID();
    
    String getAsyncURL();
    
    WAException getAsyncException();
    
    WASubpod[] getSubpods();
    
    WAPodState[] getPodStates();
    
    WAInfo[] getInfos();

    WASound[] getSounds();
    
    void acquireImages() throws WAException;
    
    void finishAsync() throws WAException;
    
    
    void setUserData(Object obj);
    
    Object getUserData();
   
}
