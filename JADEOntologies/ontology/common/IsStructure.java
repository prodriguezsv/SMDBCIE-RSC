package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: IsStructure
* @author ontology bean generator
* @version 2009/10/17, 11:59:53
*/
public interface IsStructure extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: structure
   */
   public void setStructure(Object value);
   public Object getStructure();

}
