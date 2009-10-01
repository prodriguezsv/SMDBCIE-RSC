package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: SVCharacterDescriptor
* @author ontology bean generator
* @version 2009/09/30, 12:55:44
*/
public interface SVCharacterDescriptor extends QuantitativeCharacterDescriptor, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
