package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: RangeValue
* @author ontology bean generator
* @version 2009/10/17, 11:59:53
*/
public interface RangeValue extends Value, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: upperBound
   */
   public void setUpperBound(float value);
   public float getUpperBound();

   /**
   * Protege name: lowerBound
   */
   public void setLowerBound(float value);
   public float getLowerBound();

}
