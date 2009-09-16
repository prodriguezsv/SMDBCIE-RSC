package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Owns
* @author ontology bean generator
* @version 2009/09/16, 12:02:11
*/
public interface Owns extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

   /**
   * Protege name: descriptiveElement
   */
   public void setDescriptiveElement(Object value);
   public Object getDescriptiveElement();

}
