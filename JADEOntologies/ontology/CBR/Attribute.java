package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* It's a subclass of a defined term
* Protege name: Attribute
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Attribute extends DefinedTerm, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: apliesTo
   */
   public void addApliesTo(Object elem);
   public boolean removeApliesTo(Object elem);
   public void clearAllApliesTo();
   public Iterator getAllApliesTo();
   public List getApliesTo();
   public void setApliesTo(List l);

   /**
   * Protege name: describedBy
   */
   public void addDescribedBy(Object elem);
   public boolean removeDescribedBy(Object elem);
   public void clearAllDescribedBy();
   public Iterator getAllDescribedBy();
   public List getDescribedBy();
   public void setDescribedBy(List l);

}
