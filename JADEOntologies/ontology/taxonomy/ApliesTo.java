package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: ApliesTo
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface ApliesTo extends jade.content.Predicate, Serializable {
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
