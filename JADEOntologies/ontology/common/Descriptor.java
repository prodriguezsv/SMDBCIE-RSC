package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Descriptor
* @author ontology bean generator
* @version 2009/09/15, 18:06:25
*/
public interface Descriptor extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

   /**
   * Protege name: structure
   */
   public void setStructure(Object value);
   public Object getStructure();

   /**
   * Protege name: score
   */
   public void addScore(Object elem);
   public boolean removeScore(Object elem);
   public void clearAllScore();
   public Iterator getAllScore();
   public List getScore();
   public void setScore(List l);

}
