package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Owns
* @author ontology bean generator
* @version 2009/10/7, 18:01:56
*/
public interface Owns extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: descriptiveElement
   */
   public void setDescriptiveElement(Object value);
   public Object getDescriptiveElement();

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

}
