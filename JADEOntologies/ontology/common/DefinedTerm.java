package ontology.common;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Define the terms utilized in the taxonomic  hierarchy
* Protege name: DefinedTerm
* @author ontology bean generator
* @version 2009/09/15, 18:06:25
*/
public interface DefinedTerm extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: definition
   */
   public void setDefinition(String value);
   public String getDefinition();

   /**
   * Protege name: term
   */
   public void setTerm(String value);
   public String getTerm();

}
