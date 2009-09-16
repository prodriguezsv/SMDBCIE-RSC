package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: SingleValue
* @author ontology bean generator
* @version 2009/09/16, 12:02:11
*/
public interface SingleValue extends Value, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: value
   */
   public void setValue(float value);
   public float getValue();

}
