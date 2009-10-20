package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* It's a subclass of a defined term
* Protege name: State
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface State extends DefinedTerm, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: describes
   */
   public void addDescribes(Attribute elem);
   public boolean removeDescribes(Attribute elem);
   public void clearAllDescribes();
   public Iterator getAllDescribes();
   public List getDescribes();
   public void setDescribes(List l);

}
