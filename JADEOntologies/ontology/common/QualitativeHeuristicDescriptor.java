package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: QualitativeHeuristicDescriptor
* @author ontology bean generator
* @version 2009/10/17, 11:59:53
*/
public interface QualitativeHeuristicDescriptor extends HeuristicDescriptor, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

}
