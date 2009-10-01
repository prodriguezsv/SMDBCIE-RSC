package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: QuantitativeCharacterDescriptor
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface QuantitativeCharacterDescriptor extends CharacterDescriptor, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
